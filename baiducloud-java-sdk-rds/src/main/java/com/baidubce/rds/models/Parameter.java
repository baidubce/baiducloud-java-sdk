package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameter {
    /**
     * 参数名
     */
    private String name;

    /**
     * 参数取值
     */
    private String value;

    /**
     * 建议参数生效方式：立即执行（immediate）、维护时间执行（timewindow）。 此参数省略或为空并from为api 系统默认applyMethod参数值为immediate参数
     */
    private String applyMethod;

    /**
     * 版本号
     */
    private String etag;

    public Parameter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Parameter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public Parameter setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
        return this;
    }

    public String getApplyMethod() {
        return this.applyMethod;
    }

    public Parameter setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public String getEtag() {
        return this.etag;
    }

    @Override
    public String toString() {
        return "Parameter{" + "name=" + name + "\n" + "value=" + value + "\n" + "applyMethod=" + applyMethod + "\n" + "etag=" + etag + "\n" + "}";
    }

}