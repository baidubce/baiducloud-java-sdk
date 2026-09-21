package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordUsingGETResponse extends BaseBceResponse {

    /**
    * password
    */
    private String password;

    /**
    * username
    */
    private String username;

    public String getPassword() {
        return password;
    }

    public PasswordUsingGETResponse setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public PasswordUsingGETResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return "PasswordUsingGETResponse{" + "password=" + password + "\n" + "username=" + username + "\n" + "}";
    }

}
