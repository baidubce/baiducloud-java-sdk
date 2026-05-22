package com.baidubce.cfw.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 防火墙边界实例的id
     */
    private String instanceId;

    /**
     * 防火墙边界实例的name
     */
    private String instanceName;

    /**
     * 防护状态，取值 \[ unbound \| protected \| unprotected \]
     */
    private String status;

    /**
     * 地域信息，取值 \[ bj \| gz \| su \| fsh \| hkg \| bd \| fwh \| sin ]
     */
    private String region;

    /**
     * 关联的CFW的id
     */
    private String cfwId;

    /**
     * 关联的CFW的name
     */
    private String cfwName;

    /**
     * VPC边界实例特有属性，所属VPC的id
     */
    private String vpcId;

    /**
     * VPC边界实例特有属性，所属VPC的name
     */
    private String vpcName;

    /**
     * EIP实例特有属性
     */
    private String publicIp;

    /**
     * PEERCONN特有属性，本端角色，取值\[ acceptor \| initiator ]
     */
    private String role;

    /**
     * PEERCONN实例特有属性，本端端口的id
     */
    private String localIfId;

    /**
     * PEERCONN实例特有属性，本端端口的name
     */
    private String localIfName;

    /**
     * PEERCONN实例特有属性，对端地域
     */
    private String peerRegion;

    /**
     * PEERCONN实例特有属性，对端VPC的id
     */
    private String peerVpcId;

    /**
     * PEERCONN实例特有属性，对端VPC的name
     */
    private String peerVpcName;

    /**
     * CSN实例特有属性，CSN中网络实例的id
     */
    private String memberId;

    /**
     * CSN实例特有属性，CSN中网络实例的name
     */
    private String memberName;

    /**
     * CSN实例特有属性，CSN中网络实例的所属用户
     */
    private String memberAccountId;

    public Instance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Instance setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Instance setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getCfwId() {
        return this.cfwId;
    }

    public Instance setCfwName(String cfwName) {
        this.cfwName = cfwName;
        return this;
    }

    public String getCfwName() {
        return this.cfwName;
    }

    public Instance setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Instance setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public Instance setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public Instance setRole(String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return this.role;
    }

    public Instance setLocalIfId(String localIfId) {
        this.localIfId = localIfId;
        return this;
    }

    public String getLocalIfId() {
        return this.localIfId;
    }

    public Instance setLocalIfName(String localIfName) {
        this.localIfName = localIfName;
        return this;
    }

    public String getLocalIfName() {
        return this.localIfName;
    }

    public Instance setPeerRegion(String peerRegion) {
        this.peerRegion = peerRegion;
        return this;
    }

    public String getPeerRegion() {
        return this.peerRegion;
    }

    public Instance setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    public Instance setPeerVpcName(String peerVpcName) {
        this.peerVpcName = peerVpcName;
        return this;
    }

    public String getPeerVpcName() {
        return this.peerVpcName;
    }

    public Instance setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public Instance setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public Instance setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    @Override
    public String toString() {
        return "Instance{" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n" + "status=" + status + "\n" + "region=" + region + "\n" + "cfwId=" + cfwId
                + "\n" + "cfwName=" + cfwName + "\n" + "vpcId=" + vpcId + "\n" + "vpcName=" + vpcName + "\n" + "publicIp=" + publicIp + "\n" + "role=" + role + "\n" + "localIfId="
                + localIfId + "\n" + "localIfName=" + localIfName + "\n" + "peerRegion=" + peerRegion + "\n" + "peerVpcId=" + peerVpcId + "\n" + "peerVpcName=" + peerVpcName
                + "\n" + "memberId=" + memberId + "\n" + "memberName=" + memberName + "\n" + "memberAccountId=" + memberAccountId + "\n" + "}";
    }

}