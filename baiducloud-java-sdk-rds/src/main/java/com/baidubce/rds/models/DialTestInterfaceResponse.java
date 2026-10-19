package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DialTestInterfaceResponse extends BaseBceResponse {

    /**
    * 实例状态。
    */
    private Boolean alive;

    /**
    * 报错信息。
    */
    private String errors;

    public Boolean getAlive() {
        return alive;
    }

    public DialTestInterfaceResponse setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }

    public String getErrors() {
        return errors;
    }

    public DialTestInterfaceResponse setErrors(String errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public String toString() {
        return "DialTestInterfaceResponse{" + "alive=" + alive + "\n" + "errors=" + errors + "\n" + "}";
    }

}
