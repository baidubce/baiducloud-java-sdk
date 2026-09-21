package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conclusion {
    /**
     * 诊断结论，可选 [ normal（正常）, abnormal（异常）, failed（失败） ]
     */
    private String result;

    /**
     * 问题描述
     */
    private String problem;

    /**
     * 原因分析
     */
    private String cause;

    /**
     * 修复建议
     */
    private String suggestion;

    public Conclusion setResult(String result) {
        this.result = result;
        return this;
    }

    public String getResult() {
        return this.result;
    }

    public Conclusion setProblem(String problem) {
        this.problem = problem;
        return this;
    }

    public String getProblem() {
        return this.problem;
    }

    public Conclusion setCause(String cause) {
        this.cause = cause;
        return this;
    }

    public String getCause() {
        return this.cause;
    }

    public Conclusion setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    @Override
    public String toString() {
        return "Conclusion{" + "result=" + result + "\n" + "problem=" + problem + "\n" + "cause=" + cause + "\n" + "suggestion=" + suggestion + "\n" + "}";
    }

}