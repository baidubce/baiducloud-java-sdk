package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsStatus {
    /**
     * 关闭同步
     */
    private String close;

    /**
     * 等待同步
     */
    private String wait;

    /**
     * 同步中
     */
    private String syncing;

    /**
     * 开启同步
     */
    private String open;

    /**
     * 关闭同步中
     */
    private String closing;

    public DnsStatus setClose(String close) {
        this.close = close;
        return this;
    }

    public String getClose() {
        return this.close;
    }

    public DnsStatus setWait(String wait) {
        this.wait = wait;
        return this;
    }

    public String getWait() {
        return this.wait;
    }

    public DnsStatus setSyncing(String syncing) {
        this.syncing = syncing;
        return this;
    }

    public String getSyncing() {
        return this.syncing;
    }

    public DnsStatus setOpen(String open) {
        this.open = open;
        return this;
    }

    public String getOpen() {
        return this.open;
    }

    public DnsStatus setClosing(String closing) {
        this.closing = closing;
        return this;
    }

    public String getClosing() {
        return this.closing;
    }

    @Override
    public String toString() {
        return "DnsStatus{" + "close=" + close + "\n" + "wait=" + wait + "\n" + "syncing=" + syncing + "\n" + "open=" + open + "\n" + "closing=" + closing + "\n" + "}";
    }

}