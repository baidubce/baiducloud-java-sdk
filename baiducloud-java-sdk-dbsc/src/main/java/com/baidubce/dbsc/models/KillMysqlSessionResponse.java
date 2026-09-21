package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KillMysqlSessionResponse extends BaseBceResponse {

    /**
    * Success 指定了操作是否执行成功
    */
    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public KillMysqlSessionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @Override
    public String toString() {
        return "KillMysqlSessionResponse{" + "success=" + success + "\n" + "}";
    }

}
