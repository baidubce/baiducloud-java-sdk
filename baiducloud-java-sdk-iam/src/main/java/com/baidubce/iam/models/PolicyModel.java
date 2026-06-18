package com.baidubce.iam.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyModel {
    /**
     * 策略id
     */
    private String id;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略类型，可选：Custom - 自定义策略；System - 系统内置策略
     */
    private String type;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 绑定时间
     */
    private String attachTime;

    /**
     * 策略描述
     */
    private String description;

    /**
     * 策略内容，要求为ACL格式序列化后得到的String
     */
    private String document;

    public PolicyModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PolicyModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public PolicyModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public PolicyModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public PolicyModel setAttachTime(String attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    public String getAttachTime() {
        return this.attachTime;
    }

    public PolicyModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public PolicyModel setDocument(String document) {
        this.document = document;
        return this;
    }

    public String getDocument() {
        return this.document;
    }

    @Override
    public String toString() {
        return "PolicyModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "createTime=" + createTime + "\n" + "attachTime=" + attachTime + "\n"
                + "description=" + description + "\n" + "document=" + document + "\n" + "}";
    }

}