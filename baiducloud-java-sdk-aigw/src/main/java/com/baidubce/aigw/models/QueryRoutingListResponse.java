package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingListResponse extends BaseBceResponse {

    /**
    * result
    */
    private RouteListPage result;

    /**
    * 错误信息，仅失败时返回
    */
    private String message;

    public RouteListPage getResult() {
        return result;
    }

    public QueryRoutingListResponse setResult(RouteListPage result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public QueryRoutingListResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "QueryRoutingListResponse{" + "result=" + result + "\n" + "message=" + message + "\n" + "}";
    }

}
