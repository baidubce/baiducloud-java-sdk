package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateWhitelistRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 白名单IP列表
    */
    private List<String> securityIps;

    /**
    * 指定的白名单分组名称，当 version 取值为2时，必填
    */
    private String tag;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateWhitelistRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public List<String> getSecurityIps() {
        return securityIps;
    }

    public UpdateWhitelistRequest setSecurityIps(List<String> securityIps) {
        this.securityIps = securityIps;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public UpdateWhitelistRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }

}
