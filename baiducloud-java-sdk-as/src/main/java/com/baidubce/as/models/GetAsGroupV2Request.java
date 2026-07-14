package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAsGroupV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public GetAsGroupV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

}
