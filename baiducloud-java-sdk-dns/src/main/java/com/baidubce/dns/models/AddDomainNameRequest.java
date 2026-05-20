package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddDomainNameRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 域名的名称，比如baidu.com。
    */
    private String name;

    public String getClientToken() {
        return clientToken;
    }

    public AddDomainNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public AddDomainNameRequest setName(String name) {
        this.name = name;
        return this;
    }

}
