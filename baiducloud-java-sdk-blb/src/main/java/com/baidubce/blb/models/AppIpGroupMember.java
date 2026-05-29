package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppIpGroupMember {
    /**
     * ipv4地址
     */
    private String ip;

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

    /**
     * IP组成员标识符
     */
    private String memberId;

    /**
     * IP组成员开放的端口列表
     */
    private List<AppIpGroupMemberPortModel> portList;

    public AppIpGroupMember setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public AppIpGroupMember setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public AppIpGroupMember setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public AppIpGroupMember setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public AppIpGroupMember setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public AppIpGroupMember setPortList(List<AppIpGroupMemberPortModel> portList) {
        this.portList = portList;
        return this;
    }

    public List<AppIpGroupMemberPortModel> getPortList() {
        return this.portList;
    }

    @Override
    public String toString() {
        return "AppIpGroupMember{" + "ip=" + ip + "\n" + "port=" + port + "\n" + "weight=" + weight + "\n" + "desc=" + desc + "\n" + "memberId=" + memberId + "\n" + "portList="
                + portList + "\n" + "}";
    }

}