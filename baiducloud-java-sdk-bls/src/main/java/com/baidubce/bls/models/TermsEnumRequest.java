package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TermsEnumRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * 索引字段名称，不支持模糊匹配
    */
    private String field;

    /**
    * 用于前缀匹配的字符串。比如 "ki" 会匹配以 ki 开头的 terms
    */
    private String string;

    /**
    * 返回多少个terms 默认 10
    */
    private Integer size;

    /**
    * 限制从哪些文档里枚举 terms，语法同普通query DSL
    */
    private Object indexFilter;

    public String getName() {
        return name;
    }

    public TermsEnumRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getField() {
        return field;
    }

    public TermsEnumRequest setField(String field) {
        this.field = field;
        return this;
    }

    public String getString() {
        return string;
    }

    public TermsEnumRequest setString(String string) {
        this.string = string;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public TermsEnumRequest setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Object getIndexFilter() {
        return indexFilter;
    }

    public TermsEnumRequest setIndexFilter(Object indexFilter) {
        this.indexFilter = indexFilter;
        return this;
    }

}
