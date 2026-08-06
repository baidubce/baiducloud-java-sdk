package com.baidubce.blb.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppServerGroup {
    /**
     * 后端服务器组标识符
     */
    private String id;

    /**
     * 后端服务器组名称
     */
    private String name;

    /**
     * 后端服务器组描述
     */
    private String desc;

    /**
     * 服务器组状态，详见[blbStatus](#blbStatus)
     */
    private String status;

    /**
     * 服务器组开放的端口列表
     */
    private List<AppServerGroupPort> portList;

    public AppServerGroup setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AppServerGroup setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AppServerGroup setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public AppServerGroup setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public AppServerGroup setPortList(List<AppServerGroupPort> portList) {
        this.portList = portList;
        return this;
    }

    public List<AppServerGroupPort> getPortList() {
        return this.portList;
    }

    @Override
    public String toString() {
        return "AppServerGroup{" + "id=" + id + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "status=" + status + "\n" + "portList=" + portList + "\n" + "}";
    }

}