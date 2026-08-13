package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRouteRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * routeName
    */
    @JsonIgnore
    private String routeName;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRouteName() {
        return routeName;
    }

    public DeleteRouteRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

}
