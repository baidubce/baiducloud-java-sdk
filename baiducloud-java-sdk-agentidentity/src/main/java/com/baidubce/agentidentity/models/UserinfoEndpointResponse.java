package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserinfoEndpointResponse extends BaseBceResponse {

    /**
    * 用户池用户 ID
    */
    private String sub;

    /**
    * 用户名
    */
    private String username;

    /**
    * 显示名称
    */
    private String displayName;

    public String getSub() {
        return sub;
    }

    public UserinfoEndpointResponse setSub(String sub) {
        this.sub = sub;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserinfoEndpointResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UserinfoEndpointResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public String toString() {
        return "UserinfoEndpointResponse{" + "sub=" + sub + "\n" + "username=" + username + "\n" + "displayName=" + displayName + "\n" + "}";
    }

}
