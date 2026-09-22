package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSystemParameterListResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * 系统参数列表
    */
    private List<Result> result;

    public Boolean getSuccess() {
        return success;
    }

    public GetSystemParameterListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public List<Result> getResult() {
        return result;
    }

    public GetSystemParameterListResponse setResult(List<Result> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetSystemParameterListResponse{" + "success=" + success + "\n" + "result=" + result + "\n" + "}";
    }

}
