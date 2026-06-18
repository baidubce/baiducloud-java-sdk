package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeSubUserPasswordRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * 更新后的密码
    */
    private String password;

    public String getUserName() {
        return userName;
    }

    public ChangeSubUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ChangeSubUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
