package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
@Data
public class Label implements Serializable {
    @Field(type = FieldType.Text)
    private String key;
    @Field(type = FieldType.Text)
    private String value;
}
