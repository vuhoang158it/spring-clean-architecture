package com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PagingResponse<T> extends BaseResponse<T> {
    @Schema(description = "page hiện tại", example = "1")
    private int currentPage;
    @Schema(description = "tổng số element", example = "6996")
    private int totalElement;
    @Schema(description = "số element mỗi page", example = "20")
    private int pageSize;
    @Schema(description = "data")
    private T data;
}