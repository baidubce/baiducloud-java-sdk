package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetScanInfo {
    /**
     * statistics
     */
    private Statistics statistics;

    /**
     * 是否截断
     */
    private Boolean isTruncated;

    public DatasetScanInfo setStatistics(Statistics statistics) {
        this.statistics = statistics;
        return this;
    }

    public Statistics getStatistics() {
        return this.statistics;
    }

    public DatasetScanInfo setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    @Override
    public String toString() {
        return "DatasetScanInfo{" + "statistics=" + statistics + "\n" + "isTruncated=" + isTruncated + "\n" + "}";
    }

}