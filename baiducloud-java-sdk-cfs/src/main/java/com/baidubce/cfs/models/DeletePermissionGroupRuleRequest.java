package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePermissionGroupRuleRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

    /**
    * arId
    */
    @JsonIgnore
    private String arId;

    public String getAgName() {
        return agName;
    }

    public DeletePermissionGroupRuleRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public String getArId() {
        return arId;
    }

    public DeletePermissionGroupRuleRequest setArId(String arId) {
        this.arId = arId;
        return this;
    }

}
