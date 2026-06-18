package com.baidubce.iam.models;

import java.lang.String;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachedEntities {
    /**
     * 主体 id
     */
    private String id;

    /**
     * 主体名称
     */
    private String name;

    /**
     * UserPolicy或 GroupPolicy
     */
    private String type;

    /**
     * 策略被授予时间
     */
    private String attachTime;

    public AttachedEntities setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public AttachedEntities setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AttachedEntities setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public AttachedEntities setAttachTime(String attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    public String getAttachTime() {
        return this.attachTime;
    }

    @Override
    public String toString() {
        return "AttachedEntities{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "attachTime=" + attachTime + "\n" + "}";
    }

}