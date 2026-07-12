package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagSelector {
    /**
     * 标签匹配表达式列表
     */
    private List<TagExpression> expressions;

    public TagSelector setExpressions(List<TagExpression> expressions) {
        this.expressions = expressions;
        return this;
    }

    public List<TagExpression> getExpressions() {
        return this.expressions;
    }

    @Override
    public String toString() {
        return "TagSelector{" + "expressions=" + expressions + "\n" + "}";
    }

}