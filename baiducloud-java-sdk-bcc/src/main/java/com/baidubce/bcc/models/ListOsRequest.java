package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOsRequest extends BaseBceRequest {

    /**
    * 实例ID列表
    */
    private List<String> instanceIds;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public ListOsRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
