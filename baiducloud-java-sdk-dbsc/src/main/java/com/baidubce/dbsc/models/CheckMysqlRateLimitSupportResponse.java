package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckMysqlRateLimitSupportResponse extends BaseBceResponse {

    /**
    * 是否支持SQL限流
    */
    private Boolean allowed;

    public Boolean getAllowed() {
        return allowed;
    }

    public CheckMysqlRateLimitSupportResponse setAllowed(Boolean allowed) {
        this.allowed = allowed;
        return this;
    }

    @Override
    public String toString() {
        return "CheckMysqlRateLimitSupportResponse{" + "allowed=" + allowed + "\n" + "}";
    }

}
