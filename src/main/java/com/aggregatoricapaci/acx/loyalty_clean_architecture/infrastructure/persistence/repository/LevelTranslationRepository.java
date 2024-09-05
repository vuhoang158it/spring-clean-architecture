package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.repository;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelTranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LevelTranslationRepository extends JpaRepository<LevelTranslationEntity, Integer> {
}
