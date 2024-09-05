package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.controller;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.controller.mapper.LevelMapper;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response.BaseResponse;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.IGetLevelUseCase;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.dto.ILevelResponseData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.exception.ApiException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/levels")
public class GetLevelController {

    private final IGetLevelUseCase getLevelUseCase;
    private final LevelMapper levelMapper;

    public GetLevelController(IGetLevelUseCase getLevelUseCase, LevelMapper levelMapper) {
        this.getLevelUseCase = getLevelUseCase;
        this.levelMapper = levelMapper;
    }

    @GetMapping("/{id}")
    public BaseResponse<ILevelResponseData> getLevel(@PathVariable String id) throws ApiException {
        BaseResponse<ILevelResponseData> response = new BaseResponse<>();
//        response.setData(levelMapper.toResponse(getLevelUseCase.execute(id)));
        return response;

    }
}
