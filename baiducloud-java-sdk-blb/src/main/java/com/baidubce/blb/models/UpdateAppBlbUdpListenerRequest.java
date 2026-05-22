package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbUdpListenerRequest extends BaseBceRequest {

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
    * udp会话超时时间。默认为90，需为5-4000间的整数，单位秒
    */
    private Integer udpSessionTimeout;

    /**
    * 描述信息，长度不超过200个字符。
    */
    private String description;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbUdpListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbUdpListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public UpdateAppBlbUdpListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public String getScheduler() {
        return scheduler;
    }

    public UpdateAppBlbUdpListenerRequest setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public Integer getUdpSessionTimeout() {
        return udpSessionTimeout;
    }

    public UpdateAppBlbUdpListenerRequest setUdpSessionTimeout(Integer udpSessionTimeout) {
        this.udpSessionTimeout = udpSessionTimeout;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppBlbUdpListenerRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
