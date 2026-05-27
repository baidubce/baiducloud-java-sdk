package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryStudyRelationResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<CsnRtPropagation> propagations;

    public List<CsnRtPropagation> getPropagations() {
        return propagations;
    }

    public QueryStudyRelationResponse setPropagations(List<CsnRtPropagation> propagations) {
        this.propagations = propagations;
        return this;
    }

    @Override
    public String toString() {
        return "QueryStudyRelationResponse{" + "propagations=" + propagations + "\n" + "}";
    }

}
