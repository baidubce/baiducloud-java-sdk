package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckSyncGroupRequestMember {
    /**
     * 成员实例展示ID
     */
    private String memberId;

    /**
     * 成员实例所在地域
     */
    private String region;

    public CheckSyncGroupRequestMember setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public CheckSyncGroupRequestMember setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return "CheckSyncGroupRequestMember{" + "memberId=" + memberId + "\n" + "region=" + region + "\n" + "}";
    }

}