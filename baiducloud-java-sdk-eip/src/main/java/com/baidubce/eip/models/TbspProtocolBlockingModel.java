
package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspProtocolBlockingModel  {
    /**
     * DDoS增强防护包防护对象IP地址
     */
    private String ip;

    /**
     * DDoS增强防护包协议封禁端口列表信息
     */
    private List<TbspProtocolPortModel> protocolPortList;

    public TbspProtocolBlockingModel setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public TbspProtocolBlockingModel setProtocolPortList(List<TbspProtocolPortModel> protocolPortList) {
        this.protocolPortList = protocolPortList;
        return this;
    }

    public List<TbspProtocolPortModel> getProtocolPortList() {
        return this.protocolPortList;
    }

    @Override
    public String toString() {
        return "TbspProtocolBlockingModel{"
                + "ip=" + ip + "\n"
                + "protocolPortList=" + protocolPortList + "\n"
                + "}";
    }




}