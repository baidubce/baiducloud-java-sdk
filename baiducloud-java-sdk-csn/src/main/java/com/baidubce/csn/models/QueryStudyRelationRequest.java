package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryStudyRelationRequest extends BaseBceRequest {

    /**
    * csnRtId
    */
    @JsonIgnore
    private String csnRtId;

    public String getCsnRtId() {
        return csnRtId;
    }

    public QueryStudyRelationRequest setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

}
