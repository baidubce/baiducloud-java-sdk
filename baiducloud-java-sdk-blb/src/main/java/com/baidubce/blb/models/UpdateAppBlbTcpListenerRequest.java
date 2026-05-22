package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbTcpListenerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * listenerPort
    */
    @JsonIgnore
    private Integer listenerPort;

    /**
    * 负载均衡算法，支持3种方式："RoundRobin"/"LeastConnection"/"Hash"，"RoundRobin"代表加权轮询、"LeastConnection"代表最小连接数、"Hash"代表根据源ip哈希
    */
    private String scheduler;

    /**
    * tcp设置连接超时时间（单位：秒），默认900，需为10-4000间的整数
    */
    private Integer tcpSessionTimeout;

    /**
    * 描述信息，长度不超过200个字符。
    */
    private String description;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbTcpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbTcpListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public UpdateAppBlbTcpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public UpdateAppBlbTcpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Integer getTcpSessionTimeout() {
        return tcpSessionTimeout;
    }

    public UpdateAppBlbTcpListenerRequest setTcpSessionTimeout(Integer tcpSessionTimeout) {
        this.tcpSessionTimeout = tcpSessionTimeout;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppBlbTcpListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
