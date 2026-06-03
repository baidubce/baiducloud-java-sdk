package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDataSrcRequest extends BaseBceRequest {

    /**
    * RapidFS 实例ID
    */
    private String instanceId;

    /**
    * 待修改的数据源 ID
    */
    private String dataSrcId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeDataSrcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public DescribeDataSrcRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

}
