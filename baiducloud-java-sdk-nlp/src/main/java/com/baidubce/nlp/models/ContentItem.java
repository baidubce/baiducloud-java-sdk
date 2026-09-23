package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContentItem {
    /**
     * 输入文本，每段文本不超过450个字符
     */
    private String content;

    /**
     * 用户自定义的短语或问题列表，每段文本的短语或问题数量不超过5个
     */
    @JsonProperty("query_list")
    private List<QueryItem> queryList;

    public ContentItem setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public ContentItem setQueryList(List<QueryItem> queryList) {
        this.queryList = queryList;
        return this;
    }

    public List<QueryItem> getQueryList() {
        return this.queryList;
    }

    @Override
    public String toString() {
        return "ContentItem{" + "content=" + content + "\n" + "queryList=" + queryList + "\n" + "}";
    }

}