package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimedInfo {
    /**
     * 是否认领
     */
    private Boolean isClaimed;

    /**
     * 认领人用户名
     */
    private String userName;

    /**
     * 认领时间（Unix 时间戳，秒）
     */
    private Integer claimTime;

    /**
     * 认领原因
     */
    private String claimReason;

    public ClaimedInfo setIsClaimed(Boolean isClaimed) {
        this.isClaimed = isClaimed;
        return this;
    }

    public Boolean getIsClaimed() {
        return this.isClaimed;
    }

    public ClaimedInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public ClaimedInfo setClaimTime(Integer claimTime) {
        this.claimTime = claimTime;
        return this;
    }

    public Integer getClaimTime() {
        return this.claimTime;
    }

    public ClaimedInfo setClaimReason(String claimReason) {
        this.claimReason = claimReason;
        return this;
    }

    public String getClaimReason() {
        return this.claimReason;
    }

    @Override
    public String toString() {
        return "ClaimedInfo{" + "isClaimed=" + isClaimed + "\n" + "userName=" + userName + "\n" + "claimTime=" + claimTime + "\n" + "claimReason=" + claimReason + "\n" + "}";
    }

}