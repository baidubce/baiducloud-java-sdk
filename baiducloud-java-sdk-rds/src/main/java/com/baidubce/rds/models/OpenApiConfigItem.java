package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OpenApiConfigItem {
    /**
     * 参数名
     */
    private String name;

    /**
     * 参数的默认值
     */
    private String defaultValue;

    /**
     * 当前参数值
     */
    private String value;

    /**
     * 待定值，默认为""
     */
    private String pendingValue;

    /**
     * 参数类型："integer"，"string"，"float"等
     */
    private String type;

    /**
     * 是否热加载，"true":为热加载参数，"false":为非热加载参数
     */
    private String dynamic;

    /**
     * 是否可修改参数，"true"：是，"false"：不是
     */
    private String modifiable;

    /**
     * 可修改参数值
     */
    private String allowedValues;

    /**
     * 描述信息
     */
    private String desc;

    /**
     * 修改版本号，如V1
     */
    private String etag;

    /**
     * 
     */
    private String configType;

    /**
     * 建议实践值
     */
    private String bestValue;

    /**
     * 注意事项
     */
    private String attention;

    /**
     * 是否重启， true:是 、false：否
     */
    private Boolean ifCluster;

    public OpenApiConfigItem setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public OpenApiConfigItem setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public OpenApiConfigItem setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public OpenApiConfigItem setPendingValue(String pendingValue) {
        this.pendingValue = pendingValue;
        return this;
    }

    public String getPendingValue() {
        return this.pendingValue;
    }

    public OpenApiConfigItem setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public OpenApiConfigItem setDynamic(String dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    public String getDynamic() {
        return this.dynamic;
    }

    public OpenApiConfigItem setModifiable(String modifiable) {
        this.modifiable = modifiable;
        return this;
    }

    public String getModifiable() {
        return this.modifiable;
    }

    public OpenApiConfigItem setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    public String getAllowedValues() {
        return this.allowedValues;
    }

    public OpenApiConfigItem setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public OpenApiConfigItem setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public String getEtag() {
        return this.etag;
    }

    public OpenApiConfigItem setConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    public String getConfigType() {
        return this.configType;
    }

    public OpenApiConfigItem setBestValue(String bestValue) {
        this.bestValue = bestValue;
        return this;
    }

    public String getBestValue() {
        return this.bestValue;
    }

    public OpenApiConfigItem setAttention(String attention) {
        this.attention = attention;
        return this;
    }

    public String getAttention() {
        return this.attention;
    }

    public OpenApiConfigItem setIfCluster(Boolean ifCluster) {
        this.ifCluster = ifCluster;
        return this;
    }

    public Boolean getIfCluster() {
        return this.ifCluster;
    }

    @Override
    public String toString() {
        return "OpenApiConfigItem{" + "name=" + name + "\n" + "defaultValue=" + defaultValue + "\n" + "value=" + value + "\n" + "pendingValue=" + pendingValue + "\n" + "type="
                + type + "\n" + "dynamic=" + dynamic + "\n" + "modifiable=" + modifiable + "\n" + "allowedValues=" + allowedValues + "\n" + "desc=" + desc + "\n" + "etag=" + etag
                + "\n" + "configType=" + configType + "\n" + "bestValue=" + bestValue + "\n" + "attention=" + attention + "\n" + "ifCluster=" + ifCluster + "\n" + "}";
    }

}