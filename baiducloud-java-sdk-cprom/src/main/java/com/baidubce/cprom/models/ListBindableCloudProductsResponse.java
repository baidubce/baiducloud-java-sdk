package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBindableCloudProductsResponse extends BaseBceResponse {

    /**
    * BCM 支持的云产品列表
    */
    private List<ScopeDetail> scopes;

    public List<ScopeDetail> getScopes() {
        return scopes;
    }

    public ListBindableCloudProductsResponse setScopes(List<ScopeDetail> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        return "ListBindableCloudProductsResponse{" + "scopes=" + scopes + "\n" + "}";
    }

}
