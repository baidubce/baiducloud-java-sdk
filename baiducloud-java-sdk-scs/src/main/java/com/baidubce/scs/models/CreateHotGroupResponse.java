package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateHotGroupResponse extends BaseBceResponse {

    /**
    * 热活实例组ID
    */
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public CreateHotGroupResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateHotGroupResponse{" + "groupId=" + groupId + "\n" + "}";
    }

}
