package com.baidubce.csn.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TgwRtRule {
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
     * 路由条目来源网络实例在云智能网中的身份ID
     */
    private String fromAttachId;

    /**
     * 路由条目的状态
     */
    private String status;

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

    public TgwRtRule setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public TgwRtRule setRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    public String getRouteType() {
        return this.routeType;
    }

    public TgwRtRule setCsnId(String csnId) {
        this.csnId = csnId;
        return this;
    }

    public String getCsnId() {
        return this.csnId;
    }

    public TgwRtRule setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getCsnRtId() {
        return this.csnRtId;
    }

    public TgwRtRule setFromAttachId(String fromAttachId) {
        this.fromAttachId = fromAttachId;
        return this;
    }

    public String getFromAttachId() {
        return this.fromAttachId;
    }

    public TgwRtRule setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public TgwRtRule setDestAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    public String getDestAddress() {
        return this.destAddress;
    }

    public TgwRtRule setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }

    public String getNextHopId() {
        return this.nextHopId;
    }

    public TgwRtRule setNextHopName(String nextHopName) {
        this.nextHopName = nextHopName;
        return this;
    }

    public String getNextHopName() {
        return this.nextHopName;
    }

    public TgwRtRule setNextHopRegion(String nextHopRegion) {
        this.nextHopRegion = nextHopRegion;
        return this;
    }

    public String getNextHopRegion() {
        return this.nextHopRegion;
    }

    public TgwRtRule setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    public String getNextHopType() {
        return this.nextHopType;
    }

    public TgwRtRule setAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }

    public String getAsPath() {
        return this.asPath;
    }

    public TgwRtRule setCommunity(String community) {
        this.community = community;
        return this;
    }

    public String getCommunity() {
        return this.community;
    }

    public TgwRtRule setBlackHole(Boolean blackHole) {
        this.blackHole = blackHole;
        return this;
    }

    public Boolean getBlackHole() {
        return this.blackHole;
    }

    @Override
    public String toString() {
        return "TgwRtRule{" + "ruleId=" + ruleId + "\n" + "routeType=" + routeType + "\n" + "csnId=" + csnId + "\n" + "csnRtId=" + csnRtId + "\n" + "fromAttachId=" + fromAttachId
                + "\n" + "status=" + status + "\n" + "destAddress=" + destAddress + "\n" + "nextHopId=" + nextHopId + "\n" + "nextHopName=" + nextHopName + "\n" + "nextHopRegion="
                + nextHopRegion + "\n" + "nextHopType=" + nextHopType + "\n" + "asPath=" + asPath + "\n" + "community=" + community + "\n" + "blackHole=" + blackHole + "\n" + "}";
    }

}