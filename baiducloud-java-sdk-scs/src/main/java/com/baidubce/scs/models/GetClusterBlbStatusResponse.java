package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetClusterBlbStatusResponse extends BaseBceResponse {

    /**
    * 实例blb状态。
    */
    private Boolean alive;

    /**
    * 报错信息。
    */
    private String errors;

    public Boolean getAlive() {
        return alive;
    }

    public GetClusterBlbStatusResponse setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }

    public String getErrors() {
        return errors;
    }

    public GetClusterBlbStatusResponse setErrors(String errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public String toString() {
        return "GetClusterBlbStatusResponse{" + "alive=" + alive + "\n" + "errors=" + errors + "\n" + "}";
    }

}
