package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultContent {
    /**
     * 原文本内容
     */
    private String content;

    /**
     * 针对原文本提出的所有query的返回结果列表
     */
    private List<TxtMonetResult> results;

    public ResultContent setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public ResultContent setResults(List<TxtMonetResult> results) {
        this.results = results;
        return this;
    }

    public List<TxtMonetResult> getResults() {
        return this.results;
    }

    @Override
    public String toString() {
        return "ResultContent{" + "content=" + content + "\n" + "results=" + results + "\n" + "}";
    }

}