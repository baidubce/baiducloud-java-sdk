package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstancesRequest extends BaseBceRequest {

    /**
    * 实例Id列表
    */
    private List<String> instanceIds;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public DeleteInstancesRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
