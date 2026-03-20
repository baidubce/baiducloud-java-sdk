package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspIpModel {
    /**
     * DDoS增强防护包绑定防护对象IP地址
     */
    private String ip;

    /**
     * DDoS增强防护包绑定防护对象运行状态
     */
    private String status;

    public TbspIpModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public TbspIpModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "TbspIpModel{" + "ip=" + ip + "\n" + "status=" + status + "\n" + "}";
    }

}