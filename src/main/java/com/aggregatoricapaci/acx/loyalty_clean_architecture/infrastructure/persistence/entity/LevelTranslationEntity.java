package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.persistence.entity;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serial;
import java.util.Objects;

@Entity
@Table(name = "level_translation", schema = "loyalty")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LevelTranslationEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "translatable_id")
    private String translatableId;

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "locale")
    private String locale;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        LevelTranslationEntity that = (LevelTranslationEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}