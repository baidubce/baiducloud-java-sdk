package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrInfo {
    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误描述
     */
    private String errMsg;

    public ErrInfo setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public ErrInfo setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public String toString() {
        return "ErrInfo{" + "errCode=" + errCode + "\n" + "errMsg=" + errMsg + "\n" + "}";
    }

}