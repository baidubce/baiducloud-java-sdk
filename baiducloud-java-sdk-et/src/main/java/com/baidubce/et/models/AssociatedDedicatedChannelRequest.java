package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociatedDedicatedChannelRequest extends BaseBceRequest {

    /**
    * etId
    */
    @JsonIgnore
    private String etId;

    /**
    * etChannelId
    */
    @JsonIgnore
    private String etChannelId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 被关联的专线通道ID
    */
    private String extraChannelId;

    public String getEtId() {
        return etId;
    }

    public AssociatedDedicatedChannelRequest setEtId(String etId) {
        this.etId = etId;
        return this;
    }

    public String getEtChannelId() {
        return etChannelId;
    }

    public AssociatedDedicatedChannelRequest setEtChannelId(String etChannelId) {
        this.etChannelId = etChannelId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public AssociatedDedicatedChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getExtraChannelId() {
        return extraChannelId;
    }

    public AssociatedDedicatedChannelRequest setExtraChannelId(String extraChannelId) {
        this.extraChannelId = extraChannelId;
        return this;
    }

}
