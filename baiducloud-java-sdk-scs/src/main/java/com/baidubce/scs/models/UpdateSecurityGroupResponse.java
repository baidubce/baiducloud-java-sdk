package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSecurityGroupResponse extends BaseBceResponse {

    /**
    * 是否成功。
    */
    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }

    public UpdateSecurityGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateSecurityGroupResponse{" + "success=" + success + "\n" + "}";
    }

}
