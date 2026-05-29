package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbIpGroupRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 要更新的IP组id
    */
    private String ipGroupId;

    /**
    * IP组的名称，方便记忆。长度1~65个字节，字母开头，_可包含字母数字-/.字符。
    */
    private String name;

    /**
    * IP组的描述，最大支持200字符
    */
    private String desc;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbIpGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbIpGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIpGroupId() {
        return ipGroupId;
    }

    public UpdateAppBlbIpGroupRequest setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAppBlbIpGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateAppBlbIpGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
