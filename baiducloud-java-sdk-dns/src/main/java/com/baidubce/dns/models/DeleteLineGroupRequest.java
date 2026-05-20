package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteLineGroupRequest extends BaseBceRequest {

    /**
    * lineId
    */
    @JsonIgnore
    private String lineId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getLineId() {
        return lineId;
    }

    public DeleteLineGroupRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteLineGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
