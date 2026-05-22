package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCfwResponse extends BaseBceResponse {

    /**
    * 创建CFW策略的id
    */
    private String cfwId;

    public String getCfwId() {
        return cfwId;
    }

    public CreateCfwResponse setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateCfwResponse{" + "cfwId=" + cfwId + "\n" + "}";
    }

}
