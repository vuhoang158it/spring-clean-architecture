package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response;


import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelSpecialRewardResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;

import java.math.BigDecimal;
import java.util.List;

public record LevelResponseData(
        String id,
        Boolean active,
        BigDecimal conditionValue,
        Integer customersCount,
        BigDecimal minOrder,
        String rewardName,
        BigDecimal rewardValue,
        String rewardCode,
        String photoPath,
        String photoOriginalName,
        String photoMime,
        String tenantId,
        List<ILevelSpecialRewardResponseData> specialRewards
) implements ILevelResponseData {
    public LevelResponseData(Level level) {
        this(
                level.getId(),
                level.isActive(),
                level.getConditionValue(),
                level.getCustomersCount(),
                level.getMinOrder(),
                level.getRewardName(),
                level.getRewardValue(),
                level.getRewardCode(),
                level.getPhotoPath(),
                level.getPhotoOriginalName(),
                level.getPhotoMime(),
                level.getTenantId(),
                List.of()
        );
    }
}
