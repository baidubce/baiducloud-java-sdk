package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeypairDetailRequest extends BaseBceRequest {

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    public String getKeypairId() {
        return keypairId;
    }

    public KeypairDetailRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

}
