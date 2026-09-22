package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHotGroupDetailRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public GetHotGroupDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

}
