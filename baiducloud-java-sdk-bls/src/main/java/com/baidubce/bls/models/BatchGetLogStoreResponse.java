package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetLogStoreResponse extends BaseBceResponse {

    /**
    * 状态码
    */
    private String code;

    /**
    * 返回是否成功
    */
    private Boolean success;

    /**
    * LogStore 列表
    */
    private List<LogStoreDetail> result;

    public String getCode() {
        return code;
    }

    public BatchGetLogStoreResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public BatchGetLogStoreResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public List<LogStoreDetail> getResult() {
        return result;
    }

    public BatchGetLogStoreResponse setResult(List<LogStoreDetail> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "BatchGetLogStoreResponse{" + "code=" + code + "\n" + "success=" + success + "\n" + "result=" + result + "\n" + "}";
    }

}
