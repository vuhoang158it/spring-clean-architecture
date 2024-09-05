package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.request;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelCreateData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelSpecialRewardCreateData;

import java.math.BigDecimal;
import java.util.List;

public record LevelCreateData(
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
        List<ILevelSpecialRewardCreateData> specialRewards
) implements ILevelCreateData {
}
