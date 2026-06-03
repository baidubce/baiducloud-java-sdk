package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRobotAccountRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 机器人账号名称。注意：创建成功后的机器人账号会自动加上前缀`ccr$`，如填写 test，则实际使用的用户名为：ccr$test。<br> 长度限制在1~65之间，必须以小写字母或数字开头和结尾，支持小写字母、数字及特殊字符._-，但特殊字符不可连续
    */
    private String name;

    /**
    * 账号密码，如果不填则由系统自动生成。<br>长度8~65，必须包含大、小写字母、数字或特殊字符，特殊字符允许!@#$%^*()
    */
    private String secret;

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

    public CreateRobotAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateRobotAccountRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public CreateRobotAccountRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public Boolean getDisable() {
        return disable;
    }

    public CreateRobotAccountRequest setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public CreateRobotAccountRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateRobotAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<RobotPermission> getPermissions() {
        return permissions;
    }

    public CreateRobotAccountRequest setPermissions(List<RobotPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

}
