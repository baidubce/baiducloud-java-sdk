package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmTemplateResponse extends BaseBceResponse {

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
    * 报警模板ID
    */
    private String id;

    /**
    * 云产品类型
    */
    private String scope;

    /**
    * 资源类型
    */
    private String resourceType;

    /**
    * 子资源类型
    */
    private String subResourceType;

    /**
    * 模板名称
    */
    private String name;

    /**
    * 备注信息
    */
    private String comment;

    /**
    * 报警规则列表
    */
    private List<AlarmRule> rules;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeAlarmTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeAlarmTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeAlarmTemplateResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeAlarmTemplateResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeAlarmTemplateResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeAlarmTemplateResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public DescribeAlarmTemplateResponse setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeAlarmTemplateResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public DescribeAlarmTemplateResponse setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public DescribeAlarmTemplateResponse setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmTemplateResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "id=" + id + "\n" + "scope=" + scope + "\n"
                + "resourceType=" + resourceType + "\n" + "subResourceType=" + subResourceType + "\n" + "name=" + name + "\n" + "comment=" + comment + "\n" + "rules=" + rules
                + "\n" + "}";
    }

}
