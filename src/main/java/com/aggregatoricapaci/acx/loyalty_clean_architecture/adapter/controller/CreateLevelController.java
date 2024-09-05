package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.controller;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.controller.mapper.LevelMapper;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.request.LevelCreateData;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response.BaseResponse;
import com.aggregatoricapaci.acx.loyalty_clean_architecture.application.level.ICreateLevelUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/levels")
public class CreateLevelController {

    private final ICreateLevelUseCase createLevelUseCase;
    private final LevelMapper levelMapper;

    public CreateLevelController(ICreateLevelUseCase createLevelUseCase, LevelMapper levelMapper) {
        this.createLevelUseCase = createLevelUseCase;
        this.levelMapper = levelMapper;
    }

    @PostMapping
//    @PreAuthorize("hasRole('supper_admin')")
    public BaseResponse<Void> create(@RequestBody LevelCreateData request) {
        createLevelUseCase.execute(levelMapper.toDomain(request));
        return new BaseResponse<>();
    }
}
