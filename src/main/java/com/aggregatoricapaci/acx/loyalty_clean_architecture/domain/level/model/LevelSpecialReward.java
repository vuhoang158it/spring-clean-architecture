package com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class LevelSpecialReward {
    private String specialRewardId;
    private String levelId;
    private String name;
    private BigDecimal value;
    private String code;
    private boolean active;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
}
