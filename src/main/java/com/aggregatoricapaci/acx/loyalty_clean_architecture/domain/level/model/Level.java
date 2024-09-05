package com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Level {
    private String id;

    private BigDecimal conditionValue;

    private boolean active;

    private Integer customersCount = 0;

    private BigDecimal minOrder;

    private String rewardName;

    private BigDecimal rewardValue;

    private String rewardCode;

    private String photoPath;

    private String photoOriginalName;

    private String photoMime;

    private String tenantId;

    private List<LevelSpecialReward> specialRewards;

}
