package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Agent {
    /**
     * host
     */
    private Host host;

    /**
     * bsm-agent状态。枚举值：ONLINE（在线），OFFLINE（离线）
     */
    private String state;

    /**
     * bsm-agent版本号，如4.2.0.1
     */
    private String version;

    public Agent setHost(Host host) {
        this.host = host;
        return this;
    }

    public Host getHost() {
        return this.host;
    }

    public Agent setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Agent setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    @Override
    public String toString() {
        return "Agent{" + "host=" + host + "\n" + "state=" + state + "\n" + "version=" + version + "\n" + "}";
    }

}