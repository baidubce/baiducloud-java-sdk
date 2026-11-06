package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlowLogListResponse extends BaseBceResponse {

    /**
    * 慢日志下载对象
    */
    private List<OpenapiSlowlog> slowlogs;

    public List<OpenapiSlowlog> getSlowlogs() {
        return slowlogs;
    }

    public SlowLogListResponse setSlowlogs(List<OpenapiSlowlog> slowlogs) {
        this.slowlogs = slowlogs;
        return this;
    }

    @Override
    public String toString() {
        return "SlowLogListResponse{" + "slowlogs=" + slowlogs + "\n" + "}";
    }

}
