package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListUsersWithinTheGroupRequest extends BaseBceRequest {

    /**
    * groupName
    */
    @JsonIgnore
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public ListUsersWithinTheGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
