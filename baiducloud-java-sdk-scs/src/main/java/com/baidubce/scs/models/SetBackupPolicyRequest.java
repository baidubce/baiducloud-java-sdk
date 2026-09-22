package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetBackupPolicyRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 备份时间。<li>未填写该参数时，备份时间默认修改为1:05:00。
    */
    private String backupTime;

    /**
    * 备份周期。
    */
    private String backupDays;

    /**
    * 备份文件保留时长，可选范围： 1-15天
    */
    private Integer expireDay;

    /**
    * 是否开启加密 no 不开启 yes 开启
    */
    private String isEncrypt;

    public String getInstanceId() {
        return instanceId;
    }

    public SetBackupPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBackupTime() {
        return backupTime;
    }

    public SetBackupPolicyRequest setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    public String getBackupDays() {
        return backupDays;
    }

    public SetBackupPolicyRequest setBackupDays(String backupDays) {
        this.backupDays = backupDays;
        return this;
    }

    public Integer getExpireDay() {
        return expireDay;
    }

    public SetBackupPolicyRequest setExpireDay(Integer expireDay) {
        this.expireDay = expireDay;
        return this;
    }

    public String getIsEncrypt() {
        return isEncrypt;
    }

    public SetBackupPolicyRequest setIsEncrypt(String isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

}
