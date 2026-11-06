package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveTheBinlogListResponse extends BaseBceResponse {

    /**
    * binlog 列表结果
    */
    private List<Binlogs> binlogs;

    public List<Binlogs> getBinlogs() {
        return binlogs;
    }

    public RetrieveTheBinlogListResponse setBinlogs(List<Binlogs> binlogs) {
        this.binlogs = binlogs;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveTheBinlogListResponse{" + "binlogs=" + binlogs + "\n" + "}";
    }

}
