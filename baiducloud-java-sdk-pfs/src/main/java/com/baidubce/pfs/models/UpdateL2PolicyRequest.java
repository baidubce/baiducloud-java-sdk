package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateL2PolicyRequest extends BaseBceRequest {

    /**
    * policyId对应的pfs实例短id
    */
    private String instanceId;

    /**
    * 需要修改policyId
    */
    private String policyId;

    /**
    * 新规则的名称，支持大小写字母、数字、中文、半角冒号（:）、下划线（_）或者短划线（-）。必须以大小字母或中文开头，长度为1~128个英文或中文字符
    */
    private String newPolicyName;

    /**
    * 规则的过期时间，单位天，1 ～ 365*5
    */
    private Integer expiredTime;

    /**
    * 规则的执行时间点，0～23整数，默认为0，范围在：0 ～ 23
    */
    private Integer executeTime;

    /**
    * 数据转存对应的bucket
    */
    private String bucketName;

    /**
    * 数据转存对应的prefix，非"/"开头，以"/"结尾
    */
    private String bucketPrefix;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateL2PolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public UpdateL2PolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getNewPolicyName() {
        return newPolicyName;
    }

    public UpdateL2PolicyRequest setNewPolicyName(String newPolicyName) {
        this.newPolicyName = newPolicyName;
        return this;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public UpdateL2PolicyRequest setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public Integer getExecuteTime() {
        return executeTime;
    }

    public UpdateL2PolicyRequest setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public String getBucketName() {
        return bucketName;
    }

    public UpdateL2PolicyRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    public String getBucketPrefix() {
        return bucketPrefix;
    }

    public UpdateL2PolicyRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

}
