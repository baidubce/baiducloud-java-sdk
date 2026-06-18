package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateApikeyPermanentlyValidRequest extends BaseBceRequest {

    /**
    * 子用户Id；如果apikey归属其他子用户则必填
    */
    private String userId;

    /**
    * APIKey ID
    */
    private String id;

    /**
    * ACL策略
    */
    private String acl;

    public String getUserId() {
        return userId;
    }

    public UpdateApikeyPermanentlyValidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getId() {
        return id;
    }

    public UpdateApikeyPermanentlyValidRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getAcl() {
        return acl;
    }

    public UpdateApikeyPermanentlyValidRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }

}
