package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainBinlogInformationResponse extends BaseBceResponse {

    /**
    * binlog
    */
    private Binlog binlog;

    public Binlog getBinlog() {
        return binlog;
    }

    public ObtainBinlogInformationResponse setBinlog(Binlog binlog) {
        this.binlog = binlog;
        return this;
    }

    @Override
    public String toString() {
        return "ObtainBinlogInformationResponse{" + "binlog=" + binlog + "\n" + "}";
    }

}
