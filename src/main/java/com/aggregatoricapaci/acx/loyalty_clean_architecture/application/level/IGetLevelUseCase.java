package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.exception.ApiException;

public interface IGetLevelUseCase {
    Level execute(String id) throws ApiException;
}
