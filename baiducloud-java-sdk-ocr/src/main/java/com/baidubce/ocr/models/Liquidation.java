package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Liquidation {
    /**
     * 清算组负责人
     */
    private String leader;

    /**
     * 清算组成员
     */
    private String member;

    public Liquidation setLeader(String leader) {
        this.leader = leader;
        return this;
    }

    public String getLeader() {
        return this.leader;
    }

    public Liquidation setMember(String member) {
        this.member = member;
        return this;
    }

    public String getMember() {
        return this.member;
    }

    @Override
    public String toString() {
        return "Liquidation{" + "leader=" + leader + "\n" + "member=" + member + "\n" + "}";
    }

}