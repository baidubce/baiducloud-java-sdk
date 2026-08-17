package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerCredentialSpec {
    /**
     * 凭证名称
     */
    private String name;

    /**
     * 生成模式
     */
    private String generateMode;

    /**
     * 凭证值
     */
    private String value;

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

    /**
     * 凭证描述
     */
    private String description;

    public ConsumerCredentialSpec setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ConsumerCredentialSpec setGenerateMode(String generateMode) {
        this.generateMode = generateMode;
        return this;
    }

    public String getGenerateMode() {
        return this.generateMode;
    }

    public ConsumerCredentialSpec setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public ConsumerCredentialSpec setInHeader(Boolean inHeader) {
        this.inHeader = inHeader;
        return this;
    }

    public Boolean getInHeader() {
        return this.inHeader;
    }

    public ConsumerCredentialSpec setInQuery(Boolean inQuery) {
        this.inQuery = inQuery;
        return this;
    }

    public Boolean getInQuery() {
        return this.inQuery;
    }

    public ConsumerCredentialSpec setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    public List<String> getKeyNames() {
        return this.keyNames;
    }

    public ConsumerCredentialSpec setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "ConsumerCredentialSpec{" + "name=" + name + "\n" + "generateMode=" + generateMode + "\n" + "value=" + value + "\n" + "inHeader=" + inHeader + "\n" + "inQuery="
                + inQuery + "\n" + "keyNames=" + keyNames + "\n" + "description=" + description + "\n" + "}";
    }

}