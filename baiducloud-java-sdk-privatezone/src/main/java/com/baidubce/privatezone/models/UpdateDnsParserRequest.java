package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDnsParserRequest extends BaseBceRequest {

    /**
    * resolverId
    */
    @JsonIgnore
    private String resolverId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 解析器的名称，允许大小写字母、数字、中文以及 `-_/.` 特殊字符，必须以字母或者中文开头，长度1-65
    */
    private String name;

    /**
    * 解析器描述，不超过200字符，与name不能同时为空
    */
    private String description;

    public String getResolverId() {
        return resolverId;
    }

    public UpdateDnsParserRequest setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateDnsParserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateDnsParserRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateDnsParserRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
