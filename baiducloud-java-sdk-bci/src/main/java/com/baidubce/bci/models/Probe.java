package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Probe {
    /**
     * 检查开始执行时间，以容器启动完成为起点
     */
    private Integer initialDelaySeconds;

    /**
     * 检查超时时间，默认1秒，最小1秒
     */
    private Integer timeoutSeconds;

    /**
     * 检查执行周期，默认10秒，最小1秒
     */
    private Integer periodSeconds;

    /**
     * 重新认定成功的阈值，默认1，当前必须为1
     */
    private Integer successThreshold;

    /**
     * 认定失败的阈值，默认3
     */
    private Integer failureThreshold;

    /**
     * 程序缓冲时间，处理关闭前操作
     */
    private Long terminationGracePeriodSeconds;

    /**
     * httpGet
     */
    private HTTPGetAction httpGet;

    /**
     * tcpSocket
     */
    private TCPSocketAction tcpSocket;

    /**
     * exec
     */
    private ExecAction exec;

    /**
     * grpc
     */
    private GRPCAction grpc;

    public Probe setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public Probe setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public Probe setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public Probe setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public Probe setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public Probe setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public Probe setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public HTTPGetAction getHttpGet() {
        return this.httpGet;
    }

    public Probe setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    public TCPSocketAction getTcpSocket() {
        return this.tcpSocket;
    }

    public Probe setExec(ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public ExecAction getExec() {
        return this.exec;
    }

    public Probe setGrpc(GRPCAction grpc) {
        this.grpc = grpc;
        return this;
    }

    public GRPCAction getGrpc() {
        return this.grpc;
    }

    @Override
    public String toString() {
        return "Probe{" + "initialDelaySeconds=" + initialDelaySeconds + "\n" + "timeoutSeconds=" + timeoutSeconds + "\n" + "periodSeconds=" + periodSeconds + "\n"
                + "successThreshold=" + successThreshold + "\n" + "failureThreshold=" + failureThreshold + "\n" + "terminationGracePeriodSeconds=" + terminationGracePeriodSeconds
                + "\n" + "httpGet=" + httpGet + "\n" + "tcpSocket=" + tcpSocket + "\n" + "exec=" + exec + "\n" + "grpc=" + grpc + "\n" + "}";
    }

}