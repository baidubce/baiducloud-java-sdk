package com.baidubce.privatezone.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteParsingRecordsRequest {

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

    public String getRecordId() {
        return recordId;
    }

    public DeleteParsingRecordsRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteParsingRecordsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
