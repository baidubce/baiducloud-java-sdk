package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdMatchDateResult {
    /**
     * 认证状态字段 0：身份信息核验成功 1：身份信息无效，包含“身份证号与姓名不匹配”、“身份证号不存在”、“身份证有效期信息不匹配”、“身份证已挂失”4种情况
     */
    @JsonProperty("verify_status")
    private Integer verifyStatus;

    public IdMatchDateResult setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    @Override
    public String toString() {
        return "IdMatchDateResult{" + "verifyStatus=" + verifyStatus + "\n" + "}";
    }

}