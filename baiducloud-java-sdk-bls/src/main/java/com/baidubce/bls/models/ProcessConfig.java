package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessConfig {
    /**
     * 处理类型是regex时必填；处理类型是kv时也必填
     */
    private String regex;

    /**
     * 处理类型是separator时必填，指定分隔符：空格blank、逗号comma、制表符tab、竖线longstring、自定义custom
     */
    private String separator;

    /**
     * 当separator为custom时必填
     */
    private String customSeparator;

    /**
     * 分隔符场景可指定引用符
     */
    private String quote;

    /**
     * kv解析时必填，用于指定key分组位置（从1开始）
     */
    private Integer kvKeyIndex;

    /**
     * kv解析时必填，用于指定value分组位置（从1开始）
     */
    private Integer kvValueIndex;

    /**
     * 解析日志样例，主要用于console解析预览
     */
    private String sampleLog;

    /**
     * 解析结果的列名
     */
    private String keys;

    /**
     * 解析结果每列对应的数据类型，支持string/int/float/bool；当填写keys时建议同时填写，数量需与keys一致
     */
    private String dataType;

    /**
     * 日志解析失败是否丢弃，true:丢弃 false:返回原值
     */
    private Boolean discardOnFailure;

    /**
     * 是否保留原日志，true:保留原日志到kafka中的@message字段，bls日志集中的@raw字段；false:解析成功则不保留原日志
     */
    private Boolean keepOriginal;

    public ProcessConfig setRegex(String regex) {
        this.regex = regex;
        return this;
    }

    public String getRegex() {
        return this.regex;
    }

    public ProcessConfig setSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    public String getSeparator() {
        return this.separator;
    }

    public ProcessConfig setCustomSeparator(String customSeparator) {
        this.customSeparator = customSeparator;
        return this;
    }

    public String getCustomSeparator() {
        return this.customSeparator;
    }

    public ProcessConfig setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    public String getQuote() {
        return this.quote;
    }

    public ProcessConfig setKvKeyIndex(Integer kvKeyIndex) {
        this.kvKeyIndex = kvKeyIndex;
        return this;
    }

    public Integer getKvKeyIndex() {
        return this.kvKeyIndex;
    }

    public ProcessConfig setKvValueIndex(Integer kvValueIndex) {
        this.kvValueIndex = kvValueIndex;
        return this;
    }

    public Integer getKvValueIndex() {
        return this.kvValueIndex;
    }

    public ProcessConfig setSampleLog(String sampleLog) {
        this.sampleLog = sampleLog;
        return this;
    }

    public String getSampleLog() {
        return this.sampleLog;
    }

    public ProcessConfig setKeys(String keys) {
        this.keys = keys;
        return this;
    }

    public String getKeys() {
        return this.keys;
    }

    public ProcessConfig setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    public String getDataType() {
        return this.dataType;
    }

    public ProcessConfig setDiscardOnFailure(Boolean discardOnFailure) {
        this.discardOnFailure = discardOnFailure;
        return this;
    }

    public Boolean getDiscardOnFailure() {
        return this.discardOnFailure;
    }

    public ProcessConfig setKeepOriginal(Boolean keepOriginal) {
        this.keepOriginal = keepOriginal;
        return this;
    }

    public Boolean getKeepOriginal() {
        return this.keepOriginal;
    }

    @Override
    public String toString() {
        return "ProcessConfig{" + "regex=" + regex + "\n" + "separator=" + separator + "\n" + "customSeparator=" + customSeparator + "\n" + "quote=" + quote + "\n" + "kvKeyIndex="
                + kvKeyIndex + "\n" + "kvValueIndex=" + kvValueIndex + "\n" + "sampleLog=" + sampleLog + "\n" + "keys=" + keys + "\n" + "dataType=" + dataType + "\n"
                + "discardOnFailure=" + discardOnFailure + "\n" + "keepOriginal=" + keepOriginal + "\n" + "}";
    }

}