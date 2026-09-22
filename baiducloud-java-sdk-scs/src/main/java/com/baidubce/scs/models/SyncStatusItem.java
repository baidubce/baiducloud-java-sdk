package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncStatusItem {
    /**
     * 成员集群ID。
     */
    private String memberId;

    /**
     * 同步状态。normal为正常，其他为异常。
     */
    private String status;

    public SyncStatusItem setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public SyncStatusItem setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "SyncStatusItem{" + "memberId=" + memberId + "\n" + "status=" + status + "\n" + "}";
    }

}