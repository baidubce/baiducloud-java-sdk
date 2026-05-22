package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCfwRuleRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    /**
    * 批量删除的CFW规则id
    */
    private List<String> cfwRuleIds;

    public String getCfwId() {
        return cfwId;
    }

    public DeleteCfwRuleRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    public List<String> getCfwRuleIds() {
        return cfwRuleIds;
    }

    public DeleteCfwRuleRequest setCfwRuleIds(List<String> cfwRuleIds) {
        this.cfwRuleIds = cfwRuleIds;
        return this;
    }

}
