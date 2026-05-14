package com.baidubce.snic.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSnicRequest extends BaseBceRequest {

    /**
    * endpointId
    */
    @JsonIgnore
    private String endpointId;

    public String getEndpointId() {
        return endpointId;
    }

    public DescribeSnicRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

}
