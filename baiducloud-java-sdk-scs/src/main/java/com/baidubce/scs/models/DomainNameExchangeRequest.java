package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainNameExchangeRequest extends BaseBceRequest {

    /**
    * 源实例ID
    */
    private String sourceInstanceId;

    /**
    * 目标实例ID
    */
    private String targetInstanceId;

    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public DomainNameExchangeRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public DomainNameExchangeRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

}
