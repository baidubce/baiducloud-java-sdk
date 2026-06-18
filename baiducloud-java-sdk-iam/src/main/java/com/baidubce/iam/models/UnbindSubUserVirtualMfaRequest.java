package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindSubUserVirtualMfaRequest extends BaseBceRequest {

    /**
    * userName
    */
    @JsonIgnore
    private String userName;

    /**
    * mfaType
    */
    @JsonIgnore
    private String mfaType;

    public String getUserName() {
        return userName;
    }

    public UnbindSubUserVirtualMfaRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getMfaType() {
        return mfaType;
    }

    public UnbindSubUserVirtualMfaRequest setMfaType(String mfaType) {
        this.mfaType = mfaType;
        return this;
    }

}
