package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifySubUserOperationProtectionRequest extends BaseBceRequest {

    /**
    * 需要更新的子用户名称
    */
    private String userName;

    /**
    * 开启或关闭子用户操作保护
    */
    private Boolean enabledMfa;

    /**
    * 子用户操作保护类型
    */
    private String mfaType;

    public String getUserName() {
        return userName;
    }

    public ModifySubUserOperationProtectionRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Boolean getEnabledMfa() {
        return enabledMfa;
    }

    public ModifySubUserOperationProtectionRequest setEnabledMfa(Boolean enabledMfa) {
        this.enabledMfa = enabledMfa;
        return this;
    }

    public String getMfaType() {
        return mfaType;
    }

    public ModifySubUserOperationProtectionRequest setMfaType(String mfaType) {
        this.mfaType = mfaType;
        return this;
    }

}
