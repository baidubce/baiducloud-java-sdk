package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindRoleResponse extends BaseBceResponse {

    /**
    * 实例绑定角色失败列表
    */
    private List<InstancePassRoleFailModel> failInstances;

    /**
    * 实例绑定角色成功列表
    */
    private List<InstanceRoleAssociationModel> instanceRoleAssociations;

    public List<InstancePassRoleFailModel> getFailInstances() {
        return failInstances;
    }

    public BindRoleResponse setFailInstances(List<InstancePassRoleFailModel> failInstances) {
        this.failInstances = failInstances;
        return this;
    }

    public List<InstanceRoleAssociationModel> getInstanceRoleAssociations() {
        return instanceRoleAssociations;
    }

    public BindRoleResponse setInstanceRoleAssociations(List<InstanceRoleAssociationModel> instanceRoleAssociations) {
        this.instanceRoleAssociations = instanceRoleAssociations;
        return this;
    }

    @Override
    public String toString() {
        return "BindRoleResponse{" + "failInstances=" + failInstances + "\n" + "instanceRoleAssociations=" + instanceRoleAssociations + "\n" + "}";
    }

}
