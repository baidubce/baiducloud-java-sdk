package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDataSrcResponse extends BaseBceResponse {

    /**
    * dataSrcInfo
    */
    private DataSrcInfo dataSrcInfo;

    public DataSrcInfo getDataSrcInfo() {
        return dataSrcInfo;
    }

    public DescribeDataSrcResponse setDataSrcInfo(DataSrcInfo dataSrcInfo) {
        this.dataSrcInfo = dataSrcInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeDataSrcResponse{" + "dataSrcInfo=" + dataSrcInfo + "\n" + "}";
    }

}
