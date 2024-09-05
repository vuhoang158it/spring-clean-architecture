package com.aggregatoricapaci.acx.loyalty_clean_architecture.infrastructure.exception;

import com.aggregatoricapaci.acx.loyalty_clean_architecture.adapter.dto.response.ERROR;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException extends Exception {
    private int code;

    public ApiException(int code) {
        this.code = code;
    }

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public ApiException(ERROR msg) {
        super(msg.getMessage());
        this.code = msg.getCode();
    }

    public ApiException(ERROR msg, String message) {
        super(message);
        this.code = msg.getCode();
    }

}
