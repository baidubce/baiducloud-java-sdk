package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdMatchStatusResult {
    /**
     * 认证状态字段 0：身份信息核验成功，并返回当前证件、户籍状态信息 1：身份信息无效，包含“身份信息不存在”、“身份证号不存在”、2种情况。
     */
    @JsonProperty("verify_status")
    private Integer verifyStatus;

    /**
     * 证件是否最新，1 最新、0 非最新
     */
    private Integer isNewest;

    /**
     * 证件是否挂失，1 挂失、0 非挂失
     */
    private Integer isLosted;

    /**
     * 证件是否过期，1 过期、0 非过期
     */
    private Integer isExpired;

    /**
     * 户籍状态，0有效、1暂时失效（户籍迁出，但未迁入）、2无效（死亡、失踪、迁出、服兵役、出国境定居、消除重复登记人口、冻结户口、重载注销等）
     */
    private Integer hjzt;

    public IdMatchStatusResult setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public IdMatchStatusResult setIsNewest(Integer isNewest) {
        this.isNewest = isNewest;
        return this;
    }

    public Integer getIsNewest() {
        return this.isNewest;
    }

    public IdMatchStatusResult setIsLosted(Integer isLosted) {
        this.isLosted = isLosted;
        return this;
    }

    public Integer getIsLosted() {
        return this.isLosted;
    }

    public IdMatchStatusResult setIsExpired(Integer isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    public Integer getIsExpired() {
        return this.isExpired;
    }

    public IdMatchStatusResult setHjzt(Integer hjzt) {
        this.hjzt = hjzt;
        return this;
    }

    public Integer getHjzt() {
        return this.hjzt;
    }

    @Override
    public String toString() {
        return "IdMatchStatusResult{" + "verifyStatus=" + verifyStatus + "\n" + "isNewest=" + isNewest + "\n" + "isLosted=" + isLosted + "\n" + "isExpired=" + isExpired + "\n"
                + "hjzt=" + hjzt + "\n" + "}";
    }

}