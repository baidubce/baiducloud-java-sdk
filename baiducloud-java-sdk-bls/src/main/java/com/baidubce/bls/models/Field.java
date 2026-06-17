package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Field {
    /**
     * 字段的类型，支持的类型有：bool、long、text、float、json
     */
    private String type;

    /**
     * 字段索引是否区分大小写，默认false，不区分
     */
    private Boolean caseSensitive;

    /**
     * 字段索引是否包含中文，默认false，不包含
     */
    private Boolean includeChinese;

    /**
     * 字段索引自定义分隔符，不填使用默认分词符
     */
    private String separators;

    /**
     * 是否开启json动态索引，默认false，不开启
     */
    private Boolean dynamicMapping;

    /**
     * 该字段是否搜索
     */
    private Boolean searchable;

    /**
     * 该字段是否可以聚合
     */
    private Boolean aggregatable;

    /**
     * 该字段是否是元数据字段
     */
    private Boolean metadataField;

    public Field setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Field setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public Field setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    public Boolean getIncludeChinese() {
        return this.includeChinese;
    }

    public Field setSeparators(String separators) {
        this.separators = separators;
        return this;
    }

    public String getSeparators() {
        return this.separators;
    }

    public Field setDynamicMapping(Boolean dynamicMapping) {
        this.dynamicMapping = dynamicMapping;
        return this;
    }

    public Boolean getDynamicMapping() {
        return this.dynamicMapping;
    }

    public Field setSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public Field setAggregatable(Boolean aggregatable) {
        this.aggregatable = aggregatable;
        return this;
    }

    public Boolean getAggregatable() {
        return this.aggregatable;
    }

    public Field setMetadataField(Boolean metadataField) {
        this.metadataField = metadataField;
        return this;
    }

    public Boolean getMetadataField() {
        return this.metadataField;
    }

    @Override
    public String toString() {
        return "Field{" + "type=" + type + "\n" + "caseSensitive=" + caseSensitive + "\n" + "includeChinese=" + includeChinese + "\n" + "separators=" + separators + "\n"
                + "dynamicMapping=" + dynamicMapping + "\n" + "searchable=" + searchable + "\n" + "aggregatable=" + aggregatable + "\n" + "metadataField=" + metadataField + "\n"
                + "}";
    }

}