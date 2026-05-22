package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteCfwRequest extends BaseBceRequest {

    /**
    * cfwId
    */
    @JsonIgnore
    private String cfwId;

    public String getCfwId() {
        return cfwId;
    }

    public DeleteCfwRequest setCfwId(String cfwId) {
        this.cfwId = cfwId;
        return this;
    }

}
