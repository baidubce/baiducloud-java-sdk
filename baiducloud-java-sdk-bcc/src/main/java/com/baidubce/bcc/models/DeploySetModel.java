package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeploySetModel {
    /**
     * 部署集ID
     */
    private String deploysetId;

    /**
     * 部署集名称
     */
    private String name;

    /**
     * 部署集描述
     */
    private String desc;

    /**
     * 部署集策略（HOST_HA/RACK_HA/TOR_HA）
     */
    private String strategy;

    /**
     * 部署集并发度
     */
    private Integer concurrency;

    /**
     * 可用区实例数量统计列表
     */
    private List<AzIntstanceStatisDetail> azIntstanceStatisList;

    public DeploySetModel setDeploysetId(String deploysetId) {
        this.deploysetId = deploysetId;
        return this;
    }

    public String getDeploysetId() {
        return this.deploysetId;
    }

    public DeploySetModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DeploySetModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public DeploySetModel setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public DeploySetModel setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    public Integer getConcurrency() {
        return this.concurrency;
    }

    public DeploySetModel setAzIntstanceStatisList(List<AzIntstanceStatisDetail> azIntstanceStatisList) {
        this.azIntstanceStatisList = azIntstanceStatisList;
        return this;
    }

    public List<AzIntstanceStatisDetail> getAzIntstanceStatisList() {
        return this.azIntstanceStatisList;
    }

    @Override
    public String toString() {
        return "DeploySetModel{" + "deploysetId=" + deploysetId + "\n" + "name=" + name + "\n" + "desc=" + desc + "\n" + "strategy=" + strategy + "\n" + "concurrency="
                + concurrency + "\n" + "azIntstanceStatisList=" + azIntstanceStatisList + "\n" + "}";
    }

}