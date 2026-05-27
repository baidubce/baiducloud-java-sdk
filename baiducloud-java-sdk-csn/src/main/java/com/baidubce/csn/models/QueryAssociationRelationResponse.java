package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAssociationRelationResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<CsnRtAssociation> associations;

    public List<CsnRtAssociation> getAssociations() {
        return associations;
    }

    public QueryAssociationRelationResponse setAssociations(List<CsnRtAssociation> associations) {
        this.associations = associations;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAssociationRelationResponse{" + "associations=" + associations + "\n" + "}";
    }

}
