package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Member {
    /**
     * 集群ID。
     */
    private String memberId;

    /**
     * 集群所在地域。
     */
    private String region;

    public Member setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public Member setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return "Member{" + "memberId=" + memberId + "\n" + "region=" + region + "\n" + "}";
    }

}