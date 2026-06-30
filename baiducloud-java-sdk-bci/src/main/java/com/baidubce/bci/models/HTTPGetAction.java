package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HTTPGetAction {
    /**
     * HTTP Get请求检测路径
     */
    private String path;

    /**
     * HTTP Get请求检测端口号
     */
    private Integer port;

    /**
     * 协议类型：HTTP、HTTPS
     */
    private String scheme;

    /**
     * host值
     */
    private String host;

    /**
     * http header
     */
    private List<HTTPHeader> httpHeaders;

    public HTTPGetAction setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public HTTPGetAction setPort(Integer port) {
        this.port = port;
        return this;
    }

    public Integer getPort() {
        return this.port;
    }

    public HTTPGetAction setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public String getScheme() {
        return this.scheme;
    }

    public HTTPGetAction setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    public HTTPGetAction setHttpHeaders(List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public List<HTTPHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    @Override
    public String toString() {
        return "HTTPGetAction{" + "path=" + path + "\n" + "port=" + port + "\n" + "scheme=" + scheme + "\n" + "host=" + host + "\n" + "httpHeaders=" + httpHeaders + "\n" + "}";
    }

}