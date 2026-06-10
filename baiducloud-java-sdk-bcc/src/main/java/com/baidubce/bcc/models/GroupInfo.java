package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupInfo {
    /**
     * 资源组id
     */
    private String groupId;

    /**
     * 资源组名称
     */
    private String groupName;

    public GroupInfo setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public GroupInfo setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public String toString() {
        return "GroupInfo{" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "}";
    }

}