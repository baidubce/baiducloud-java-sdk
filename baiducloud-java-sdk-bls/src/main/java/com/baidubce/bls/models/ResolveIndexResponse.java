package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResolveIndexResponse extends BaseBceResponse {

    /**
    * dataStreams
    */
    private DataStreams dataStreams;

    /**
    * error
    */
    private Error error;

    /**
    * http状态码，比如：500
    */
    private Integer status;

    public DataStreams getDataStreams() {
        return dataStreams;
    }

    public ResolveIndexResponse setDataStreams(DataStreams dataStreams) {
        this.dataStreams = dataStreams;
        return this;
    }

    public Error getError() {
        return error;
    }

    public ResolveIndexResponse setError(Error error) {
        this.error = error;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ResolveIndexResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "ResolveIndexResponse{" + "dataStreams=" + dataStreams + "\n" + "error=" + error + "\n" + "status=" + status + "\n" + "}";
    }

}
