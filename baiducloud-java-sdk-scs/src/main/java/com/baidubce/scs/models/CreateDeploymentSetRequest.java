package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDeploymentSetRequest extends BaseBceRequest {

    /**
    * 部署集名称。
    */
    private String name;

    /**
    * 备注。
    */
    private String desc;

    /**
    * 策略。默认值：HOST_HA。
    */
    private String strategy;

    /**
    * 并发度。取值范围：1-127。默认值：20。
    */
    private Integer concurrency;

    public String getName() {
        return name;
    }

    public CreateDeploymentSetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateDeploymentSetRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getStrategy() {
        return strategy;
    }

    public CreateDeploymentSetRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public Integer getConcurrency() {
        return concurrency;
    }

    public CreateDeploymentSetRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

}
