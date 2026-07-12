package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetExecutionListV2Response extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 失败时返回失败原因，成功时为空字符串
    */
    private String msg;

    /**
    * result
    */
    private ExecutionPage result;

    public Boolean getSuccess() {
        return success;
    }

    public GetExecutionListV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GetExecutionListV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ExecutionPage getResult() {
        return result;
    }

    public GetExecutionListV2Response setResult(ExecutionPage result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetExecutionListV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "result=" + result + "\n" + "}";
    }

}
