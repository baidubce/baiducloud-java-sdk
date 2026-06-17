package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SrcConfig {
    /**
     * 普通主机类型填host，容器类型填container
     */
    private String srcType;

    /**
     * 容器场景日志类型，可选值为stdout、internal
     */
    private String logType;

    /**
     * 源日志所在目录，按glob模式匹配。多个目录按;（英文分号）分隔。srcType=host 时必填；srcType=container 且 logType=internal 时必填
     */
    private String srcDir;

    /**
     * 源日志文件，按正则匹配。srcType=host 时必填；srcType=container 且 logType=internal 时必填
     */
    private String matchedPattern;

    /**
     * 忽略的源日志文件
     */
    private String ignorePattern;

    /**
     * 用于投BOS时，原文件路径日期解析。BLS场景通常不需要填写
     */
    private String timeFormat;

    /**
     * 有效日志文件时间范围
     */
    private Integer ttl;

    /**
     * 是否启用多行模式
     */
    private Boolean useMultiline;

    /**
     * 多行模式首行正则表达式，useMultiline=true 时必填
     */
    private String multilineRegex;

    /**
     * 是否启动目录递归匹配，容器采集目前没有目录递归
     */
    private Boolean recursiveDir;

    /**
     * 解析类型，可选值包括 none:不解析; json:按JSON格式解析; separator:按分隔符解析; regex:按正则解析; kv:键值对解析
     */
    private String processType;

    /**
     * processConfig
     */
    private ProcessConfig processConfig;

    /**
     * 日志时间，可选system、logTime，分别表示使用系统时间和使用日志时间
     */
    private String logTime;

    /**
     * 指定解析后的字段作为日志时间
     */
    private String timestampKey;

    /**
     * 指定时间戳字段的时间解析格式，format格式参考https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
     */
    private String dateFormat;

    /**
     * 日志匹配表达式，符合规则的日志将被采集
     */
    private String filterExpr;

    /**
     * 追加采集器参数
     */
    private Map<String, Object> additionConfig;

    /**
     * 采集环境变量的列表
     */
    private List<String> metaEnv;

    /**
     * 采集自定义Label列表
     */
    private List<String> metaLabel;

    /**
     * 采集容器固定元数据
     */
    private List<String> metaContainer;

    /**
     * 是否将采集到的元数据写入日志字段
     */
    private Boolean metaToFields;

    /**
     * 采集器并行采集的文件数量，默认值为1，文件数量多且日志量比较大时，建议配合max_procs参数使用https://cloud.baidu.com/doc/BLS/s/ym53rk1ua
     */
    private Integer harvesterLimit;

    public SrcConfig setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }

    public String getSrcType() {
        return this.srcType;
    }

    public SrcConfig setLogType(String logType) {
        this.logType = logType;
        return this;
    }

    public String getLogType() {
        return this.logType;
    }

    public SrcConfig setSrcDir(String srcDir) {
        this.srcDir = srcDir;
        return this;
    }

    public String getSrcDir() {
        return this.srcDir;
    }

    public SrcConfig setMatchedPattern(String matchedPattern) {
        this.matchedPattern = matchedPattern;
        return this;
    }

    public String getMatchedPattern() {
        return this.matchedPattern;
    }

    public SrcConfig setIgnorePattern(String ignorePattern) {
        this.ignorePattern = ignorePattern;
        return this;
    }

    public String getIgnorePattern() {
        return this.ignorePattern;
    }

    public SrcConfig setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public SrcConfig setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    public Integer getTtl() {
        return this.ttl;
    }

    public SrcConfig setUseMultiline(Boolean useMultiline) {
        this.useMultiline = useMultiline;
        return this;
    }

    public Boolean getUseMultiline() {
        return this.useMultiline;
    }

    public SrcConfig setMultilineRegex(String multilineRegex) {
        this.multilineRegex = multilineRegex;
        return this;
    }

    public String getMultilineRegex() {
        return this.multilineRegex;
    }

    public SrcConfig setRecursiveDir(Boolean recursiveDir) {
        this.recursiveDir = recursiveDir;
        return this;
    }

    public Boolean getRecursiveDir() {
        return this.recursiveDir;
    }

    public SrcConfig setProcessType(String processType) {
        this.processType = processType;
        return this;
    }

    public String getProcessType() {
        return this.processType;
    }

    public SrcConfig setProcessConfig(ProcessConfig processConfig) {
        this.processConfig = processConfig;
        return this;
    }

    public ProcessConfig getProcessConfig() {
        return this.processConfig;
    }

    public SrcConfig setLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    public String getLogTime() {
        return this.logTime;
    }

    public SrcConfig setTimestampKey(String timestampKey) {
        this.timestampKey = timestampKey;
        return this;
    }

    public String getTimestampKey() {
        return this.timestampKey;
    }

    public SrcConfig setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDateFormat() {
        return this.dateFormat;
    }

    public SrcConfig setFilterExpr(String filterExpr) {
        this.filterExpr = filterExpr;
        return this;
    }

    public String getFilterExpr() {
        return this.filterExpr;
    }

    public SrcConfig setAdditionConfig(Map<String, Object> additionConfig) {
        this.additionConfig = additionConfig;
        return this;
    }

    public Map<String, Object> getAdditionConfig() {
        return this.additionConfig;
    }

    public SrcConfig setMetaEnv(List<String> metaEnv) {
        this.metaEnv = metaEnv;
        return this;
    }

    public List<String> getMetaEnv() {
        return this.metaEnv;
    }

    public SrcConfig setMetaLabel(List<String> metaLabel) {
        this.metaLabel = metaLabel;
        return this;
    }

    public List<String> getMetaLabel() {
        return this.metaLabel;
    }

    public SrcConfig setMetaContainer(List<String> metaContainer) {
        this.metaContainer = metaContainer;
        return this;
    }

    public List<String> getMetaContainer() {
        return this.metaContainer;
    }

    public SrcConfig setMetaToFields(Boolean metaToFields) {
        this.metaToFields = metaToFields;
        return this;
    }

    public Boolean getMetaToFields() {
        return this.metaToFields;
    }

    public SrcConfig setHarvesterLimit(Integer harvesterLimit) {
        this.harvesterLimit = harvesterLimit;
        return this;
    }

    public Integer getHarvesterLimit() {
        return this.harvesterLimit;
    }

    @Override
    public String toString() {
        return "SrcConfig{" + "srcType=" + srcType + "\n" + "logType=" + logType + "\n" + "srcDir=" + srcDir + "\n" + "matchedPattern=" + matchedPattern + "\n" + "ignorePattern="
                + ignorePattern + "\n" + "timeFormat=" + timeFormat + "\n" + "ttl=" + ttl + "\n" + "useMultiline=" + useMultiline + "\n" + "multilineRegex=" + multilineRegex
                + "\n" + "recursiveDir=" + recursiveDir + "\n" + "processType=" + processType + "\n" + "processConfig=" + processConfig + "\n" + "logTime=" + logTime + "\n"
                + "timestampKey=" + timestampKey + "\n" + "dateFormat=" + dateFormat + "\n" + "filterExpr=" + filterExpr + "\n" + "additionConfig=" + additionConfig + "\n"
                + "metaEnv=" + metaEnv + "\n" + "metaLabel=" + metaLabel + "\n" + "metaContainer=" + metaContainer + "\n" + "metaToFields=" + metaToFields + "\n"
                + "harvesterLimit=" + harvesterLimit + "\n" + "}";
    }

}