package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSrcQuotaInfo {
    /**
     * 所属 RapidFS 实例唯一 Id
     */
    private String instanceId;

    /**
     * 请求中如果指定具体的 dataSrcId，表示该数据源可分配的最大数据源配额，包含当前已分配的配额。请求中未指定具体的 dataSrcId 时，表示 RapidFS 实例可分配的数据源配额
     */
    private Long allocatableQuotaMiB;

    public DataSrcQuotaInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public DataSrcQuotaInfo setAllocatableQuotaMiB(Long allocatableQuotaMiB) {
        this.allocatableQuotaMiB = allocatableQuotaMiB;
        return this;
    }

    public Long getAllocatableQuotaMiB() {
        return this.allocatableQuotaMiB;
    }

    @Override
    public String toString() {
        return "DataSrcQuotaInfo{" + "instanceId=" + instanceId + "\n" + "allocatableQuotaMiB=" + allocatableQuotaMiB + "\n" + "}";
    }

}