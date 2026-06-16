package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateStatelessCfwResponse extends BaseBceResponse {

    /**
    * 创建的CFW策略ID
    */
    private String cfwId;

    public String getCfwId() {
        return cfwId;
    }

    public CreateStatelessCfwResponse setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateStatelessCfwResponse{" + "cfwId=" + cfwId + "\n" + "}";
    }

}
