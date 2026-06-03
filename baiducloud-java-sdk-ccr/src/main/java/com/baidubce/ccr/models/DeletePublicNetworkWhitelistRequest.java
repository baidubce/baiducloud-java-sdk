package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePublicNetworkWhitelistRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 白名单IP数组
    */
    private List<String> items;

    public String getInstanceId() {
        return instanceId;
    }

    public DeletePublicNetworkWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getItems() {
        return items;
    }

    public DeletePublicNetworkWhitelistRequest setItems(List<String> items) {
        this.items = items;
        return this;
    }

}
