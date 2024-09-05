package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto;

import java.math.BigDecimal;
import java.util.List;

public interface ILevelResponseData {
    String id();

    Boolean active();

    BigDecimal conditionValue();

    Integer customersCount();

    BigDecimal minOrder();

    String rewardName();

    BigDecimal rewardValue();

    String rewardCode();

    String photoPath();

    String photoOriginalName();

    String photoMime();

    String tenantId();

    List<ILevelSpecialRewardResponseData> specialRewards();
}
