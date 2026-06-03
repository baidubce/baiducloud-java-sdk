package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAcceleratorFiltersRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 按需加载策略ID数组
    */
    private List<Integer> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteAcceleratorFiltersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<Integer> getItems() {
        return items;
    }

    public DeleteAcceleratorFiltersRequest setItems(List<Integer> items) {
        this.items = items;
        return this;
    }

}
