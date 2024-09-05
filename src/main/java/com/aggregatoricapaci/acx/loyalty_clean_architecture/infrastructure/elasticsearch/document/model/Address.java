package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
    @Field(type = FieldType.Text)
    private String street;
    @Field(type = FieldType.Text)
    private String address1;
    private String address2;
    @Field(type = FieldType.Text)
    private String province;
    private String postal;
    @Field(type = FieldType.Text)
    private String country;
}
