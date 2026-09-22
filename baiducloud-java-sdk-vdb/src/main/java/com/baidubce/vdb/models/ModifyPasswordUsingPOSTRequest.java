package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyPasswordUsingPOSTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * 请求来源
    */
    private String from;

    /**
    * 新密码
    */
    private String password;

    /**
    * 用户名
    */
    private String username;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyPasswordUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public ModifyPasswordUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public ModifyPasswordUsingPOSTRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ModifyPasswordUsingPOSTRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public ModifyPasswordUsingPOSTRequest setUsername(String username) {
        this.username = username;
        return this;
    }

}
