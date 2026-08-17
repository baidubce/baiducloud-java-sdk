package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerCredentialLocation {
    /**
     * 是否放入请求头
     */
    private Boolean inHeader;

    /**
     * 是否放入查询参数
     */
    private Boolean inQuery;

    /**
     * 凭证键名
     */
    private List<String> keyNames;

    public ConsumerCredentialLocation setInHeader(Boolean inHeader) {
        this.inHeader = inHeader;
        return this;
    }

    public Boolean getInHeader() {
        return this.inHeader;
    }

    public ConsumerCredentialLocation setInQuery(Boolean inQuery) {
        this.inQuery = inQuery;
        return this;
    }

    public Boolean getInQuery() {
        return this.inQuery;
    }

    public ConsumerCredentialLocation setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    public List<String> getKeyNames() {
        return this.keyNames;
    }

    @Override
    public String toString() {
        return "ConsumerCredentialLocation{" + "inHeader=" + inHeader + "\n" + "inQuery=" + inQuery + "\n" + "keyNames=" + keyNames + "\n" + "}";
    }

}