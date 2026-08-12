package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSandboxesV2Request extends BaseBceRequest {

    /**
    * limit
    */
    @JsonIgnore
    private Integer limit;

    /**
    * nextToken
    */
    @JsonIgnore
    private String nextToken;

    /**
    * metadata
    */
    @JsonIgnore
    private String metadata;

    /**
    * state
    */
    @JsonIgnore
    private String state;

    public Integer getLimit() {
        return limit;
    }

    public ListSandboxesV2Request setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getNextToken() {
        return nextToken;
    }

    public ListSandboxesV2Request setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    public String getMetadata() {
        return metadata;
    }

    public ListSandboxesV2Request setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getState() {
        return state;
    }

    public ListSandboxesV2Request setState(String state) {
        this.state = state;
        return this;
    }

}
