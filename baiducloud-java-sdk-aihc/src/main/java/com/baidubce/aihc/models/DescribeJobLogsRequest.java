package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobLogsRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 训练任务节点名称
    */
    private String podName;

    /**
    * 日志关键字查询条件，用于筛选包含指定关键字的日志
    */
    private String keywords;

    /**
    * 日志的起始时间，unix时间戳；未设置则返回 Pod 从启动以来的所有日志。有效的时间范围为1970年到当前时间
    */
    private String startTime;

    /**
    * 日志的结束时间，unix时间戳；未设置则返回 Pod 从启动以来的所有日志。有效的时间范围为1970年到当前时间
    */
    private String endTime;

    /**
    * 日志的最大行数；未设置则返回 Pod 从启动以来的所有日志。
    */
    private String maxLines;

    /**
    * 输出日志按着chunk数进行汇聚，例如将10行日志为1条记录，默认1，表示每一行日志作为1条记录
    */
    private String chunkSize;

    /**
    * 日志查询标识符，配合返回值中的 nextMarker 参数使用。使用方法为：第一次请求不写 marker 参数，获取返回值，如果 nextMarker 字段不为空，则将nextMarker 的值作为 marker 参数传入，获取更多的日志，直到 nextMarker 为空
    */
    private String marker;

    public String getJobId() {
        return jobId;
    }

    public DescribeJobLogsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getPodName() {
        return podName;
    }

    public DescribeJobLogsRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }

    public String getKeywords() {
        return keywords;
    }

    public DescribeJobLogsRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribeJobLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeJobLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getMaxLines() {
        return maxLines;
    }

    public DescribeJobLogsRequest setMaxLines(String maxLines) {
        this.maxLines = maxLines;
        return this;
    }

    public String getChunkSize() {
        return chunkSize;
    }

    public DescribeJobLogsRequest setChunkSize(String chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeJobLogsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
