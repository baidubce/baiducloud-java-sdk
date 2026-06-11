package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShareImageRequest extends BaseBceRequest {

    /**
    * imageId
    */
    @JsonIgnore
    private String imageId;

    /**
    * 待共享的用户名
    */
    private String account;

    /**
    * 待共享的用户ID
    */
    private String accountId;

    /**
    * uc账号
    */
    private String ucAccount;

    public String getImageId() {
        return imageId;
    }

    public ShareImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public ShareImageRequest setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public ShareImageRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getUcAccount() {
        return ucAccount;
    }

    public ShareImageRequest setUcAccount(String ucAccount) {
        this.ucAccount = ucAccount;
        return this;
    }

}
