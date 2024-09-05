package com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.level.model.Level;

public interface ICreateLevelUseCase {
    void execute(Level data);
}
