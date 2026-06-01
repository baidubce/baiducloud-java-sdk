package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMDimensionValuesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 属性值列表
    */
    private List<String> values;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMDimensionValuesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMDimensionValuesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMDimensionValuesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getValues() {
        return values;
    }

    public DescribeLLMDimensionValuesResponse setValues(List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMDimensionValuesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "values=" + values + "\n" + "}";
    }

}
