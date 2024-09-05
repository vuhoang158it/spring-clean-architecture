package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.repository;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.document.TransactionDetail;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends ElasticsearchRepository<TransactionDetail, String> {
}
