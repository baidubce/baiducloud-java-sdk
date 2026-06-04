package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateResolverRuleResponse extends BaseBceResponse {

    /**
    * 转发规则的ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public CreateResolverRuleResponse setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "CreateResolverRuleResponse{" + "id=" + id + "\n" + "}";
    }

}
