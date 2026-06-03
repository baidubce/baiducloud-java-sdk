package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAllocatableDataSrcQuotaResponse extends BaseBceResponse {

    /**
    * dataSrcQuotaInfo
    */
    private DataSrcQuotaInfo dataSrcQuotaInfo;

    public DataSrcQuotaInfo getDataSrcQuotaInfo() {
        return dataSrcQuotaInfo;
    }

    public DescribeAllocatableDataSrcQuotaResponse setDataSrcQuotaInfo(DataSrcQuotaInfo dataSrcQuotaInfo) {
        this.dataSrcQuotaInfo = dataSrcQuotaInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAllocatableDataSrcQuotaResponse{" + "dataSrcQuotaInfo=" + dataSrcQuotaInfo + "\n" + "}";
    }

}
