package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmPolicyResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 策略ID
    */
    private String id;

    /**
    * 策略名称
    */
    private String name;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 子资源类型（当requireSubResourceType=true时返回）
    */
    private String subResourceType;

    /**
    * target
    */
    private AlarmTarget target;

    /**
    * 报警规则列表
    */
    private List<AlarmRule> rules;

    /**
    * 报警通知项列表
    */
    private List<PolicyAction> actions;

    /**
    * 创建时间，UTC格式
    */
    private String createdTime;

    /**
    * 更新时间，UTC格式
    */
    private String updatedTime;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeAlarmPolicyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeAlarmPolicyResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeAlarmPolicyResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeAlarmPolicyResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeAlarmPolicyResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeAlarmPolicyResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeAlarmPolicyResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public DescribeAlarmPolicyResponse setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public AlarmTarget getTarget() {
        return target;
    }

    public DescribeAlarmPolicyResponse setTarget(AlarmTarget target) {
        this.target = target;
        return this;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public DescribeAlarmPolicyResponse setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    public List<PolicyAction> getActions() {
        return actions;
    }

    public DescribeAlarmPolicyResponse setActions(List<PolicyAction> actions) {
        this.actions = actions;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public DescribeAlarmPolicyResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public DescribeAlarmPolicyResponse setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmPolicyResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "name=" + name + "\n"
                + "scope=" + scope + "\n" + "resourceType=" + resourceType + "\n" + "subResourceType=" + subResourceType + "\n" + "target=" + target + "\n" + "rules=" + rules
                + "\n" + "actions=" + actions + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime + "\n" + "}";
    }

}
