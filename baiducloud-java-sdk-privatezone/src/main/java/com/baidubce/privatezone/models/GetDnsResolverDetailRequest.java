package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverDetailRequest extends BaseBceRequest {

    /**
    * resolverId
    */
    @JsonIgnore
    private String resolverId;

    public String getResolverId() {
        return resolverId;
    }

    public GetDnsResolverDetailRequest setResolverId(String resolverId) {
        this.resolverId = resolverId;
        return this;
    }

}
