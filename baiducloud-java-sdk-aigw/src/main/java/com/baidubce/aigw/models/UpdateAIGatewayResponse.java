package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAIGatewayResponse extends BaseBceResponse {

    /**
    * 网关实例 ID
    */
    private String instanceId;

    /**
    * 更新后的名称
    */
    private String name;

    /**
    * 更新后的描述
    */
    private String description;

    /**
    * 删除保护状态
    */
    private Boolean deleteProtection;

    /**
    * 公网访问状态
    */
    private Boolean publicAccessible;

    /**
    * 更新后的副本数
    */
    private Integer replicas;

    /**
    * 更新时间
    */
    private String updateTime;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateAIGatewayResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAIGatewayResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAIGatewayResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    public UpdateAIGatewayResponse setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    public Boolean getPublicAccessible() {
        return publicAccessible;
    }

    public UpdateAIGatewayResponse setPublicAccessible(Boolean publicAccessible) {
        this.publicAccessible = publicAccessible;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public UpdateAIGatewayResponse setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public UpdateAIGatewayResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateAIGatewayResponse{" + "instanceId=" + instanceId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "deleteProtection="
                + deleteProtection + "\n" + "publicAccessible=" + publicAccessible + "\n" + "replicas=" + replicas + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
