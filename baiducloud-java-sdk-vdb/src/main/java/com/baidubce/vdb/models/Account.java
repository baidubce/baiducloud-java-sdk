package com.baidubce.vdb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
    /**
     * 
     */
    private String username;

    public Account setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    @Override
    public String toString() {
        return "Account{" + "username=" + username + "\n" + "}";
    }

}