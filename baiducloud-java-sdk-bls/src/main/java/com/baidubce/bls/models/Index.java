package com.baidubce.bls.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Index {
    /**
     * 是否开启全文索引，默认false，不开启
     */
    private Boolean fulltext;

    /**
     * 全文索引是否区分大小写，默认false，不区分
     */
    private Boolean caseSensitive;

    /**
     * 全文索引是否包含中文，默认false，不包含
     */
    private Boolean includeChinese;

    /**
     * 全文索引自定义分隔符，不填使用默认分词符
     */
    private String separators;

    /**
     * 关键字索引包含的字段名称及类型定义
     */
    private Map<String, Field> fields;

    public Index setFulltext(Boolean fulltext) {
        this.fulltext = fulltext;
        return this;
    }

    public Boolean getFulltext() {
        return this.fulltext;
    }

    public Index setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public Index setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    public Boolean getIncludeChinese() {
        return this.includeChinese;
    }

    public Index setSeparators(String separators) {
        this.separators = separators;
        return this;
    }

    public String getSeparators() {
        return this.separators;
    }

    public Index setFields(Map<String, Field> fields) {
        this.fields = fields;
        return this;
    }

    public Map<String, Field> getFields() {
        return this.fields;
    }

    @Override
    public String toString() {
        return "Index{" + "fulltext=" + fulltext + "\n" + "caseSensitive=" + caseSensitive + "\n" + "includeChinese=" + includeChinese + "\n" + "separators=" + separators + "\n"
                + "fields=" + fields + "\n" + "}";
    }

}