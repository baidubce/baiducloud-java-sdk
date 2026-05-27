package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRouteRuleRequest extends BaseBceRequest {

    /**
    * csnRtId
    */
    @JsonIgnore
    private String csnRtId;

    /**
    * csnRtRuleId
    */
    @JsonIgnore
    private String csnRtRuleId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getCsnRtId() {
        return csnRtId;
    }

    public DeleteRouteRuleRequest setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getCsnRtRuleId() {
        return csnRtRuleId;
    }

    public DeleteRouteRuleRequest setCsnRtRuleId(String csnRtRuleId) {
        this.csnRtRuleId = csnRtRuleId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteRouteRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
