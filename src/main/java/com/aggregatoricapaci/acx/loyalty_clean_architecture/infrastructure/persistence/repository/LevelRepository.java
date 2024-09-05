package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.repository;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<LevelEntity, String> {
}
