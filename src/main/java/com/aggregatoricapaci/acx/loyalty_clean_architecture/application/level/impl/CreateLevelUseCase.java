package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.impl;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.ICreateLevelUseCase;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.gateway.ILevelGateway;
import org.springframework.stereotype.Service;

@Service
public class CreateLevelUseCase implements ICreateLevelUseCase {

    private final ILevelGateway gateway;

    public CreateLevelUseCase(ILevelGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void execute(Level data) {
        this.gateway.create(data);
    }
}
