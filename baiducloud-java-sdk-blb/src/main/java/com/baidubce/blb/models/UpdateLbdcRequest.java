package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLbdcRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 集群名称。长度1~65个字节，字母开头，_可包含字母数字-/.字符。
    */
    private String name;

    /**
    * 集群描述，最大支持200字符
    */
    private String desc;

    public String getId() {
        return id;
    }

    public UpdateLbdcRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateLbdcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateLbdcRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateLbdcRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

}
