package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetricCatalogsResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 指标目录列表。目录为树形结构，可通过catalogs字段递归包含子目录
    */
    private List<MetricCatalog> catalogs;

    /**
    * 指标目录名称
    */
    @JsonProperty("catalogs[].name")
    private String catalogsName;

    /**
    * 指标目录显示名称，根据locale返回中文或英文名称
    */
    @JsonProperty("catalogs[].label")
    private String catalogsLabel;

    /**
    * 当前目录下的子目录列表，结构与catalogs相同
    */
    @JsonProperty("catalogs[].catalogs")
    private List<MetricCatalog> catalogsCatalogs;

    /**
    * 当前目录下的指标列表
    */
    @JsonProperty("catalogs[].metrics")
    private List<Metric> catalogsMetrics;

    /**
    * 指标名称，可作为指标数据查询接口的metricNames参数
    */
    @JsonProperty("catalogs[].metrics[].name")
    private String catalogsMetricsName;

    /**
    * 指标显示名称，根据locale返回中文或英文名称
    */
    @JsonProperty("catalogs[].metrics[].label")
    private String catalogsMetricsLabel;

    /**
    * 资源标识维度列表。查询指标数据时，过滤条件需要包含当前资源类型要求的全部资源标识维度
    */
    @JsonProperty("catalogs[].metrics[].resourceIdentifiers")
    private List<String> catalogsMetricsResourceIdentifiers;

    /**
    * 除资源标识维度以外的指标维度列表，可用于进一步筛选时序数据
    */
    @JsonProperty("catalogs[].metrics[].metricDimensions")
    private List<String> catalogsMetricsMetricDimensions;

    /**
    * 指标采集周期数值
    */
    @JsonProperty("catalogs[].metrics[].period")
    private Double catalogsMetricsPeriod;

    /**
    * 指标采集周期单位，例如s表示秒
    */
    @JsonProperty("catalogs[].metrics[].periodUnit")
    private String catalogsMetricsPeriodUnit;

    /**
    * 指标值单位，根据locale返回中文或英文单位
    */
    @JsonProperty("catalogs[].metrics[].unit")
    private String catalogsMetricsUnit;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeMetricCatalogsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeMetricCatalogsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeMetricCatalogsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<MetricCatalog> getCatalogs() {
        return catalogs;
    }

    public DescribeMetricCatalogsResponse setCatalogs(List<MetricCatalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public String getCatalogsName() {
        return catalogsName;
    }

    public DescribeMetricCatalogsResponse setCatalogsName(String catalogsName) {
        this.catalogsName = catalogsName;
        return this;
    }

    public String getCatalogsLabel() {
        return catalogsLabel;
    }

    public DescribeMetricCatalogsResponse setCatalogsLabel(String catalogsLabel) {
        this.catalogsLabel = catalogsLabel;
        return this;
    }

    public List<MetricCatalog> getCatalogsCatalogs() {
        return catalogsCatalogs;
    }

    public DescribeMetricCatalogsResponse setCatalogsCatalogs(List<MetricCatalog> catalogsCatalogs) {
        this.catalogsCatalogs = catalogsCatalogs;
        return this;
    }

    public List<Metric> getCatalogsMetrics() {
        return catalogsMetrics;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetrics(List<Metric> catalogsMetrics) {
        this.catalogsMetrics = catalogsMetrics;
        return this;
    }

    public String getCatalogsMetricsName() {
        return catalogsMetricsName;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsName(String catalogsMetricsName) {
        this.catalogsMetricsName = catalogsMetricsName;
        return this;
    }

    public String getCatalogsMetricsLabel() {
        return catalogsMetricsLabel;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsLabel(String catalogsMetricsLabel) {
        this.catalogsMetricsLabel = catalogsMetricsLabel;
        return this;
    }

    public List<String> getCatalogsMetricsResourceIdentifiers() {
        return catalogsMetricsResourceIdentifiers;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsResourceIdentifiers(List<String> catalogsMetricsResourceIdentifiers) {
        this.catalogsMetricsResourceIdentifiers = catalogsMetricsResourceIdentifiers;
        return this;
    }

    public List<String> getCatalogsMetricsMetricDimensions() {
        return catalogsMetricsMetricDimensions;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsMetricDimensions(List<String> catalogsMetricsMetricDimensions) {
        this.catalogsMetricsMetricDimensions = catalogsMetricsMetricDimensions;
        return this;
    }

    public Double getCatalogsMetricsPeriod() {
        return catalogsMetricsPeriod;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsPeriod(Double catalogsMetricsPeriod) {
        this.catalogsMetricsPeriod = catalogsMetricsPeriod;
        return this;
    }

    public String getCatalogsMetricsPeriodUnit() {
        return catalogsMetricsPeriodUnit;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsPeriodUnit(String catalogsMetricsPeriodUnit) {
        this.catalogsMetricsPeriodUnit = catalogsMetricsPeriodUnit;
        return this;
    }

    public String getCatalogsMetricsUnit() {
        return catalogsMetricsUnit;
    }

    public DescribeMetricCatalogsResponse setCatalogsMetricsUnit(String catalogsMetricsUnit) {
        this.catalogsMetricsUnit = catalogsMetricsUnit;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeMetricCatalogsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "catalogs=" + catalogs + "\n"
                + "catalogsName=" + catalogsName + "\n" + "catalogsLabel=" + catalogsLabel + "\n" + "catalogsCatalogs=" + catalogsCatalogs + "\n" + "catalogsMetrics="
                + catalogsMetrics + "\n" + "catalogsMetricsName=" + catalogsMetricsName + "\n" + "catalogsMetricsLabel=" + catalogsMetricsLabel + "\n"
                + "catalogsMetricsResourceIdentifiers=" + catalogsMetricsResourceIdentifiers + "\n" + "catalogsMetricsMetricDimensions=" + catalogsMetricsMetricDimensions + "\n"
                + "catalogsMetricsPeriod=" + catalogsMetricsPeriod + "\n" + "catalogsMetricsPeriodUnit=" + catalogsMetricsPeriodUnit + "\n" + "catalogsMetricsUnit="
                + catalogsMetricsUnit + "\n" + "}";
    }

}
