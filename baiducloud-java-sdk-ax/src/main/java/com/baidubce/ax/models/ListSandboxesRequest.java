package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSandboxesRequest extends BaseBceRequest {

    /**
    * metadata
    */
    @JsonIgnore
    private String metadata;

    public String getMetadata() {
        return metadata;
    }

    public ListSandboxesRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

}
