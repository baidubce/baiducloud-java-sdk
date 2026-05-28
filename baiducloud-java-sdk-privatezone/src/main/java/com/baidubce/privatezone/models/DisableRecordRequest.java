package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisableRecordRequest extends BaseBceRequest {

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

    public DisableRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DisableRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
