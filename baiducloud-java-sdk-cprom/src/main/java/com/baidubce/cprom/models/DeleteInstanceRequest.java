package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * deleteGrafana
    */
    @JsonIgnore
    private Boolean deleteGrafana;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getDeleteGrafana() {
        return deleteGrafana;
    }

    public DeleteInstanceRequest setDeleteGrafana(Boolean deleteGrafana) {
        this.deleteGrafana = deleteGrafana;
        return this;
    }

}
