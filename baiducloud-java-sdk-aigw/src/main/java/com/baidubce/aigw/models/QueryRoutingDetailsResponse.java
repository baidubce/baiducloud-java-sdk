package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingDetailsResponse extends BaseBceResponse {

    /**
    * result
    */
    private RouteResult result;

    /**
    * 错误信息，仅失败时返回
    */
    private String message;

    public RouteResult getResult() {
        return result;
    }

    public QueryRoutingDetailsResponse setResult(RouteResult result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public QueryRoutingDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "QueryRoutingDetailsResponse{" + "result=" + result + "\n" + "message=" + message + "\n" + "}";
    }

}
