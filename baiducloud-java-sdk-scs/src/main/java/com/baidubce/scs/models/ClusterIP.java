package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterIP {
    /**
     * 白名单分组名称
     */
    private String groupName;

    /**
     * 白名单IP列表
     */
    private List<String> ipList;

    public ClusterIP setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public ClusterIP setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

    public List<String> getIpList() {
        return this.ipList;
    }

    @Override
    public String toString() {
        return "ClusterIP{" + "groupName=" + groupName + "\n" + "ipList=" + ipList + "\n" + "}";
    }

}