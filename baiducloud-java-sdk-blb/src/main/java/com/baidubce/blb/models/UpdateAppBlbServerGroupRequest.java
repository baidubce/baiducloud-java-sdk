package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbServerGroupRequest extends BaseBceRequest {

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
    * 要更新的服务器组的id
    */
    private String sgId;

    /**
    * 服务器组的名称，方便记忆。长度1~65个字节，字母开头，可包含字母数字-\_/.字符。若不传该参数，会自动生成
    */
    private String name;

    /**
    * 服务器组的描述，便于用户添加更详细的描述信息。长度0~450个字节，支持中文。默认为空
    */
    private String desc;

    /**
    * 是否开启客户端地址保持功能，注意：仅应用型实例支持，应用型IPv6不支持该功能
    */
    private Boolean preserveClientIpEnabled;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbServerGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public UpdateAppBlbServerGroupRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAppBlbServerGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateAppBlbServerGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Boolean getPreserveClientIpEnabled() {
        return preserveClientIpEnabled;
    }

    public UpdateAppBlbServerGroupRequest setPreserveClientIpEnabled(Boolean preserveClientIpEnabled) {
        this.preserveClientIpEnabled = preserveClientIpEnabled;
        return this;
    }

}
