package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateResolverRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 解析器名称，允许大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * 解析器描述，不超过200字符
    */
    private String description;

    /**
    * 解析器所在的vpc的id
    */
    private String vpcId;

    /**
    * 解析器所在的地区
    */
    private String vpcRegion;

    /**
    * 入站/出站的流量地址
    */
    private List<IpModel> ipModels;

    /**
    * 解析器类型，描述：outbound：出站解析器；inbound：入站解析器
    */
    private String type;

    public String getClientToken() {
        return clientToken;
    }

    public CreateResolverRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateResolverRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateResolverRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVpcId() {
        return vpcId;
    }

    public CreateResolverRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcRegion() {
        return vpcRegion;
    }

    public CreateResolverRequest setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }

    public List<IpModel> getIpModels() {
        return ipModels;
    }

    public CreateResolverRequest setIpModels(List<IpModel> ipModels) {
        this.ipModels = ipModels;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateResolverRequest setType(String type) {
        this.type = type;
        return this;
    }

}
