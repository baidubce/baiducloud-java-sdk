package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCfwResponse extends BaseBceResponse {

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
    * CFW的创建时间，标准UTC时间
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
    * CFW防护边界，取值\\[ 0 \\| 1 \\| 2 \\]，分别表示互联网边界、vpc边界、nat边界
    */
    private Integer border;

    /**
    * CFW规则
    */
    private List<CfwRule> cfwRules;

    public String getCfwId() {
        return cfwId;
    }

    public GetCfwResponse setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetCfwResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetCfwResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public GetCfwResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public Integer getBindInstanceNum() {
        return bindInstanceNum;
    }

    public GetCfwResponse setBindInstanceNum(Integer bindInstanceNum) {
        this.bindInstanceNum = bindInstanceNum;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public GetCfwResponse setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getBorder() {
        return border;
    }

    public GetCfwResponse setBorder(Integer border) {
        this.border = border;
        return this;
    }

    public List<CfwRule> getCfwRules() {
        return cfwRules;
    }

    public GetCfwResponse setCfwRules(List<CfwRule> cfwRules) {
        this.cfwRules = cfwRules;
        return this;
    }

    @Override
    public String toString() {
        return "GetCfwResponse{" + "cfwId=" + cfwId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "createdTime=" + createdTime + "\n" + "bindInstanceNum="
                + bindInstanceNum + "\n" + "type=" + type + "\n" + "border=" + border + "\n" + "cfwRules=" + cfwRules + "\n" + "}";
    }

}
