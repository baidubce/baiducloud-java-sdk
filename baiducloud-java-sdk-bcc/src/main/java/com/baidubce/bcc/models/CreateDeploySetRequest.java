package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDeploySetRequest extends BaseBceRequest {

    /**
    * 部署集名字
    */
    private String name;

    /**
    * 部署集描述，只能包含中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String desc;

    /**
    * 部署集策略（HOST_HA:宿主机, RACK_HA:机架, TOR_HA:交换机）
    */
    private String strategy;

    /**
    * 部署集并发度
    */
    private Integer concurrency;

    public String getName() {
        return name;
    }

    public CreateDeploySetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public CreateDeploySetRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getStrategy() {
        return strategy;
    }

    public CreateDeploySetRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public Integer getConcurrency() {
        return concurrency;
    }

    public CreateDeploySetRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

}
