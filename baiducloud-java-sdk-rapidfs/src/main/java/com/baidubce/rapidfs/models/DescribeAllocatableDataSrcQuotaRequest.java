package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAllocatableDataSrcQuotaRequest extends BaseBceRequest {

    /**
    * 所属 RapidFS 实例唯一 Id
    */
    private String instanceId;

    /**
    * 查询某个数据源可分配的最大配额，包含当前已分配的配额
    */
    private String dataSrcId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeAllocatableDataSrcQuotaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public DescribeAllocatableDataSrcQuotaRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

}
