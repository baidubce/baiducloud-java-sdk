package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogListResponse extends BaseBceResponse {

    /**
    * 日志列表
    */
    private List<ShardLog> logList;

    public List<ShardLog> getLogList() {
        return logList;
    }

    public LogListResponse setLogList(List<ShardLog> logList) {
        this.logList = logList;
        return this;
    }

    @Override
    public String toString() {
        return "LogListResponse{" + "logList=" + logList + "\n" + "}";
    }

}
