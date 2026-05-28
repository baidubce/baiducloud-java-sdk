package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRecordRequest extends BaseBceRequest {

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
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getZoneName() {
        return zoneName;
    }

    public DeleteRecordRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getRecordId() {
        return recordId;
    }

    public DeleteRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
