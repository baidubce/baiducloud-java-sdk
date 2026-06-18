package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveUserFromTheGroupRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * groupName
    */
    @JsonIgnore
    private String groupName;

    public String getUserName() {
        return userName;
    }

    public RemoveUserFromTheGroupRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public RemoveUserFromTheGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
