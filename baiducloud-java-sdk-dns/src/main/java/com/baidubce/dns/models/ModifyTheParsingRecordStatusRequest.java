package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyTheParsingRecordStatusRequest extends BaseBceRequest {

    /**
    * zoneName
    */
    @JsonIgnore
    private String zoneName;

    /**
    * recordId
    */
    @JsonIgnore
    private String recordId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getZoneName() {
        return zoneName;
    }

    public ModifyTheParsingRecordStatusRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getRecordId() {
        return recordId;
    }

    public ModifyTheParsingRecordStatusRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public ModifyTheParsingRecordStatusRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ModifyTheParsingRecordStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
