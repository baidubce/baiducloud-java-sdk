package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteElasticityAssuranceRequest extends BaseBceRequest {

    /**
    * 待释放的弹性保障 ID，单次最多100个
    */
    private List<String> elasticityAssuranceIds;

    public List<String> getElasticityAssuranceIds() {
        return elasticityAssuranceIds;
    }

    public DeleteElasticityAssuranceRequest setElasticityAssuranceIds(List<String> elasticityAssuranceIds) {
        this.elasticityAssuranceIds = elasticityAssuranceIds;
        return this;
    }

}
