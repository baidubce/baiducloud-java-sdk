package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBackupStrategyResponse extends BaseBceResponse {

    /**
    * 备份时间。
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
    * 是否开启加密 <li>no 不开启 <li> yes 开启
    */
    private String isEncrypt;

    public String getBackupTime() {
        return backupTime;
    }

    public GetBackupStrategyResponse setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    public String getBackupDays() {
        return backupDays;
    }

    public GetBackupStrategyResponse setBackupDays(String backupDays) {
        this.backupDays = backupDays;
        return this;
    }

    public Integer getExpireDay() {
        return expireDay;
    }

    public GetBackupStrategyResponse setExpireDay(Integer expireDay) {
        this.expireDay = expireDay;
        return this;
    }

    public String getIsEncrypt() {
        return isEncrypt;
    }

    public GetBackupStrategyResponse setIsEncrypt(String isEncrypt) {
        this.isEncrypt = isEncrypt;
        return this;
    }

    @Override
    public String toString() {
        return "GetBackupStrategyResponse{" + "backupTime=" + backupTime + "\n" + "backupDays=" + backupDays + "\n" + "expireDay=" + expireDay + "\n" + "isEncrypt=" + isEncrypt
                + "\n" + "}";
    }

}
