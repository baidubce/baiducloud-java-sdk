package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceQuota {
    /**
     * 镜像仓库个数限额
     */
    private Integer repo;

    /**
     * Chart 个数限额
     */
    private Integer chart;

    /**
     * 命名空间个数限额
     */
    private Integer namespace;

    /**
     * 可关联私有网络个数限额
     */
    private Integer vpc;

    public InstanceQuota setRepo(Integer repo) {
        this.repo = repo;
        return this;
    }

    public Integer getRepo() {
        return this.repo;
    }

    public InstanceQuota setChart(Integer chart) {
        this.chart = chart;
        return this;
    }

    public Integer getChart() {
        return this.chart;
    }

    public InstanceQuota setNamespace(Integer namespace) {
        this.namespace = namespace;
        return this;
    }

    public Integer getNamespace() {
        return this.namespace;
    }

    public InstanceQuota setVpc(Integer vpc) {
        this.vpc = vpc;
        return this;
    }

    public Integer getVpc() {
        return this.vpc;
    }

    @Override
    public String toString() {
        return "InstanceQuota{" + "repo=" + repo + "\n" + "chart=" + chart + "\n" + "namespace=" + namespace + "\n" + "vpc=" + vpc + "\n" + "}";
    }

}