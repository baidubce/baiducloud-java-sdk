package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL2PolicyRequest extends BaseBceRequest {

    /**
    * 创建规则的pfs实例短id
    */
    private String instanceId;

    /**
    * 创建规则的名称，支持大小写字母、数字、中文、半角冒号（:）、下划线（_）或者短划线（-）。必须以大小字母或中文开头，长度为1~128个英文或中文字符
    */
    private String policyName;

    /**
    * 规则对应的路径，以"/"开头，非"/"结尾
    */
    private String path;

    /**
    * 规则的过期时间，单位天，1 ～ 365*5
    */
    private Integer expiredTime;

    /**
    * 规则的类型：<br>0：表示数据删除<br>1：表示数据转存
    */
    private Integer type;

    /**
    * 规则的执行时间点，0～23整数，默认为0，范围在：0 ～ 23
    */
    private Integer executeTime;

    /**
    * 数据转存对应的bucket，当type为数据转存时，该字段必须声明
    */
    private String bucketName;

    /**
    * 数据转存对应的prefix，当type为数据转存时，该字段必须声明prefix非"/'开头，以"/"结尾
    */
    private String bucketPrefix;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateL2PolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public CreateL2PolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getPath() {
        return path;
    }

    public CreateL2PolicyRequest setPath(String path) {
        this.path = path;
        return this;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public CreateL2PolicyRequest setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CreateL2PolicyRequest setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getExecuteTime() {
        return executeTime;
    }

    public CreateL2PolicyRequest setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public String getBucketName() {
        return bucketName;
    }

    public CreateL2PolicyRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    public String getBucketPrefix() {
        return bucketPrefix;
    }

    public CreateL2PolicyRequest setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

}
