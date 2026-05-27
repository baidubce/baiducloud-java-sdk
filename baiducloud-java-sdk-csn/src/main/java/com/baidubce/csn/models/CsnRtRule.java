package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsnRtRule {
    /**
     * 路由条目的ID
     */
    private String ruleId;

    /**
     * 路由条目的类型
     */
    private String routeType;

    /**
     * 云智能网的ID
     */
    private String csnId;

    /**
     * 路由表的ID
     */
    private String csnRtId;

    /**
     * 路由条目的描述
     */
    private String description;

    /**
     * 路由条目来源网络实例在云智能网中的身份ID
     */
    private String fromAttachId;

    /**
     * 路由条目的状态，取值 [ active \| conflicted ]，分别表示可用、冲突
     */
    private String status;

    /**
     * 源地址
     */
    private String sourceAddress;

    /**
     * 目的地址
     */
    private String destAddress;

    /**
     * 下一跳网络实例的ID
     */
    private String nextHopId;

    /**
     * 下一跳网络实例的名称
     */
    private String nextHopName;

    /**
     * 下一跳网络实例的region信息
     */
    private String nextHopRegion;

    /**
     * 下一跳网络实例的类型
     */
    private String nextHopType;

    /**
     * as-path
     */
    private String asPath;

    /**
     * community
     */
    private String community;

    /**
     * 是否黑洞路由
     */
    private Boolean blackHole;

    public CsnRtRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public CsnRtRule setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public CsnRtRule setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public CsnRtRule setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getCsnRtId() {
        return this.csnRtId;
    }

    public CsnRtRule setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public CsnRtRule setFromAttachId(String fromAttachId) {
        this.fromAttachId = fromAttachId;
        return this;
    }

    public String getFromAttachId() {
        return this.fromAttachId;
    }

    public CsnRtRule setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public CsnRtRule setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
        return this;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public CsnRtRule setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public CsnRtRule setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }

    public String getNextHopId() {
        return this.nextHopId;
    }

    public CsnRtRule setNextHopName(String nextHopName) {
        this.nextHopName = nextHopName;
        return this;
    }

    public String getNextHopName() {
        return this.nextHopName;
    }

    public CsnRtRule setNextHopRegion(String nextHopRegion) {
        this.nextHopRegion = nextHopRegion;
        return this;
    }

    public String getNextHopRegion() {
        return this.nextHopRegion;
    }

    public CsnRtRule setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    public String getNextHopType() {
        return this.nextHopType;
    }

    public CsnRtRule setAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }

    public String getAsPath() {
        return this.asPath;
    }

    public CsnRtRule setCommunity(String community) {
        this.community = community;
        return this;
    }

    public String getCommunity() {
        return this.community;
    }

    public CsnRtRule setBlackHole(Boolean blackHole) {
        this.blackHole = blackHole;
        return this;
    }

    public Boolean getBlackHole() {
        return this.blackHole;
    }

    @Override
    public String toString() {
        return "CsnRtRule{" + "ruleId=" + ruleId + "\n" + "routeType=" + routeType + "\n" + "csnId=" + csnId + "\n" + "csnRtId=" + csnRtId + "\n" + "description=" + description
                + "\n" + "fromAttachId=" + fromAttachId + "\n" + "status=" + status + "\n" + "sourceAddress=" + sourceAddress + "\n" + "destAddress=" + destAddress + "\n"
                + "nextHopId=" + nextHopId + "\n" + "nextHopName=" + nextHopName + "\n" + "nextHopRegion=" + nextHopRegion + "\n" + "nextHopType=" + nextHopType + "\n" + "asPath="
                + asPath + "\n" + "community=" + community + "\n" + "blackHole=" + blackHole + "\n" + "}";
    }

}