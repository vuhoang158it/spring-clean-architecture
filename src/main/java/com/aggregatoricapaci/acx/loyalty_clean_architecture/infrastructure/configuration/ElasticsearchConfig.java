package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.configuration;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetSocketAddress;

@SuppressWarnings("NullableProblems")
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.elasticsearch.repository")
public class ElasticsearchConfig extends ElasticsearchConfiguration {

    @Value("${elasticsearch.host:localhost}")
    private String elasticsearchHost;

    @Value("${elasticsearch.port:9200}")
    private int elasticsearchPort;

    @Value("${elasticsearch.username:elastic}")
    private String elasticsearchUsername;

    @Value("${elasticsearch.password:loyalty}")
    private String elasticsearchPassword;

    @Override
    @NotNull
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo(new InetSocketAddress(elasticsearchHost, elasticsearchPort))
                .withBasicAuth(elasticsearchUsername, elasticsearchPassword)
                .build();
    }
}
