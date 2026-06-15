package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmTemplateRequest extends BaseBceRequest {

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
    * 报警规则列表（OR规则）
    */
    private List<AlarmRule> rules;

    public String getId() {
        return id;
    }

    public UpdateAlarmTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public UpdateAlarmTemplateRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public UpdateAlarmTemplateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public UpdateAlarmTemplateRequest setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAlarmTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UpdateAlarmTemplateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public UpdateAlarmTemplateRequest setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

}
