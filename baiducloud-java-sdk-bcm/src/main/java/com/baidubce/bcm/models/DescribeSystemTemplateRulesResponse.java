package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSystemTemplateRulesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 系统模板报警规则列表
    */
    private List<AlarmRule> rules;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeSystemTemplateRulesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeSystemTemplateRulesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeSystemTemplateRulesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<AlarmRule> getRules() {
        return rules;
    }

    public DescribeSystemTemplateRulesResponse setRules(List<AlarmRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeSystemTemplateRulesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "rules=" + rules + "\n" + "}";
    }

}
