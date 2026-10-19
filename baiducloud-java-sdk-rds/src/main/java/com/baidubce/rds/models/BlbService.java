package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlbService {
    /**
     * 服务状态，有以下几种状态： notCreated（没创建）。  creating（创建中）。   created（已创建）。   deleting（删除中）。  deleted （已删除）。
     */
    private String status;

    /**
     * 服务的域名。
     */
    private String service;

    public BlbService setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public BlbService setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    @Override
    public String toString() {
        return "BlbService{" + "status=" + status + "\n" + "service=" + service + "\n" + "}";
    }

}