package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PodMetricsEndpoint {
    /**
     * 采集间隔，如：15s，可不传，默认为 15s
     */
    private String interval;

    /**
     * 采集路径，如：/metrics 可不传，默认为 /metrics
     */
    private String path;

    /**
     * 对应 Pod 的 port name，注意不是端口号
     */
    private String port;

    public PodMetricsEndpoint setInterval(String interval) {
        this.interval = interval;
        return this;
    }

    public String getInterval() {
        return this.interval;
    }

    public PodMetricsEndpoint setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public PodMetricsEndpoint setPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return this.port;
    }

    @Override
    public String toString() {
        return "PodMetricsEndpoint{" + "interval=" + interval + "\n" + "path=" + path + "\n" + "port=" + port + "\n" + "}";
    }

}