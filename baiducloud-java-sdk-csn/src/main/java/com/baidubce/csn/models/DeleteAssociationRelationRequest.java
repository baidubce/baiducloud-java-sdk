package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAssociationRelationRequest extends BaseBceRequest {

    /**
    * csnRtId
    */
    @JsonIgnore
    private String csnRtId;

    /**
    * attachId
    */
    @JsonIgnore
    private String attachId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    public String getCsnRtId() {
        return csnRtId;
    }

    public DeleteAssociationRelationRequest setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getAttachId() {
        return attachId;
    }

    public DeleteAssociationRelationRequest setAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAssociationRelationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

}
