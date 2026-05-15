package com.baidubce.cfw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cfw {
    /**
     * CFW的id
     */
    private String cfwId;

    /**
     * CFW的名称
     */
    private String name;

    /**
     * CFW的描述
     */
    private String description;

    /**
     * CFW的创建时间，标准UTC时间格式
     */
    private String createdTime;

    /**
     * CFW绑定实例的数量
     */
    private Integer bindInstanceNum;

    /**
     * CFW类型，1表示有状态防火墙
     */
    private Integer type;

    /**
     * CFW防护边界，取值\[ 0 \| 1 \| 2 \]，分别表示互联网边界、vpc边界、nat边界
     */
    private Integer border;

    /**
     * CFW规则
     */
    private List<CfwRule> cfwRules;

    public Cfw setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getCfwId() {
        return this.cfwId;
    }

    public Cfw setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Cfw setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Cfw setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Cfw setBindInstanceNum(Integer bindInstanceNum) {
        this.bindInstanceNum = bindInstanceNum;
        return this;
    }

    public Integer getBindInstanceNum() {
        return this.bindInstanceNum;
    }

    public Cfw setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public Cfw setBorder(Integer border) {
        this.border = border;
        return this;
    }

    public Integer getBorder() {
        return this.border;
    }

    public Cfw setCfwRules(List<CfwRule> cfwRules) {
        this.cfwRules = cfwRules;
        return this;
    }

    public List<CfwRule> getCfwRules() {
        return this.cfwRules;
    }

    @Override
    public String toString() {
        return "Cfw{" + "cfwId=" + cfwId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "createdTime=" + createdTime + "\n" + "bindInstanceNum="
                + bindInstanceNum + "\n" + "type=" + type + "\n" + "border=" + border + "\n" + "cfwRules=" + cfwRules + "\n" + "}";
    }

}