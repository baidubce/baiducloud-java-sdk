package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbSpaceSummaryRequest extends BaseBceRequest {

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

    public String getNodeId() {
        return nodeId;
    }

    public GetMongodbSpaceSummaryRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

}
