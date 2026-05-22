package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCfwRequest extends BaseBceRequest {

    /**
    * CFW名称，长度不超过65个字符，可由数字、字符、下划线组成
    */
    private String name;

    /**
    * CFW类型，取值1，表示有状态防火墙
    */
    private Integer type;

    /**
    * CFW防护边界，取值0、1、2，分别表示互联网边界、vpc边界、nat边界，有状态防火墙默认为互联网边界
    */
    private Integer border;

    /**
    * CFW描述，不超过200字符
    */
    private String description;

    /**
    * CFW规则
    */
    private List<CreateRule> cfwRules;

    public String getName() {
        return name;
    }

    public CreateCfwRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CreateCfwRequest setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getBorder() {
        return border;
    }

    public CreateCfwRequest setBorder(Integer border) {
        this.border = border;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateCfwRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<CreateRule> getCfwRules() {
        return cfwRules;
    }

    public CreateCfwRequest setCfwRules(List<CreateRule> cfwRules) {
        this.cfwRules = cfwRules;
        return this;
    }

}
