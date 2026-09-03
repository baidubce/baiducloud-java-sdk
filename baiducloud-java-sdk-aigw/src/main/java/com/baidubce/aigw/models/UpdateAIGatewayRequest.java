package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAIGatewayRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    /**
    * 实例名称
    */
    private String name;

    /**
    * 实例描述
    */
    private String description;

    /**
    * 是否开启删除保护
    */
    private Boolean deleteProtection;

    /**
    * 是否允许公网访问
    */
    private Boolean publicAccessible;

    /**
    * 副本数，服务端校验范围为 2-5
    */
    private Integer replicas;

    /**
    * 网络类型：private、public，可多选
    */
    private List<String> networkTypes;

    /**
    * 标签列表；不传表示不修改，空数组表示清空
    */
    private List<Tag> tags;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateAIGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public UpdateAIGatewayRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAIGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAIGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    public UpdateAIGatewayRequest setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    public Boolean getPublicAccessible() {
        return publicAccessible;
    }

    public UpdateAIGatewayRequest setPublicAccessible(Boolean publicAccessible) {
        this.publicAccessible = publicAccessible;
        return this;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public UpdateAIGatewayRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public List<String> getNetworkTypes() {
        return networkTypes;
    }

    public UpdateAIGatewayRequest setNetworkTypes(List<String> networkTypes) {
        this.networkTypes = networkTypes;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdateAIGatewayRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
