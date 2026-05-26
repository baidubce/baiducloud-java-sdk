package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNatRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * NAT网关的名称，由大小写字母、数字以及-\_ /.特殊字符组成，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * VPC的ID
    */
    private String vpcId;

    /**
    * NAT网关的CU数量
    */
    private Integer cuNum;

    /**
    * NAT IP类型，默认v4
    */
    private String ipVersion;

    /**
    * 关联NAT网关EIP或者共享带宽中的一个或多个EIP
    */
    private List<String> bindEips;

    /**
    * billing
    */
    private Billing billing;

    /**
    * sessionConfig
    */
    private SessionConfig sessionConfig;

    /**
    * 待创建的标签键值对列表。
    */
    private List<TagModel> tags;

    /**
    * 资源组
    */
    private String resourceGroupId;

    /**
    * 是否开启释放保护。缺省值为false，代表允许删除
    */
    private Boolean deleteProtect;

    public String getClientToken() {
        return clientToken;
    }

    public CreateNatRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateNatRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateNatRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public Integer getCuNum() {
        return cuNum;
    }

    public CreateNatRequest setCuNum(Integer cuNum) {
        this.cuNum = cuNum;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public CreateNatRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public List<String> getBindEips() {
        return bindEips;
    }

    public CreateNatRequest setBindEips(List<String> bindEips) {
        this.bindEips = bindEips;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateNatRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public SessionConfig getSessionConfig() {
        return sessionConfig;
    }

    public CreateNatRequest setSessionConfig(SessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateNatRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public CreateNatRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Boolean getDeleteProtect() {
        return deleteProtect;
    }

    public CreateNatRequest setDeleteProtect(Boolean deleteProtect) {
        this.deleteProtect = deleteProtect;
        return this;
    }

}
