package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindSecurityGroupResponse extends BaseBceResponse {

    /**
    * 是否成功。
    */
    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public BindSecurityGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @Override
    public String toString() {
        return "BindSecurityGroupResponse{" + "success=" + success + "\n" + "}";
    }

}
