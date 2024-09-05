package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.mapper;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity.LevelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LevelEntityMapper {
    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "conditionValue", source = "conditionValue"),
            @Mapping(target = "active", source = "active"),
            @Mapping(target = "customersCount", source = "customersCount"),
            @Mapping(target = "minOrder", source = "minOrder"),
            @Mapping(target = "rewardName", source = "rewardName"),
            @Mapping(target = "rewardValue", source = "rewardValue"),
            @Mapping(target = "rewardCode", source = "rewardCode"),
            @Mapping(target = "photoPath", source = "photoPath"),
            @Mapping(target = "photoOriginalName", source = "photoOriginalName"),
            @Mapping(target = "photoMime", source = "photoMime"),
            @Mapping(target = "tenantId", source = "tenantId"),
            @Mapping(target = "specialRewards", ignore = true)
    })
    Level toDomain(final LevelEntity customer);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "conditionValue", source = "conditionValue"),
            @Mapping(target = "active", source = "active"),
            @Mapping(target = "customersCount", source = "customersCount"),
            @Mapping(target = "minOrder", source = "minOrder"),
            @Mapping(target = "rewardName", source = "rewardName"),
            @Mapping(target = "rewardValue", source = "rewardValue"),
            @Mapping(target = "rewardCode", source = "rewardCode"),
            @Mapping(target = "photoPath", source = "photoPath"),
            @Mapping(target = "photoOriginalName", source = "photoOriginalName"),
            @Mapping(target = "photoMime", source = "photoMime"),
            @Mapping(target = "tenantId", source = "tenantId")
    })
    LevelEntity toEntity(final Level customer);
}
