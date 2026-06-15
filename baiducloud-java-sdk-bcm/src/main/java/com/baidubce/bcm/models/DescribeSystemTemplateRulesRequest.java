package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSystemTemplateRulesRequest extends BaseBceRequest {

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
    * 规则来源
    */
    private String source;

    public String getScope() {
        return scope;
    }

    public DescribeSystemTemplateRulesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeSystemTemplateRulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getSubResourceType() {
        return subResourceType;
    }

    public DescribeSystemTemplateRulesRequest setSubResourceType(String subResourceType) {
        this.subResourceType = subResourceType;
        return this;
    }

    public String getSource() {
        return source;
    }

    public DescribeSystemTemplateRulesRequest setSource(String source) {
        this.source = source;
        return this;
    }

}
