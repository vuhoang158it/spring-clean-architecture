package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBasicData implements Serializable {
    private String externalUserId;
    private String email;
    private String name;
    private String nip;
    private String phone;
    private String loyaltyCardNumber;
    private Address address;
}