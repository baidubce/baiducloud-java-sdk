package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDedicatedChannelRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    public String getEtId() {
        return etId;
    }

    public QueryDedicatedChannelRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public QueryDedicatedChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public QueryDedicatedChannelRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

}
