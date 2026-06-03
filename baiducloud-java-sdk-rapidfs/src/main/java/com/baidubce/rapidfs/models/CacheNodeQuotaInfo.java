package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheNodeQuotaInfo {
    /**
     * 已添加的 CacheNode 数量
     */
    private Integer used;

    /**
     * CacheNode 节点数配额上限
     */
    private Integer quota;

    public CacheNodeQuotaInfo setUsed(Integer used) {
        this.used = used;
        return this;
    }

    public Integer getUsed() {
        return this.used;
    }

    public CacheNodeQuotaInfo setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    public Integer getQuota() {
        return this.quota;
    }

    @Override
    public String toString() {
        return "CacheNodeQuotaInfo{" + "used=" + used + "\n" + "quota=" + quota + "\n" + "}";
    }

}