package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeBlbRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 性能规格。取值如下："small1"标准型1，"small2"标准型2，"medium1"增强型1，"medium2"增强型2，"large1"超大型1，"large2"超大型2，"large3"超大型3。仅后付费-按使用量支持变配为"unlimited"不限速。
    */
    private String performanceLevel;

    public String getBlbId() {
        return blbId;
    }

    public ResizeBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ResizeBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getPerformanceLevel() {
        return performanceLevel;
    }

    public ResizeBlbRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }

}
