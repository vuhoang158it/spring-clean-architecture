package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ILevelSpecialRewardResponseData {
    String specialRewardId();

    String levelId();

    String name();

    BigDecimal value();

    String code();

    Boolean active();

    LocalDateTime startAt();

    LocalDateTime endAt();
}
