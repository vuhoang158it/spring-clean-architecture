package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.impl;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelEntity;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.gateway.ILevelGateway;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelSpecialRewardEntity;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.mapper.LevelEntityMapper;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.repository.LevelRepository;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.repository.LevelSpecialRewardRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class LevelGatewayImpl implements ILevelGateway {

    private final LevelRepository levelRepository;

    private final LevelSpecialRewardRepository levelSpecialRewardRepository;

    private final LevelEntityMapper levelEntityMapper;

    @PersistenceContext
    private final EntityManager entityManager;

    public LevelGatewayImpl(LevelRepository levelRepository, LevelSpecialRewardRepository levelSpecialRewardRepository, LevelEntityMapper levelEntityMapper, EntityManager entityManager) {
        this.levelRepository = levelRepository;
        this.levelSpecialRewardRepository = levelSpecialRewardRepository;
        this.levelEntityMapper = levelEntityMapper;
        this.entityManager = entityManager;
    }

    @Override
    public void create(Level level) {
        // Có thể sử dụng mapper để chuyển đổi giữa entity và model
        LevelEntity entity = levelEntityMapper.toEntity(level);
        levelRepository.save(entity);
        String levelId = entity.getId();
        if (!CollectionUtils.isEmpty(level.getSpecialRewards())) {
            level.getSpecialRewards().forEach(specialReward -> {
                LevelSpecialRewardEntity specialRewardEntity = new LevelSpecialRewardEntity();
                specialRewardEntity.setLevelId(levelId);
                specialRewardEntity.setActive(specialReward.isActive());
                specialRewardEntity.setCode(specialReward.getCode());
                specialRewardEntity.setName(specialReward.getName());
                specialRewardEntity.setValue(specialReward.getValue());
                specialRewardEntity.setStartAt(specialReward.getStartAt());
                specialRewardEntity.setEndAt(specialReward.getEndAt());
                levelSpecialRewardRepository.save(specialRewardEntity);
            });
        }
    }

    @Override
    public void update(Level customer) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Level> findById(String id) {
        Optional<LevelEntity> entity = this.levelRepository.findById(id);
        if (entity.isPresent()) {
            Level domain = levelEntityMapper.toDomain(entity.get());
            return Optional.of(domain);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public List<Level> findAll() {
        return List.of();
    }

    @Override
    public Optional<Level> findLevelByConditionValueWithTheBiggestReward(Float conditionValue) {
        if (conditionValue == null) {
            conditionValue = 0f;
        }
        Map<String, Object> params = new HashMap<>();
        StringBuilder strQuery = new StringBuilder();
        strQuery.append(" FROM loyalty.level l");
        strQuery.append(" WHERE 1=1");
        strQuery.append(" AND (l.condition_value <= :conditionValue)");
        params.put("conditionValue", conditionValue);
        strQuery.append(" AND (l.active = true)");
        strQuery.append(" ORDER BY l.condition_value DESC, l.reward_value DESC");
        strQuery.append(" LIMIT 1");
        Query query = entityManager.createNativeQuery(" SELECT * %s".formatted(strQuery), Level.class);
        params.forEach(query::setParameter);
        return Optional.of((Level) query.getSingleResult());
    }

    @Override
    public Optional<Level> findNextLevelByConditionValue(Float conditionValue) {
        Map<String, Object> params = new HashMap<>();
        StringBuilder strQuery = new StringBuilder();
        strQuery.append(" FROM loyalty.level l");
        strQuery.append(" WHERE 1=1");
        if (conditionValue != null) {
            strQuery.append(" AND (l.condition_value > :conditionValue)");
            params.put("conditionValue", conditionValue);
        }
        strQuery.append(" AND (l.active = true)");
        strQuery.append(" ORDER BY l.condition_value ASC, l.reward_value DESC");
        strQuery.append(" LIMIT 1");
        Query query = entityManager.createNativeQuery(" SELECT * %s".formatted(strQuery), Level.class);
        params.forEach(query::setParameter);
        return Optional.of((Level) query.getSingleResult());
    }
}
