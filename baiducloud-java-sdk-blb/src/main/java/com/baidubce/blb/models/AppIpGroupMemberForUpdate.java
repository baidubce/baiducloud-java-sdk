package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppIpGroupMemberForUpdate {
    /**
     * 成员ID
     */
    private String memberId;

    /**
     * 端口号，取值范围1~65535
     */
    private Integer port;

    /**
     * 权重，取值范围0~100
     */
    private Integer weight;

    /**
     * 描述信息，最大支持200个字符
     */
    private String desc;

    public AppIpGroupMemberForUpdate setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public AppIpGroupMemberForUpdate setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public AppIpGroupMemberForUpdate setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public AppIpGroupMemberForUpdate setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "AppIpGroupMemberForUpdate{" + "memberId=" + memberId + "\n" + "port=" + port + "\n" + "weight=" + weight + "\n" + "desc=" + desc + "\n" + "}";
    }

}