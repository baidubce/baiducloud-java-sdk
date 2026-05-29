package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePermissionGroupRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

    /**
    * 对于更新的权限组的描述，不能超过1024个字节
    */
    private String description;

    public String getAgName() {
        return agName;
    }

    public UpdatePermissionGroupRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdatePermissionGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
