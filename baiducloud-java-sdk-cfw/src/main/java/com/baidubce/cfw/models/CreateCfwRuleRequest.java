package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCfwRuleRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * CFW规则列表
    */
    private List<CreateRule> cfwRules;

    public String getCfwId() {
        return cfwId;
    }

    public CreateCfwRuleRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public List<CreateRule> getCfwRules() {
        return cfwRules;
    }

    public CreateCfwRuleRequest setCfwRules(List<CreateRule> cfwRules) {
        this.cfwRules = cfwRules;
        return this;
    }

}
