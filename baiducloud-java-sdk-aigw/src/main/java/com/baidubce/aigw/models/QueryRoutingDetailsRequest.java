package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryRoutingDetailsRequest extends BaseBceRequest {

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

    public QueryRoutingDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRouteName() {
        return routeName;
    }

    public QueryRoutingDetailsRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

}
