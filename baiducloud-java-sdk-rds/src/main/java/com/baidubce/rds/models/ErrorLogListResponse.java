package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorLogListResponse extends BaseBceResponse {

    /**
    * 错误日志对象
    */
    private List<OpenapiErrorlog> errorlogs;

    public List<OpenapiErrorlog> getErrorlogs() {
        return errorlogs;
    }

    public ErrorLogListResponse setErrorlogs(List<OpenapiErrorlog> errorlogs) {
        this.errorlogs = errorlogs;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorLogListResponse{" + "errorlogs=" + errorlogs + "\n" + "}";
    }

}
