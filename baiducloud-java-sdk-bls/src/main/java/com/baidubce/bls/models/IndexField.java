package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndexField {
    /**
     * 字段索引类型
     */
    private String type;

    /**
     * 是否开启大小写敏感，默认false，不开启大小写敏感
     */
    private Boolean caseSensitive;

    /**
     * 是否包含中文，默认为false，不包含中文
     */
    private Boolean includeChinese;

    /**
     * 分词符，不填使用默认分词符
     */
    private String separators;

    /**
     * 是否开启动态mapping
     */
    private Boolean dynamicMapping;

    public IndexField setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public IndexField setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public IndexField setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    public Boolean getIncludeChinese() {
        return this.includeChinese;
    }

    public IndexField setSeparators(String separators) {
        this.separators = separators;
        return this;
    }

    public String getSeparators() {
        return this.separators;
    }

    public IndexField setDynamicMapping(Boolean dynamicMapping) {
        this.dynamicMapping = dynamicMapping;
        return this;
    }

    public Boolean getDynamicMapping() {
        return this.dynamicMapping;
    }

    @Override
    public String toString() {
        return "IndexField{" + "type=" + type + "\n" + "caseSensitive=" + caseSensitive + "\n" + "includeChinese=" + includeChinese + "\n" + "separators=" + separators + "\n"
                + "dynamicMapping=" + dynamicMapping + "\n" + "}";
    }

}