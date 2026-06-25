package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGroup {
    /**
     * 用户组ID
     */
    private String groupId;

    /**
     * 用户组名称
     */
    private String groupName;

    /**
     * 用户组描述
     */
    private String description;

    public UserGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public UserGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserGroup setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "UserGroup{" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n" + "description=" + description + "\n" + "}";
    }

}