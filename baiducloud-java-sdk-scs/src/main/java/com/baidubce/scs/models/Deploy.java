package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Deploy {
    /**
     * 部署集绑定的实例数量。
     */
    private Integer scsInstanceCount;

    /**
     * 部署集绑定的SCS集群ID列表。
     */
    private List<String> scsInstancelds;

    /**
     * 部署集名称。
     */
    private String name;

    /**
     * 策略。默认值：HOST_HA。
     */
    private String strategy;

    /**
     * 并发度。
     */
    private Integer concurrency;

    /**
     * 部署集ID。
     */
    private String deploySetId;

    /**
     * 备注。
     */
    private String desc;

    public Deploy setScsInstanceCount(Integer scsInstanceCount) {
        this.scsInstanceCount = scsInstanceCount;
        return this;
    }

    public Integer getScsInstanceCount() {
        return this.scsInstanceCount;
    }

    public Deploy setScsInstancelds(List<String> scsInstancelds) {
        this.scsInstancelds = scsInstancelds;
        return this;
    }

    public List<String> getScsInstancelds() {
        return this.scsInstancelds;
    }

    public Deploy setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Deploy setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public Deploy setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    public Integer getConcurrency() {
        return this.concurrency;
    }

    public Deploy setDeploySetId(String deploySetId) {
        this.deploySetId = deploySetId;
        return this;
    }

    public String getDeploySetId() {
        return this.deploySetId;
    }

    public Deploy setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "Deploy{" + "scsInstanceCount=" + scsInstanceCount + "\n" + "scsInstancelds=" + scsInstancelds + "\n" + "name=" + name + "\n" + "strategy=" + strategy + "\n"
                + "concurrency=" + concurrency + "\n" + "deploySetId=" + deploySetId + "\n" + "desc=" + desc + "\n" + "}";
    }

}