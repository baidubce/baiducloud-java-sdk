package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheDetailsOfSharedTrafficPackagesRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getId() {
        return id;
    }

    public QueryTheDetailsOfSharedTrafficPackagesRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public QueryTheDetailsOfSharedTrafficPackagesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
