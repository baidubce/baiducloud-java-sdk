package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobWebterminalRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 训练任务节点名称
    */
    private String podName;

    /**
    * 连接超时参数，仅在建立连接时使用，单位秒，默认值30，最小值1
    */
    private String handshakeTimeoutSecond;

    /**
    * 心跳超时参数，单位秒，默认值900，最小值1，最大值3600
    */
    private String pingTimeoutSecond;

    public String getJobId() {
        return jobId;
    }

    public DescribeJobWebterminalRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getPodName() {
        return podName;
    }

    public DescribeJobWebterminalRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    public String getHandshakeTimeoutSecond() {
        return handshakeTimeoutSecond;
    }

    public DescribeJobWebterminalRequest setHandshakeTimeoutSecond(String handshakeTimeoutSecond) {
        this.handshakeTimeoutSecond = handshakeTimeoutSecond;
        return this;
    }

    public String getPingTimeoutSecond() {
        return pingTimeoutSecond;
    }

    public DescribeJobWebterminalRequest setPingTimeoutSecond(String pingTimeoutSecond) {
        this.pingTimeoutSecond = pingTimeoutSecond;
        return this;
    }

}
