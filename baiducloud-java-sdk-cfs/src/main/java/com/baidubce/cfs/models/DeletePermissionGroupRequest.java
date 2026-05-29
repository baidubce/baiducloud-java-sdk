package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePermissionGroupRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

    public String getAgName() {
        return agName;
    }

    public DeletePermissionGroupRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

}
