package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetUserPoolRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public GetUserPoolRequest setId(String id) {
        this.id = id;
        return this;
    }

}
