package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeerConnStatus {
    /**
     * 创建中
     */
    private String creating;

    /**
     * 协商中
     */
    private String consulting;

    /**
     * 协商失败
     */
    private String consultFailed;

    /**
     * 可用
     */
    private String active;

    /**
     * 不可用
     */
    private String down;

    /**
     * 启动中
     */
    private String starting;

    /**
     * 停止中
     */
    private String stopping;

    /**
     * 删除中
     */
    private String deleting;

    /**
     * 已删除
     */
    private String deleted;

    /**
     * 已到期
     */
    private String expired;

    /**
     * 异常
     */
    private String error;

    /**
     * 更新中
     */
    private String updating;

    public PeerConnStatus setCreating(String creating) {
        this.creating = creating;
        return this;
    }

    public String getCreating() {
        return this.creating;
    }

    public PeerConnStatus setConsulting(String consulting) {
        this.consulting = consulting;
        return this;
    }

    public String getConsulting() {
        return this.consulting;
    }

    public PeerConnStatus setConsultFailed(String consultFailed) {
        this.consultFailed = consultFailed;
        return this;
    }

    public String getConsultFailed() {
        return this.consultFailed;
    }

    public PeerConnStatus setActive(String active) {
        this.active = active;
        return this;
    }

    public String getActive() {
        return this.active;
    }

    public PeerConnStatus setDown(String down) {
        this.down = down;
        return this;
    }

    public String getDown() {
        return this.down;
    }

    public PeerConnStatus setStarting(String starting) {
        this.starting = starting;
        return this;
    }

    public String getStarting() {
        return this.starting;
    }

    public PeerConnStatus setStopping(String stopping) {
        this.stopping = stopping;
        return this;
    }

    public String getStopping() {
        return this.stopping;
    }

    public PeerConnStatus setDeleting(String deleting) {
        this.deleting = deleting;
        return this;
    }

    public String getDeleting() {
        return this.deleting;
    }

    public PeerConnStatus setDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public PeerConnStatus setExpired(String expired) {
        this.expired = expired;
        return this;
    }

    public String getExpired() {
        return this.expired;
    }

    public PeerConnStatus setError(String error) {
        this.error = error;
        return this;
    }

    public String getError() {
        return this.error;
    }

    public PeerConnStatus setUpdating(String updating) {
        this.updating = updating;
        return this;
    }

    public String getUpdating() {
        return this.updating;
    }

    @Override
    public String toString() {
        return "PeerConnStatus{" + "creating=" + creating + "\n" + "consulting=" + consulting + "\n" + "consultFailed=" + consultFailed + "\n" + "active=" + active + "\n"
                + "down=" + down + "\n" + "starting=" + starting + "\n" + "stopping=" + stopping + "\n" + "deleting=" + deleting + "\n" + "deleted=" + deleted + "\n" + "expired="
                + expired + "\n" + "error=" + error + "\n" + "updating=" + updating + "\n" + "}";
    }

}