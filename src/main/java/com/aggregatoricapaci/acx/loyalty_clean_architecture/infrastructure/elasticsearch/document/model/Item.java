package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model;

import lombok.Data;

import java.util.List;
@Data
public class Item {
    private Sku sku;
    private String name;
    private int quantity;
    private float grossValue;
    private String category;
    private String maker;
    private List<Label> labels;
}
