package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateStudyRelationRequest extends BaseBceRequest {

    /**
    * csnRtId
    */
    @JsonIgnore
    private String csnRtId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 网络实例在云智能网中的身份的ID
    */
    private String attachId;

    /**
    * 描述
    */
    private String description;

    public String getCsnRtId() {
        return csnRtId;
    }

    public CreateStudyRelationRequest setCsnRtId(String csnRtId) {
        this.csnRtId = csnRtId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateStudyRelationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getAttachId() {
        return attachId;
    }

    public CreateStudyRelationRequest setAttachId(String attachId) {
        this.attachId = attachId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateStudyRelationRequest setDescription(String description) {
        this.description = description;
        return this;
    }

}
