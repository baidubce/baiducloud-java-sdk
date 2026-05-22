package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBlbAclRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 是否支持ACL，缺省值为true，代表支持
    */
    private Boolean supportAcl;

    public String getBlbId() {
        return blbId;
    }

    public UpdateBlbAclRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateBlbAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Boolean getSupportAcl() {
        return supportAcl;
    }

    public UpdateBlbAclRequest setSupportAcl(Boolean supportAcl) {
        this.supportAcl = supportAcl;
        return this;
    }

}
