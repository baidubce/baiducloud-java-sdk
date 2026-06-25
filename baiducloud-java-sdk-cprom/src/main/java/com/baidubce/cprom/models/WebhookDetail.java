package com.baidubce.cprom.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebhookDetail {
    /**
     * 机器人名称
     */
    private String hookName;

    /**
     * webhook请求的HTTP方法，默认post
     */
    private String hookMethod;

    /**
     * 机器人地址
     */
    private String hookUrl;

    /**
     * webhook请求的HTTP头部信息
     */
    private Map<String, String> headers;

    /**
     * webhook请求参数
     */
    private Map<String, String> params;

    /**
     * mentionedUsers
     */
    private MentionedUserConfig mentionedUsers;

    public WebhookDetail setHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    public String getHookName() {
        return this.hookName;
    }

    public WebhookDetail setHookMethod(String hookMethod) {
        this.hookMethod = hookMethod;
        return this;
    }

    public String getHookMethod() {
        return this.hookMethod;
    }

    public WebhookDetail setHookUrl(String hookUrl) {
        this.hookUrl = hookUrl;
        return this;
    }

    public String getHookUrl() {
        return this.hookUrl;
    }

    public WebhookDetail setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public WebhookDetail setParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public WebhookDetail setMentionedUsers(MentionedUserConfig mentionedUsers) {
        this.mentionedUsers = mentionedUsers;
        return this;
    }

    public MentionedUserConfig getMentionedUsers() {
        return this.mentionedUsers;
    }

    @Override
    public String toString() {
        return "WebhookDetail{" + "hookName=" + hookName + "\n" + "hookMethod=" + hookMethod + "\n" + "hookUrl=" + hookUrl + "\n" + "headers=" + headers + "\n" + "params="
                + params + "\n" + "mentionedUsers=" + mentionedUsers + "\n" + "}";
    }

}