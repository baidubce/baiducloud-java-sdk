package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateVpcRequest extends BaseBceRequest {

    /**
    * vpcId
    */
    @JsonIgnore
    private String vpcId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * VPC名称，不能取值"default"，长度不超过65个字符，可由数字，字符，下划线组成
    */
    private String name;

    /**
    * VPC描述，不超过200字符
    */
    private String description;

    /**
    * 是否开启Ipv6网段，true开启，false关闭；不传表示不做更改
    */
    private Boolean enableIpv6;

    /**
    * vpc的辅助网段cidr列表，**替换式更新**
    */
    private List<String> secondaryCidr;


    public String getVpcId() {
        return vpcId;
    }

    public UpdateVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateVpcRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateVpcRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnableIpv6() {
        return enableIpv6;
    }

    public UpdateVpcRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public List<String> getSecondaryCidr() {
        return secondaryCidr;
    }

    public UpdateVpcRequest setSecondaryCidr(List<String> secondaryCidr) {
        this.secondaryCidr = secondaryCidr;
        return this;
    }


}
