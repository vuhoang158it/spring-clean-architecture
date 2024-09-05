package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.controller.mapper;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.request.LevelCreateData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response.LevelResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelCreateData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelSpecialRewardCreateData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelSpecialRewardResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.LevelSpecialReward;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LevelMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
//            @Mapping(target = "conditionValue", source = "conditionValue"),
            @Mapping(target = "active", expression = "java(levelCreateData.active())"),
//            @Mapping(target = "customersCount", source = "customersCount"),
//            @Mapping(target = "minOrder", source = "minOrder"),
//            @Mapping(target = "rewardName", source = "rewardName"),
//            @Mapping(target = "rewardValue", source = "rewardValue"),
//            @Mapping(target = "rewardCode", source = "rewardCode"),
//            @Mapping(target = "photoPath", source = "photoPath"),
//            @Mapping(target = "photoOriginalName", source = "photoOriginalName"),
//            @Mapping(target = "photoMime", source = "photoMime"),
//            @Mapping(target = "tenantId", source = "tenantId"),
            @Mapping(target = "specialRewards", ignore = true),
//            @Mapping(target = "specialRewards", qualifiedByName = "toSpecialRewardResponseDataList")
    })
    Level toDomain(final ILevelCreateData levelCreateData);

    @BeforeMapping
    default void toDomainBefore( @MappingTarget Level level, ILevelCreateData levelCreateData) {
        level.setSpecialRewards(toSpecialRewardResponseDataList(levelCreateData.specialRewards()));
    }

    @Named("toSpecialRewardResponseData")

    LevelSpecialReward toSpecialRewardResponseData(final ILevelSpecialRewardCreateData specialReward);

    @IterableMapping(qualifiedByName = "toSpecialRewardResponseData")
    List<LevelSpecialReward> toSpecialRewardResponseDataList(final List<ILevelSpecialRewardCreateData> specialRewards);

//    @Mappings({
//            @Mapping(target = "id", source = "id"),
//            @Mapping(target = "conditionValue", source = "conditionValue"),
//            @Mapping(target = "active", source = "active"),
//            @Mapping(target = "customersCount", source = "customersCount"),
//            @Mapping(target = "minOrder", source = "minOrder"),
//            @Mapping(target = "rewardName", source = "rewardName"),
//            @Mapping(target = "rewardValue", source = "rewardValue"),
//            @Mapping(target = "rewardCode", source = "rewardCode"),
//            @Mapping(target = "photoPath", source = "photoPath"),
//            @Mapping(target = "photoOriginalName", source = "photoOriginalName"),
//            @Mapping(target = "photoMime", source = "photoMime"),
//            @Mapping(target = "tenantId", source = "tenantId")
//    })
//    LevelResponseData toResponse(final Level level);
}
