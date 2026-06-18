package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateLoginProfileRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * 用户密码；作为响应时不显示
    */
    private String password;

    /**
    * 下次登录时是否需要重置密码
    */
    private Boolean needResetPassword;

    /**
    * 是否允许子用户控制台登录
    */
    private Boolean enabledLogin;

    /**
    * 是否要求绑定二次验证设备
    */
    private Boolean enabledLoginMfa;

    /**
    * 二次验证类型，可选：PHONE-手机号，TOTP虚拟MFA设备
    */
    private String loginMfaType;

    /**
    * 绑定的第三方登录类型，可选：UUAP-内网账号，PASSPORT-百度账号
    */
    private String thirdPartyType;

    /**
    * 绑定的第三方登录账号。绑定类型为PASSPORT时可以是手机、邮箱以及账号名称
    */
    private String thirdPartyAccount;

    public String getUserName() {
        return userName;
    }

    public UpdateLoginProfileRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UpdateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getNeedResetPassword() {
        return needResetPassword;
    }

    public UpdateLoginProfileRequest setNeedResetPassword(Boolean needResetPassword) {
        this.needResetPassword = needResetPassword;
        return this;
    }

    public Boolean getEnabledLogin() {
        return enabledLogin;
    }

    public UpdateLoginProfileRequest setEnabledLogin(Boolean enabledLogin) {
        this.enabledLogin = enabledLogin;
        return this;
    }

    public Boolean getEnabledLoginMfa() {
        return enabledLoginMfa;
    }

    public UpdateLoginProfileRequest setEnabledLoginMfa(Boolean enabledLoginMfa) {
        this.enabledLoginMfa = enabledLoginMfa;
        return this;
    }

    public String getLoginMfaType() {
        return loginMfaType;
    }

    public UpdateLoginProfileRequest setLoginMfaType(String loginMfaType) {
        this.loginMfaType = loginMfaType;
        return this;
    }

    public String getThirdPartyType() {
        return thirdPartyType;
    }

    public UpdateLoginProfileRequest setThirdPartyType(String thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
        return this;
    }

    public String getThirdPartyAccount() {
        return thirdPartyAccount;
    }

    public UpdateLoginProfileRequest setThirdPartyAccount(String thirdPartyAccount) {
        this.thirdPartyAccount = thirdPartyAccount;
        return this;
    }

}
