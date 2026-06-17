package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsyncSearchResponse extends BaseBceResponse {

    /**
    * 查询开始时间
    */
    private Integer startTimeInMillis;

    /**
    * 查询结束时间
    */
    private Integer expirationTimeInMillis;

    /**
    * response
    */
    private Response response;

    /**
    * error
    */
    private Error error;

    /**
    * http状态码，比如：500
    */
    private Integer status;

    public Integer getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public AsyncSearchResponse setStartTimeInMillis(Integer startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
        return this;
    }

    public Integer getExpirationTimeInMillis() {
        return expirationTimeInMillis;
    }

    public AsyncSearchResponse setExpirationTimeInMillis(Integer expirationTimeInMillis) {
        this.expirationTimeInMillis = expirationTimeInMillis;
        return this;
    }

    public Response getResponse() {
        return response;
    }

    public AsyncSearchResponse setResponse(Response response) {
        this.response = response;
        return this;
    }

    public Error getError() {
        return error;
    }

    public AsyncSearchResponse setError(Error error) {
        this.error = error;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AsyncSearchResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "AsyncSearchResponse{" + "startTimeInMillis=" + startTimeInMillis + "\n" + "expirationTimeInMillis=" + expirationTimeInMillis + "\n" + "response=" + response + "\n"
                + "error=" + error + "\n" + "status=" + status + "\n" + "}";
    }

}
