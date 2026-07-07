package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteUserPoolRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DeleteUserPoolRequest setId(String id) {
        this.id = id;
        return this;
    }

}
