package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIpAddressFamilyRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * IP地址族的名称，限制：大小写字母、数字、中文以及-_/.特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * ipVersion，取值IPv4或IPv6
    */
    private String ipVersion;

    /**
    * 关联的IP地址组ID，其ipVersion需与本次创建的IP地址族一致，单次最多指定5个
    */
    private List<String> ipSetIds;

    /**
    * IP地址族描述，长度不超过255
    */
    private String description;

    public String getClientToken() {
        return clientToken;
    }

    public CreateIpAddressFamilyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateIpAddressFamilyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIpVersion() {
        return ipVersion;
    }

    public CreateIpAddressFamilyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public List<String> getIpSetIds() {
        return ipSetIds;
    }

    public CreateIpAddressFamilyRequest setIpSetIds(List<String> ipSetIds) {
        this.ipSetIds = ipSetIds;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateIpAddressFamilyRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
