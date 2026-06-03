package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBeforeCreateInstanceResponse extends BaseBceResponse {

    /**
    * 是否通过校验
    */
    private Boolean pass;

    /**
    * errInfo
    */
    private ErrInfo errInfo;

    public Boolean getPass() {
        return pass;
    }

    public CheckBeforeCreateInstanceResponse setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }

    public ErrInfo getErrInfo() {
        return errInfo;
    }

    public CheckBeforeCreateInstanceResponse setErrInfo(ErrInfo errInfo) {
        this.errInfo = errInfo;
        return this;
    }

    @Override
    public String toString() {
        return "CheckBeforeCreateInstanceResponse{" + "pass=" + pass + "\n" + "errInfo=" + errInfo + "\n" + "}";
    }

}
