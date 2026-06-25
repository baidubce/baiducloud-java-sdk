package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScopeDetail {
    /**
     * 云产品英文名称，如 `BCE_BCC`
     */
    private String scopeName;

    /**
     * 云产品说明
     */
    private String humanization;

    /**
     * BCM 文档链接
     */
    private String docLink;

    public ScopeDetail setScopeName(String scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    public String getScopeName() {
        return this.scopeName;
    }

    public ScopeDetail setHumanization(String humanization) {
        this.humanization = humanization;
        return this;
    }

    public String getHumanization() {
        return this.humanization;
    }

    public ScopeDetail setDocLink(String docLink) {
        this.docLink = docLink;
        return this;
    }

    public String getDocLink() {
        return this.docLink;
    }

    @Override
    public String toString() {
        return "ScopeDetail{" + "scopeName=" + scopeName + "\n" + "humanization=" + humanization + "\n" + "docLink=" + docLink + "\n" + "}";
    }

}