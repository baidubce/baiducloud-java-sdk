package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRouteResponse extends BaseBceResponse {

    /**
    * result
    */
    private DeleteRouteResult result;

    /**
    * 错误信息，仅失败时返回
    */
    private String message;

    public DeleteRouteResult getResult() {
        return result;
    }

    public DeleteRouteResponse setResult(DeleteRouteResult result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DeleteRouteResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteRouteResponse{" + "result=" + result + "\n" + "message=" + message + "\n" + "}";
    }

}
