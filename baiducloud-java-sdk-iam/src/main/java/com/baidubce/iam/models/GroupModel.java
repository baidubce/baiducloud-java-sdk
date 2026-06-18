package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupModel {
    /**
     * 组id
     */
    private String id;

    /**
     * 组名称
     */
    private String name;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 组描述
     */
    private String description;

    public GroupModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public GroupModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public GroupModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public GroupModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "GroupModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "createTime=" + createTime + "\n" + "description=" + description + "\n" + "}";
    }

}