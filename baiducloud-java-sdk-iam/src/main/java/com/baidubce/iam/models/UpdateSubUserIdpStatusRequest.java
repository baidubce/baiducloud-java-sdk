package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSubUserIdpStatusRequest extends BaseBceRequest {

    /**
    * status
    */
    @JsonIgnore
    private String status;

    public String getStatus() {
        return status;
    }

    public UpdateSubUserIdpStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }

}
