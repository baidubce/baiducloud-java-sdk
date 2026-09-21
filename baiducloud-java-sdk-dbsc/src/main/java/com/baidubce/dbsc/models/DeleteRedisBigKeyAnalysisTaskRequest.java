package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRedisBigKeyAnalysisTaskRequest extends BaseBceRequest {

    /**
    * ids
    */
    @JsonIgnore
    private List ids;

    /**
    * 集群ID
    */
    private String appId;

    public List getIds() {
        return ids;
    }

    public DeleteRedisBigKeyAnalysisTaskRequest setIds(List ids) {
        this.ids = ids;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public DeleteRedisBigKeyAnalysisTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

}
