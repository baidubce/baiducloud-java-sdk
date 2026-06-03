package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescL2PolicyResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 规则ID
    */
    private String policyId;

    /**
    * 规则名字
    */
    private String policyName;

    /**
    * 规则所属实例ID
    */
    private String instanceId;

    /**
    * 规则生效路径
    */
    private String path;

    /**
    * 规则过期时间
    */
    private Integer expiredTime;

    /**
    * 规则创建时间
    */
    private String createTime;

    /**
    * 规则执行时间点
    */
    private Integer executeTime;

    /**
    * policy类型。ttl or export
    */
    private Integer type;

    /**
    * 如果是导出类型，返回导出的bos bucket路径
    */
    private String bosPath;

    /**
    * 规则当前状态：<br><li>0：生效中<br><li>1：运行中<br><li>2：删除中<br><li>3：失败
    */
    private Integer status;

    public String getRequestId() {
        return requestId;
    }

    public DescL2PolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public DescL2PolicyResponse setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyName() {
        return policyName;
    }

    public DescL2PolicyResponse setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DescL2PolicyResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPath() {
        return path;
    }

    public DescL2PolicyResponse setPath(String path) {
        this.path = path;
        return this;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public DescL2PolicyResponse setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescL2PolicyResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getExecuteTime() {
        return executeTime;
    }

    public DescL2PolicyResponse setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public DescL2PolicyResponse setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getBosPath() {
        return bosPath;
    }

    public DescL2PolicyResponse setBosPath(String bosPath) {
        this.bosPath = bosPath;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public DescL2PolicyResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "DescL2PolicyResponse{" + "requestId=" + requestId + "\n" + "policyId=" + policyId + "\n" + "policyName=" + policyName + "\n" + "instanceId=" + instanceId + "\n"
                + "path=" + path + "\n" + "expiredTime=" + expiredTime + "\n" + "createTime=" + createTime + "\n" + "executeTime=" + executeTime + "\n" + "type=" + type + "\n"
                + "bosPath=" + bosPath + "\n" + "status=" + status + "\n" + "}";
    }

}
