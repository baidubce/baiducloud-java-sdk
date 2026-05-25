package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLLMTracesStatisticsV3Response extends BaseBceResponse {

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
    * Trace数量
    */
    private Integer count;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeLLMTracesStatisticsV3Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLLMTracesStatisticsV3Response setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLLMTracesStatisticsV3Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public DescribeLLMTracesStatisticsV3Response setCount(Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLLMTracesStatisticsV3Response{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "count=" + count + "\n" + "}";
    }

}
