package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordUsingGETRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * username
    */
    @JsonIgnore
    private String username;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    public String getInstanceId() {
        return instanceId;
    }

    public PasswordUsingGETRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public PasswordUsingGETRequest setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public PasswordUsingGETRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

}
