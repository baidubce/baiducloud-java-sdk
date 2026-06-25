package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRelatedCloudProductsResponse extends BaseBceResponse {

    /**
    * 已关联的云产品列表，未关联时返回空数组 `[]`
    */
    private List<String> scopes;

    public List<String> getScopes() {
        return scopes;
    }

    public ListRelatedCloudProductsResponse setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        return "ListRelatedCloudProductsResponse{" + "scopes=" + scopes + "\n" + "}";
    }

}
