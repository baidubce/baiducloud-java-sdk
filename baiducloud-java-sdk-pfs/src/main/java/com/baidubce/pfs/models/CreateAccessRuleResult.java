package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAccessRuleResult {
    /**
     * 该条是否创建成功
     */
    private Boolean success;

    /**
     * 成功时返回的规则 ID
     */
    private Integer accessRuleId;

    /**
     * 失败原因，成功时不返回
     */
    private String errorMsg;

    /**
     * 该条规则对应的客户端 IP
     */
    private String ip;

    /**
     * 该条规则对应的掩码位数
     */
    private Integer mask;

    public CreateAccessRuleResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAccessRuleResult setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public Integer getAccessRuleId() {
        return this.accessRuleId;
    }

    public CreateAccessRuleResult setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateAccessRuleResult setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public CreateAccessRuleResult setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public Integer getMask() {
        return this.mask;
    }

    @Override
    public String toString() {
        return "CreateAccessRuleResult{" + "success=" + success + "\n" + "accessRuleId=" + accessRuleId + "\n" + "errorMsg=" + errorMsg + "\n" + "ip=" + ip + "\n" + "mask=" + mask
                + "\n" + "}";
    }

}