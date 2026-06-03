package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefreshRobotAccountKeyRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * robotID
    */
    @JsonIgnore
    private String robotID;

    /**
    * 新密码，如果不填则由系统自动生成。<br>长度8~65，必须包含大、小写字母、数字或特殊字符，特殊字符允许!@#$%^*()
    */
    private String secret;

    public String getInstanceId() {
        return instanceId;
    }

    public RefreshRobotAccountKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRobotID() {
        return robotID;
    }

    public RefreshRobotAccountKeyRequest setRobotID(String robotID) {
        this.robotID = robotID;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public RefreshRobotAccountKeyRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }

}
