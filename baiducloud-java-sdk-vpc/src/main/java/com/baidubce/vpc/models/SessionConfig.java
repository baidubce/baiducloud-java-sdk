package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionConfig {
    /**
     * tcp超时时间
     */
    private Integer tcpTimeout;

    /**
     * udp超时时间
     */
    private Integer udpTimeout;

    /**
     * icmp超时时间
     */
    private Integer icmpTimeout;

    public SessionConfig setTcpTimeout(Integer tcpTimeout) {
        this.tcpTimeout = tcpTimeout;
        return this;
    }

    public Integer getTcpTimeout() {
        return this.tcpTimeout;
    }

    public SessionConfig setUdpTimeout(Integer udpTimeout) {
        this.udpTimeout = udpTimeout;
        return this;
    }

    public Integer getUdpTimeout() {
        return this.udpTimeout;
    }

    public SessionConfig setIcmpTimeout(Integer icmpTimeout) {
        this.icmpTimeout = icmpTimeout;
        return this;
    }

    public Integer getIcmpTimeout() {
        return this.icmpTimeout;
    }

    @Override
    public String toString() {
        return "SessionConfig{" + "tcpTimeout=" + tcpTimeout + "\n" + "udpTimeout=" + udpTimeout + "\n" + "icmpTimeout=" + icmpTimeout + "\n" + "}";
    }

}