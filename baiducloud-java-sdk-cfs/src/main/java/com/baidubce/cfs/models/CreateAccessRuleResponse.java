package com.baidubce.cfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccessRuleResponse {
    /**
     * 表示对应的规则是否成功创建
     */
    private Boolean sucess;

    /**
     * 如果创建成功，包含该字段表示成功创建的规则的标识符
     */
    private Integer arIdx;

    /**
     * 如果创建失败，包含该字段表示该规则创建失败的原因
     */
    private String errMsg;

    public CreateAccessRuleResponse setSucess(Boolean sucess) {
        this.sucess = sucess;
        return this;
    }

    public Boolean getSucess() {
        return this.sucess;
    }

    public CreateAccessRuleResponse setArIdx(Integer arIdx) {
        this.arIdx = arIdx;
        return this;
    }

    public Integer getArIdx() {
        return this.arIdx;
    }

    public CreateAccessRuleResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public String toString() {
        return "CreateAccessRuleResponse{" + "sucess=" + sucess + "\n" + "arIdx=" + arIdx + "\n" + "errMsg=" + errMsg + "\n" + "}";
    }

}