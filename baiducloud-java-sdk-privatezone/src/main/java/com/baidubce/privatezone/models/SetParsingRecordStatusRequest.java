package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetParsingRecordStatusRequest {

    /**
    * recordId
    */
    @JsonIgnore
    private String recordId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    public String getRecordId() {
        return recordId;
    }

    public SetParsingRecordStatusRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public SetParsingRecordStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAction() {
        return action;
    }

    public SetParsingRecordStatusRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
