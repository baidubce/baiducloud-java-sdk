package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateL3AccessRuleRequest extends BaseBceRequest {

    /**
    * 权限组名称（定位键）
    */
    private String accessGroupName;

    /**
    * 可用区名称（定位键）
    */
    private String zoneName;

    /**
    * 要修改的访问规则 ID（定位键）
    */
    private Integer accessRuleId;

    /**
    * IP 地址，例如 192.168.1.0
    */
    private String ip;

    /**
    * 子网掩码长度，例如 24
    */
    private Integer mask;

    /**
    * 读写权限，read_only（只读）/ read_write（读写）
    */
    private String writeAccess;

    /**
    * 用户权限，no_squash / root_squash / all_squash
    */
    private String userAccess;

    /**
    * 规则优先级
    */
    private Integer priority;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public UpdateL3AccessRuleRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public UpdateL3AccessRuleRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getAccessRuleId() {
        return accessRuleId;
    }

    public UpdateL3AccessRuleRequest setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public UpdateL3AccessRuleRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Integer getMask() {
        return mask;
    }

    public UpdateL3AccessRuleRequest setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public String getWriteAccess() {
        return writeAccess;
    }

    public UpdateL3AccessRuleRequest setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getUserAccess() {
        return userAccess;
    }

    public UpdateL3AccessRuleRequest setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public UpdateL3AccessRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
