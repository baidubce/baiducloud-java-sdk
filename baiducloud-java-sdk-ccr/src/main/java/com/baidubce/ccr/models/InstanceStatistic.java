package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceStatistic {
    /**
     * 镜像仓库个数
     */
    private Integer repo;

    /**
     * Chart 个数
     */
    private Integer chart;

    /**
     * 命名空间个数
     */
    private Integer namespace;

    /**
     * 已关联私有网络个数
     */
    private Integer vpc;

    /**
     * BOS 存储空间大小，单位：字节
     */
    private Long storage;

    public InstanceStatistic setRepo(Integer repo) {
        this.repo = repo;
        return this;
    }

    public Integer getRepo() {
        return this.repo;
    }

    public InstanceStatistic setChart(Integer chart) {
        this.chart = chart;
        return this;
    }

    public Integer getChart() {
        return this.chart;
    }

    public InstanceStatistic setNamespace(Integer namespace) {
        this.namespace = namespace;
        return this;
    }

    public Integer getNamespace() {
        return this.namespace;
    }

    public InstanceStatistic setVpc(Integer vpc) {
        this.vpc = vpc;
        return this;
    }

    public Integer getVpc() {
        return this.vpc;
    }

    public InstanceStatistic setStorage(Long storage) {
        this.storage = storage;
        return this;
    }

    public Long getStorage() {
        return this.storage;
    }

    @Override
    public String toString() {
        return "InstanceStatistic{" + "repo=" + repo + "\n" + "chart=" + chart + "\n" + "namespace=" + namespace + "\n" + "vpc=" + vpc + "\n" + "storage=" + storage + "\n" + "}";
    }

}