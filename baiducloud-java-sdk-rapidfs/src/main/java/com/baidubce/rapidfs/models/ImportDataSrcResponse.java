package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportDataSrcResponse extends BaseBceResponse {

    /**
    * 数据源唯一ID
    */
    private String dataSrcId;

    public String getDataSrcId() {
        return dataSrcId;
    }

    public ImportDataSrcResponse setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    @Override
    public String toString() {
        return "ImportDataSrcResponse{" + "dataSrcId=" + dataSrcId + "\n" + "}";
    }

}
