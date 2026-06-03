package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteTriggersRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 触发器策略ID数组
    */
    private List<Integer> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteTriggersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Integer> getItems() {
        return items;
    }

    public DeleteTriggersRequest setItems(List<Integer> items) {
        this.items = items;
        return this;
    }

}
