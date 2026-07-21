package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateApikeyPermanentlyValidRequest extends BaseBceRequest {

    /**
    * 子用户Id；不传就是当前用户
    */
    private String userId;

    /**
    * acl
    */
    private ACL acl;

    /**
    * APIKey名称；不传会默认生成
    */
    private String name;

    public String getUserId() {
        return userId;
    }

    public CreateApikeyPermanentlyValidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public ACL getAcl() {
        return acl;
    }

    public CreateApikeyPermanentlyValidRequest setAcl(ACL acl) {
        this.acl = acl;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateApikeyPermanentlyValidRequest setName(String name) {
        this.name = name;
        return this;
    }

}
