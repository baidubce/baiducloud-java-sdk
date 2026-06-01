package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MllmResourceDumpConfig {
    /**
     * 转储时长，单位：天
     */
    private Integer retentionDays;

    /**
     * BOS Bucket名称
     */
    private String bucket;

    public MllmResourceDumpConfig setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public MllmResourceDumpConfig setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public String getBucket() {
        return this.bucket;
    }

    @Override
    public String toString() {
        return "MllmResourceDumpConfig{" + "retentionDays=" + retentionDays + "\n" + "bucket=" + bucket + "\n" + "}";
    }

}