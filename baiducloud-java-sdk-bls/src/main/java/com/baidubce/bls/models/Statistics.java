package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Statistics {
    /**
     * 执行耗时（毫秒）
     */
    private Integer executionTimeInMs;

    /**
     * 扫描记录数
     */
    private Integer scanCount;

    /**
     * 扫描数据量（字节）
     */
    private Integer scanBytes;

    public Statistics setExecutionTimeInMs(Integer executionTimeInMs) {
        this.executionTimeInMs = executionTimeInMs;
        return this;
    }

    public Integer getExecutionTimeInMs() {
        return this.executionTimeInMs;
    }

    public Statistics setScanCount(Integer scanCount) {
        this.scanCount = scanCount;
        return this;
    }

    public Integer getScanCount() {
        return this.scanCount;
    }

    public Statistics setScanBytes(Integer scanBytes) {
        this.scanBytes = scanBytes;
        return this;
    }

    public Integer getScanBytes() {
        return this.scanBytes;
    }

    @Override
    public String toString() {
        return "Statistics{" + "executionTimeInMs=" + executionTimeInMs + "\n" + "scanCount=" + scanCount + "\n" + "scanBytes=" + scanBytes + "\n" + "}";
    }

}