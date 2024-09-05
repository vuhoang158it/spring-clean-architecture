package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.repository;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelSpecialRewardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LevelSpecialRewardRepository extends JpaRepository<LevelSpecialRewardEntity, String> {
    @Query(nativeQuery = true,
            value = """
                    SELECT *\s
                    FROM loyalty.level_special_rewards lsr\s
                    WHERE lsr .level_id = ?1""")
    List<LevelSpecialRewardEntity> findByLevelId(String levelId);
}
