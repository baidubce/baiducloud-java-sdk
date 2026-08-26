package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricCatalog {
    /**
     * 指标目录名称
     */
    private String name;

    /**
     * 指标目录显示名称，根据locale返回中文或英文名称
     */
    private String label;

    /**
     * 当前目录下的子目录列表，结构与catalogs相同
     */
    private List<MetricCatalog> catalogs;

    /**
     * 当前目录下的指标列表
     */
    private List<Metric> metrics;

    public MetricCatalog setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MetricCatalog setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public MetricCatalog setCatalogs(List<MetricCatalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public List<MetricCatalog> getCatalogs() {
        return this.catalogs;
    }

    public MetricCatalog setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public List<Metric> getMetrics() {
        return this.metrics;
    }

    @Override
    public String toString() {
        return "MetricCatalog{" + "name=" + name + "\n" + "label=" + label + "\n" + "catalogs=" + catalogs + "\n" + "metrics=" + metrics + "\n" + "}";
    }

}