package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetricCatalogsRequest extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 云产品标识，可通过DescribeResourceCatalogs接口获取，例如BCE_BCC
    */
    private String scope;

    /**
    * 资源类型标识，可通过DescribeResourceCatalogs接口获取，例如Instance
    */
    private String resourceType;

    /**
    * 一级指标目录名称。按名称过滤目录时使用，名称匹配不区分大小写
    */
    private String catalog;

    /**
    * 指标属性过滤条件列表。多个条件之间为AND关系，可根据指标标签或指标维度过滤
    */
    private List<MetricFilter> filters;

    /**
    * 过滤字段名称。配置filters时必填，可填写指标标签名称或指标维度名称
    */
    @JsonProperty("filters[].key")
    private String filtersKey;

    /**
    * 过滤操作符，可选值：= / != / contains / in
    */
    @JsonProperty("filters[].op")
    private String filtersOp;

    /**
    * 单值过滤条件，用于=、!=或contains操作符。对指标维度使用空字符串时，可用于判断该维度是否存在
    */
    @JsonProperty("filters[].value")
    private String filtersValue;

    /**
    * 多值过滤条件，op为in时必填，匹配任意一个值即满足当前条件
    */
    @JsonProperty("filters[].values")
    private List<String> filtersValues;

    /**
    * 指标必须同时包含的指标维度列表
    */
    private List<String> includingDimensions;

    /**
    * 指标不能包含其中任意维度的指标维度列表
    */
    private List<String> excludingDimensions;

    public String getLocale() {
        return locale;
    }

    public DescribeMetricCatalogsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public DescribeMetricCatalogsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public DescribeMetricCatalogsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getCatalog() {
        return catalog;
    }

    public DescribeMetricCatalogsRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    public List<MetricFilter> getFilters() {
        return filters;
    }

    public DescribeMetricCatalogsRequest setFilters(List<MetricFilter> filters) {
        this.filters = filters;
        return this;
    }

    public String getFiltersKey() {
        return filtersKey;
    }

    public DescribeMetricCatalogsRequest setFiltersKey(String filtersKey) {
        this.filtersKey = filtersKey;
        return this;
    }

    public String getFiltersOp() {
        return filtersOp;
    }

    public DescribeMetricCatalogsRequest setFiltersOp(String filtersOp) {
        this.filtersOp = filtersOp;
        return this;
    }

    public String getFiltersValue() {
        return filtersValue;
    }

    public DescribeMetricCatalogsRequest setFiltersValue(String filtersValue) {
        this.filtersValue = filtersValue;
        return this;
    }

    public List<String> getFiltersValues() {
        return filtersValues;
    }

    public DescribeMetricCatalogsRequest setFiltersValues(List<String> filtersValues) {
        this.filtersValues = filtersValues;
        return this;
    }

    public List<String> getIncludingDimensions() {
        return includingDimensions;
    }

    public DescribeMetricCatalogsRequest setIncludingDimensions(List<String> includingDimensions) {
        this.includingDimensions = includingDimensions;
        return this;
    }

    public List<String> getExcludingDimensions() {
        return excludingDimensions;
    }

    public DescribeMetricCatalogsRequest setExcludingDimensions(List<String> excludingDimensions) {
        this.excludingDimensions = excludingDimensions;
        return this;
    }

}
