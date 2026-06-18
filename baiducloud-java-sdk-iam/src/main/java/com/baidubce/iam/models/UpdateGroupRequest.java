package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateGroupRequest extends BaseBceRequest {

    /**
    * groupName
    */
    @JsonIgnore
    private String groupName;

    /**
    * 更新后的组名
    */
    private String name;

    /**
    * 组的描述
    */
    private String description;

    public String getGroupName() {
        return groupName;
    }

    public UpdateGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
