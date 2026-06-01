package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Auth {
    /**
     * 用户id，所有人使用"*"
     */
    private String uid;

    /**
     * 鉴权方式，取值：allow/deny，分别表示允许/拒绝
     */
    private String auth;

    public Auth setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getUid() {
        return this.uid;
    }

    public Auth setAuth(String auth) {
        this.auth = auth;
        return this;
    }

    public String getAuth() {
        return this.auth;
    }

    @Override
    public String toString() {
        return "Auth{" + "uid=" + uid + "\n" + "auth=" + auth + "\n" + "}";
    }

}