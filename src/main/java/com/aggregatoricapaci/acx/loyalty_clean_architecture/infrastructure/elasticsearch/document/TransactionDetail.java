package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model.CustomerBasicData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model.Item;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.model.Label;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(indexName = "loyalty.transaction-detail")
@Setting(settingPath = "/elasticsearch/setting/general.setting.json")
public class TransactionDetail {
    @Id
    @Field(type = FieldType.Keyword)
    private String id;
    @Field(type = FieldType.Keyword)
    private String documentType;
    @Field(type = FieldType.Keyword)
    private String documentNumber;
    @Field(type = FieldType.Date)
    private Long purchaseDate;
    @Field(type = FieldType.Text)
    private String purchasePlace;
    @Field(type = FieldType.Keyword)
    private String customerId;
    @Field(type = FieldType.Keyword)
    private String tenantId;
    @Field(type = FieldType.Nested)
    private CustomerBasicData customerData;
    @Field(type = FieldType.Nested)
    private List<Item> items = new ArrayList<>();
    @Field(type = FieldType.Nested)
    private List<Label> labels = new ArrayList<>();
    @Field(type = FieldType.Keyword)
    private String posId;
    @Field(type = FieldType.Keyword)
    private List<String> excludedDeliverySKUs;
    @Field(type = FieldType.Keyword)
    private List<String> excludedLevelSKUs;
    @Field(type = FieldType.Keyword)
    private List<String> excludedLevelCategories;
    @Field(type = FieldType.Text)
    private String revisedDocument;
    @Field(type = FieldType.Float)
    private float grossValue;
    @Field(type = FieldType.Date)
    private Long createdAt = System.currentTimeMillis();
    @Field(type = FieldType.Date)
    private Long updatedAt = System.currentTimeMillis();

}
