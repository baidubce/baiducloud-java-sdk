package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAuthorizeRulesRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 批量获取列表的查询的起始位置，是一个由系统生成的字符串
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过100，缺省值为10
    */
    private Integer maxKeys;

    /**
    * 待查询的规则ID
    */
    private List<String> ruleIds;

    /**
    * 待查询的规则名称
    */
    private List<String> ruleNames;

    public String getAction() {
        return action;
    }

    public DescribeAuthorizeRulesRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAuthorizeRulesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAuthorizeRulesRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<String> getRuleIds() {
        return ruleIds;
    }

    public DescribeAuthorizeRulesRequest setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public List<String> getRuleNames() {
        return ruleNames;
    }

    public DescribeAuthorizeRulesRequest setRuleNames(List<String> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }

}
