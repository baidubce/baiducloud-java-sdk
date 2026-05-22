package com.baidubce.cfw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CfwBind {
    /**
     * 地域信息，取值 \[ bj \| gz \| su \| fsh \| hkg \| bd \| fwh \|sin ]
     */
    private String region;

    /**
     * 关联的实例的id
     */
    private String instanceId;

    /**
     * PEERCONN实例特有属性，本端角色，取值\[ acceptor \| initiator ]，当绑定、解绑实例为PEERCONN时，该值必填
     */
    private String role;

    /**
     * CSN实例特有属性，CSN中网络实例id，当绑定、解绑实例为CSN时，该值必填
     */
    private String memberId;

    public CfwBind setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public CfwBind setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CfwBind setRole(String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return this.role;
    }

    public CfwBind setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    @Override
    public String toString() {
        return "CfwBind{" + "region=" + region + "\n" + "instanceId=" + instanceId + "\n" + "role=" + role + "\n" + "memberId=" + memberId + "\n" + "}";
    }

}