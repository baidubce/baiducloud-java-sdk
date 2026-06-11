package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnShareImageRequest extends BaseBceRequest {

    /**
    * imageId
    */
    @JsonIgnore
    private String imageId;

    /**
    * 待取消共享的用户名
    */
    private String account;

    /**
    * 待取消共享的用户ID
    */
    private String accountId;

    /**
    * uc账号
    */
    private String ucAccount;

    public String getImageId() {
        return imageId;
    }

    public UnShareImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public UnShareImageRequest setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public UnShareImageRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getUcAccount() {
        return ucAccount;
    }

    public UnShareImageRequest setUcAccount(String ucAccount) {
        this.ucAccount = ucAccount;
        return this;
    }

}
