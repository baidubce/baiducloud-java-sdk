package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppIpGroup {
    /**
     * IP组标识符
     */
    private String id;

    /**
     * IP组的名称
     */
    private String name;

    /**
     * IP组的描述
     */
    private String desc;

    /**
     * 关联的IP组协议列表
     */
    private List<AppIpGroupBackendPolicy> backendPolicyList;

    public AppIpGroup setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppIpGroup setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AppIpGroup setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public AppIpGroup setBackendPolicyList(List<AppIpGroupBackendPolicy> backendPolicyList) {
        this.backendPolicyList = backendPolicyList;
        return this;
    }

    public List<AppIpGroupBackendPolicy> getBackendPolicyList() {
        return this.backendPolicyList;
    }

    @Override
    public String toString() {
        return "AppIpGroup{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "backendPolicyList=" + backendPolicyList + "\n" + "}";
    }

}