package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRobotAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * robotID
    */
    @JsonIgnore
    private String robotID;

    /**
    * 是否禁用，默认是false
    */
    private Boolean disable;

    /**
    * 账号有效期，单位：天，-1表示永不过期
    */
    private Integer duration;

    /**
    * 账号描述，长度0~1024个字符
    */
    private String description;

    /**
    * 权限
    */
    private List<RobotPermission> permissions;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateRobotAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRobotID() {
        return robotID;
    }

    public UpdateRobotAccountRequest setRobotID(String robotID) {
        this.robotID = robotID;
        return this;
    }

    public Boolean getDisable() {
        return disable;
    }

    public UpdateRobotAccountRequest setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public UpdateRobotAccountRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateRobotAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<RobotPermission> getPermissions() {
        return permissions;
    }

    public UpdateRobotAccountRequest setPermissions(List<RobotPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

}
