package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEhcClusterResponse extends BaseBceResponse {

    /**
    * 返回EHC集群ID
    */
    private String ehcClusterId;

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public CreateEhcClusterResponse setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEhcClusterResponse{" + "ehcClusterId=" + ehcClusterId + "\n" + "}";
    }

}
