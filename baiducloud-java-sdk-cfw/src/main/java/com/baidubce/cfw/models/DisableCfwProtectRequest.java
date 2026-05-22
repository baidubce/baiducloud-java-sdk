package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableCfwProtectRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * 防护实例的id
    */
    private String instanceId;

    /**
    * PEERCONN实例特有属性，实例角色，取值 \[ acceptor \| initiatorn ]，当实例为PEERCONN时，该值必填
    */
    private String role;

    /**
    * CSN实例特有属性，CSN中网络实例id，当实例为CSN时，该值必填
    */
    private String memberId;

    public String getCfwId() {
        return cfwId;
    }

    public DisableCfwProtectRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DisableCfwProtectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public DisableCfwProtectRequest setRole(String role) {
        this.role = role;
        return this;
    }

    public String getMemberId() {
        return memberId;
    }

    public DisableCfwProtectRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

}
