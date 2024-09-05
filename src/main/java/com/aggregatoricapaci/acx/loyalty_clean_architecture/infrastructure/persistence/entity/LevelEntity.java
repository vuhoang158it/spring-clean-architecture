package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.math.BigDecimal;

@Entity
@Table(name = "level", schema = "loyalty")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LevelEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "condition_value")
    private BigDecimal conditionValue;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "customers_count")
    private Integer customersCount = 0;

    @Column(name = "min_order")
    private BigDecimal minOrder;

    @Column(name = "reward_name")
    private String rewardName;

    @Column(name = "reward_value")
    private BigDecimal rewardValue;

    @Column(name = "reward_code")
    private String rewardCode;

    @Column(name = "photo_path")
    private String photoPath;

    @Column(name = "photo_original_name")
    private String photoOriginalName;

    @Column(name = "photo_mime")
    private String photoMime;

    @Column(name = "tenant_id")
    private String tenantId;
}
