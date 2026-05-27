package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpGroupRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP地址组的名称，限制：大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * ipVersion，取值IPv4或IPv6
    */
    private String ipVersion;

    /**
    * 参数模板IP地址信息，单次最多指定10个
    */
    private List<TemplateIpAddressInfo> ipAddressInfo;

    /**
    * IP地址组描述，长度不超过255
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateIpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public CreateIpGroupRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public List<TemplateIpAddressInfo> getIpAddressInfo() {
        return ipAddressInfo;
    }

    public CreateIpGroupRequest setIpAddressInfo(List<TemplateIpAddressInfo> ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateIpGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
