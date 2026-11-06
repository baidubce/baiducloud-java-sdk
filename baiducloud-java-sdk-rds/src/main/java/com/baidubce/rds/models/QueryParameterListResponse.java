package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryParameterListResponse extends BaseBceResponse {

    /**
    * 当前数据版本号，如：v1
    */
    private String etag;

    /**
    * OpenApiConfigItem对象
    */
    private List<OpenApiConfigItem> parameters;

    public String getEtag() {
        return etag;
    }

    public QueryParameterListResponse setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public List<OpenApiConfigItem> getParameters() {
        return parameters;
    }

    public QueryParameterListResponse setParameters(List<OpenApiConfigItem> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        return "QueryParameterListResponse{" + "etag=" + etag + "\n" + "parameters=" + parameters + "\n" + "}";
    }

}
