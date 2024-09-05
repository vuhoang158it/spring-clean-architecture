package com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.gateway;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;

import java.util.List;
import java.util.Optional;

public interface ILevelGateway {
    void create(Level level);

    void update(Level level);

    void delete(Long id);

    Optional<Level> findById(String id);

    List<Level> findAll();

    Optional<Level> findLevelByConditionValueWithTheBiggestReward(Float conditionValue);

    Optional<Level> findNextLevelByConditionValue(Float conditionValue);
}
