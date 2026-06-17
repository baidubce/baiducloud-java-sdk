package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestConfig {
    /**
     * BOSPath为Bucket加用户自定义路径组成，最长256个字符
     */
    private String boSPath;

    /**
     * 分区格式，如%Y/%m/%d/%H/%M/，仅支持到分钟级别，可自定义，可为空，默认为%Y/%m/%d/%H/%M/
     */
    private String partitionFormatTS;

    /**
     * 是否使用logstream作为partition层级，默认false
     */
    private Boolean partitionFormatLogStream;

    /**
     * 最大对象大小，单位MB，范围为1 - 5*1024*1024（5TB），默认64
     */
    private Integer maxObjectSize;

    /**
     * 压缩类型，可选参数：snappy/gzip/bzip2/lzop和不压缩（none），默认不压缩
     */
    private String compressType;

    /**
     * 投递间隔，单位分钟，限制范围为5-60的整数，默认5
     */
    private Integer deliverInterval;

    /**
     * 存储格式，可选参数： parquet, json, csv，默认json
     */
    private String storageFormat;

    /**
     * csv时是否投递字段名称，默认false，不投递
     */
    private Boolean csvHeadline;

    /**
     * csv时的分隔符，可选：逗号（，），空格（ ）、竖线（
     */
    private String csvDelimiter;

    /**
     * csv时的引用符，可选：单引号(')，双引号(")，空(none)，可自定义，默认为空
     */
    private String csvQuote;

    /**
     * csv时，列为空时，填写的指定内容，默认为空
     */
    private String nullIdentifier;

    /**
     * csv和parquet时，必填，选择的列名, 逗号分割的列名参数
     */
    private String selectedColumnName;

    /**
     * parquet时，必填，选择的列类型，逗号分割的列类型参数
     */
    private String selectedColumnType;

    /**
     * 投递类型为kv时选择的字段名称，大小与fieldsType相同
     */
    private List<String> fieldsName;

    /**
     * 投递类型为kv时选择的字段类型，大小与fieldsName相同
     */
    private List<String> fieldsType;

    /**
     * 投递类型，默认为text，如果选择投递系统字段，此时也是json格式的数据；可以选择kv类型，此时只投递指定的key和value，为json格式的数据
     */
    private String shipperType;

    /**
     * kafka配置
     */
    private String kafkaConfig;

    /**
     * 目的端类型，当前接口支持BLS，固定填BLS
     */
    private String destType;

    /**
     * 日志集名称，必填
     */
    private String logStore;

    /**
     * 采集速率限制，单位MB/秒
     */
    private Integer rateLimit;

    /**
     * 推送服务端的客户端数量，默认值为1，当日志量比较大时，增加客户端数量可以提升数据采集速度
     */
    private Integer clientCount;

    public DestConfig setBoSPath(String boSPath) {
        this.boSPath = boSPath;
        return this;
    }

    public String getBoSPath() {
        return this.boSPath;
    }

    public DestConfig setPartitionFormatTS(String partitionFormatTS) {
        this.partitionFormatTS = partitionFormatTS;
        return this;
    }

    public String getPartitionFormatTS() {
        return this.partitionFormatTS;
    }

    public DestConfig setPartitionFormatLogStream(Boolean partitionFormatLogStream) {
        this.partitionFormatLogStream = partitionFormatLogStream;
        return this;
    }

    public Boolean getPartitionFormatLogStream() {
        return this.partitionFormatLogStream;
    }

    public DestConfig setMaxObjectSize(Integer maxObjectSize) {
        this.maxObjectSize = maxObjectSize;
        return this;
    }

    public Integer getMaxObjectSize() {
        return this.maxObjectSize;
    }

    public DestConfig setCompressType(String compressType) {
        this.compressType = compressType;
        return this;
    }

    public String getCompressType() {
        return this.compressType;
    }

    public DestConfig setDeliverInterval(Integer deliverInterval) {
        this.deliverInterval = deliverInterval;
        return this;
    }

    public Integer getDeliverInterval() {
        return this.deliverInterval;
    }

    public DestConfig setStorageFormat(String storageFormat) {
        this.storageFormat = storageFormat;
        return this;
    }

    public String getStorageFormat() {
        return this.storageFormat;
    }

    public DestConfig setCsvHeadline(Boolean csvHeadline) {
        this.csvHeadline = csvHeadline;
        return this;
    }

    public Boolean getCsvHeadline() {
        return this.csvHeadline;
    }

    public DestConfig setCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
        return this;
    }

    public String getCsvDelimiter() {
        return this.csvDelimiter;
    }

    public DestConfig setCsvQuote(String csvQuote) {
        this.csvQuote = csvQuote;
        return this;
    }

    public String getCsvQuote() {
        return this.csvQuote;
    }

    public DestConfig setNullIdentifier(String nullIdentifier) {
        this.nullIdentifier = nullIdentifier;
        return this;
    }

    public String getNullIdentifier() {
        return this.nullIdentifier;
    }

    public DestConfig setSelectedColumnName(String selectedColumnName) {
        this.selectedColumnName = selectedColumnName;
        return this;
    }

    public String getSelectedColumnName() {
        return this.selectedColumnName;
    }

    public DestConfig setSelectedColumnType(String selectedColumnType) {
        this.selectedColumnType = selectedColumnType;
        return this;
    }

    public String getSelectedColumnType() {
        return this.selectedColumnType;
    }

    public DestConfig setFieldsName(List<String> fieldsName) {
        this.fieldsName = fieldsName;
        return this;
    }

    public List<String> getFieldsName() {
        return this.fieldsName;
    }

    public DestConfig setFieldsType(List<String> fieldsType) {
        this.fieldsType = fieldsType;
        return this;
    }

    public List<String> getFieldsType() {
        return this.fieldsType;
    }

    public DestConfig setShipperType(String shipperType) {
        this.shipperType = shipperType;
        return this;
    }

    public String getShipperType() {
        return this.shipperType;
    }

    public DestConfig setKafkaConfig(String kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
        return this;
    }

    public String getKafkaConfig() {
        return this.kafkaConfig;
    }

    public DestConfig setDestType(String destType) {
        this.destType = destType;
        return this;
    }

    public String getDestType() {
        return this.destType;
    }

    public DestConfig setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }

    public String getLogStore() {
        return this.logStore;
    }

    public DestConfig setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    public Integer getRateLimit() {
        return this.rateLimit;
    }

    public DestConfig setClientCount(Integer clientCount) {
        this.clientCount = clientCount;
        return this;
    }

    public Integer getClientCount() {
        return this.clientCount;
    }

    @Override
    public String toString() {
        return "DestConfig{" + "boSPath=" + boSPath + "\n" + "partitionFormatTS=" + partitionFormatTS + "\n" + "partitionFormatLogStream=" + partitionFormatLogStream + "\n"
                + "maxObjectSize=" + maxObjectSize + "\n" + "compressType=" + compressType + "\n" + "deliverInterval=" + deliverInterval + "\n" + "storageFormat=" + storageFormat
                + "\n" + "csvHeadline=" + csvHeadline + "\n" + "csvDelimiter=" + csvDelimiter + "\n" + "csvQuote=" + csvQuote + "\n" + "nullIdentifier=" + nullIdentifier + "\n"
                + "selectedColumnName=" + selectedColumnName + "\n" + "selectedColumnType=" + selectedColumnType + "\n" + "fieldsName=" + fieldsName + "\n" + "fieldsType="
                + fieldsType + "\n" + "shipperType=" + shipperType + "\n" + "kafkaConfig=" + kafkaConfig + "\n" + "destType=" + destType + "\n" + "logStore=" + logStore + "\n"
                + "rateLimit=" + rateLimit + "\n" + "clientCount=" + clientCount + "\n" + "}";
    }

}