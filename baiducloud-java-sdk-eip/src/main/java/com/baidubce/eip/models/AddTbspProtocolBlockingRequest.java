package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddTbspProtocolBlockingRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * DDoS增强防护包防护对象IP地址
    */
    private String ip;

    /**
    * 协议封禁端口列表
    */
    private List<TbspProtocolPortModel> protocolPortList;


    public String getId() {
        return id;
    }

    public AddTbspProtocolBlockingRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AddTbspProtocolBlockingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AddTbspProtocolBlockingRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public List<TbspProtocolPortModel> getProtocolPortList() {
        return protocolPortList;
    }

    public AddTbspProtocolBlockingRequest setProtocolPortList(List<TbspProtocolPortModel> protocolPortList) {
        this.protocolPortList = protocolPortList;
        return this;
    }


}
