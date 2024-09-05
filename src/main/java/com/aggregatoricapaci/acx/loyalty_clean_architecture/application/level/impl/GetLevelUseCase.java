package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.impl;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response.ERROR;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.IGetLevelUseCase;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.gateway.ILevelGateway;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.exception.ApiException;
import org.springframework.stereotype.Service;

@Service
public class GetLevelUseCase implements IGetLevelUseCase {

    private final ILevelGateway gateway;

    public GetLevelUseCase(ILevelGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Level execute(String id) throws ApiException {
        return this.gateway.findById(id)
                .orElseThrow(() -> new ApiException(ERROR.DATA_NOT_FOUND, "Level not found"));
    }
}
