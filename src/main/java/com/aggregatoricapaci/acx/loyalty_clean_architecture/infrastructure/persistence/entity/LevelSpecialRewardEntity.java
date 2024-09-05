package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity;


import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "level_special_rewards", schema = "loyalty")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LevelSpecialRewardEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "special_reward_id")
    private String specialRewardId;

    @Column(name = "level_id")
    private String levelId;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "code")
    private String code;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "start_at")
    private LocalDateTime startAt;

    @Column(name = "end_at")
    private LocalDateTime endAt;
}
