package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Robot {
    /**
     * 机器人账号 ID
     */
    private Integer id;

    /**
     * 账号名称
     */
    private String name;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 等级，固定为 `system`
     */
    private String level;

    /**
     * 是否禁用
     */
    private Boolean disable;

    /**
     * 账号剩余有效期，单位：天，`-1` 表示永不过期
     */
    private Integer duration;

    /**
     * 过期时间，Unix 时间戳，`-1` 表示永不过期
     */
    private Integer expiresAt;

    /**
     * 创建时间
     */
    private String creationTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 权限列表
     */
    private List<RobotPermission> permissions;

    public Robot setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public Robot setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Robot setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Robot setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getLevel() {
        return this.level;
    }

    public Robot setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    public Boolean getDisable() {
        return this.disable;
    }

    public Robot setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public Robot setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Integer getExpiresAt() {
        return this.expiresAt;
    }

    public Robot setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public Robot setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Robot setPermissions(List<RobotPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public List<RobotPermission> getPermissions() {
        return this.permissions;
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "level=" + level + "\n" + "disable=" + disable + "\n" + "duration="
                + duration + "\n" + "expiresAt=" + expiresAt + "\n" + "creationTime=" + creationTime + "\n" + "updateTime=" + updateTime + "\n" + "permissions=" + permissions
                + "\n" + "}";
    }

}