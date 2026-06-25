package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Endpoint {
    /**
     * 端口名称
     */
    private String port;

    /**
     * 采集路径
     */
    private String path;

    /**
     * 采集间隔
     */
    private String interval;

    /**
     * 匹配的 target 数量
     */
    private Integer matchedTargetCount;

    public Endpoint setPort(String port) {
        this.port = port;
        return this;
    }

    public String getPort() {
        return this.port;
    }

    public Endpoint setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public Endpoint setInterval(String interval) {
        this.interval = interval;
        return this;
    }

    public String getInterval() {
        return this.interval;
    }

    public Endpoint setMatchedTargetCount(Integer matchedTargetCount) {
        this.matchedTargetCount = matchedTargetCount;
        return this;
    }

    public Integer getMatchedTargetCount() {
        return this.matchedTargetCount;
    }

    @Override
    public String toString() {
        return "Endpoint{" + "port=" + port + "\n" + "path=" + path + "\n" + "interval=" + interval + "\n" + "matchedTargetCount=" + matchedTargetCount + "\n" + "}";
    }

}