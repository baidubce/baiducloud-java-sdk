package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrTemplate {
    /**
     * 标识第几条模板，从0开始计数
     */
    private Integer index;

    /**
     * template
     */
    private Template template;

    /**
     * 错误详情
     */
    private String message;

    public ErrTemplate setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getIndex() {
        return this.index;
    }

    public ErrTemplate setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public Template getTemplate() {
        return this.template;
    }

    public ErrTemplate setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "ErrTemplate{" + "index=" + index + "\n" + "template=" + template + "\n" + "message=" + message + "\n" + "}";
    }

}