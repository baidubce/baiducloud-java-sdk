package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbServerGroupRequest extends BaseBceRequest {

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
    * 服务器组的名称，方便记忆。长度1~65个字节，字母开头，\_可包含字母数字-/.字符。若不传该参数，会自动生成
    */
    private String name;

    /**
    * 服务器组的描述，便于用户添加更详细的描述信息。长度0~450个字节，支持中文。默认为空。
    */
    private String desc;

    /**
    * 服务器组绑定的后端服务器列表
    */
    private List<AppBackendServerForCreate> backendServerList;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbServerGroupRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppBlbServerGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateAppBlbServerGroupRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public List<AppBackendServerForCreate> getBackendServerList() {
        return backendServerList;
    }

    public CreateAppBlbServerGroupRequest setBackendServerList(List<AppBackendServerForCreate> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

}
