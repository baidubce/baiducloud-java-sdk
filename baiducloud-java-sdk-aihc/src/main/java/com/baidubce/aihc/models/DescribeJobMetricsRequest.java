package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobMetricsRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 可选,默认为任务启动时间
    */
    private String startTime;

    /**
    * 可选,运行中的任务默认为当前时间，已停止的任务为任务的停止时间
    */
    private String endTime;

    /**
    * 返回监控数据的时间间隔，默认值是 5 分钟。
    */
    private String timeStep;

    /**
    * 查询监控数据的指标类型，取值如下： GpuUsage：GPU 使用率。 GpuMemoryUsage：GPU Memory 使用率。 CpuUsage：CPU 使用率。 MemoryUsage：Memory 使用率。 DiskReadRate：磁盘读取速率，单位为 bytes/s。 DiskWriteRate：磁盘写入速率，单位为
    * bytes/s。 RDMASendDataRate: rdma 发送数据速度，单位为 bytes/s。 RDMARecvDataRate: rdma 接收数据速度，单位为 bytes/s。 PCIESendDataRate: pcie 发送数据速度，单位为 bytes/s。 PCIERecvDataRate: pcie 接收数据速度，单位为
    * bytes/s。 NVLinkSendDataRate: nvlink 发送数据速度，单位为 bytes/s。 NVLinkRecvDataRate: nvlink 接收数据速度，单位为 bytes/s。 GpuTemperature: gpu 温度。单位为摄氏度。 GpuPowerUsage: gpu 功率。单位为瓦w。
    * GpuPipeTensorUsage: gpu pipe tensor 使用率。 RDMAHealth: rdma 健康状态。 RDMASendErrorRate: rdma 发送端丢包率，单位为 个/s。 RDMARecvErrorRate: rdma 接收端丢包率，单位为 个/s。 RDMASendPacketsRate: rdma
    * 发包率，单位为 个/s。 RDMARecvPacketsRate: rdma 收包率，单位为 个/s。 CpuTime: cpu 使用量。 MemoryAllocation: mem 使用量，单位为 bytes。
    */
    private String metricType;

    /**
    * 指标变化周期频率，默认为5分钟
    */
    private String rateInterval;

    public String getJobId() {
        return jobId;
    }

    public DescribeJobMetricsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public DescribeJobMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public DescribeJobMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getTimeStep() {
        return timeStep;
    }

    public DescribeJobMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }

    public String getMetricType() {
        return metricType;
    }

    public DescribeJobMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    public String getRateInterval() {
        return rateInterval;
    }

    public DescribeJobMetricsRequest setRateInterval(String rateInterval) {
        this.rateInterval = rateInterval;
        return this;
    }

}
