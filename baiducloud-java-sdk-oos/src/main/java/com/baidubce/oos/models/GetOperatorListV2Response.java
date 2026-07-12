package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOperatorListV2Response extends BaseBceResponse {

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
    private OperatorPage result;

    public Boolean getSuccess() {
        return success;
    }

    public GetOperatorListV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GetOperatorListV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public OperatorPage getResult() {
        return result;
    }

    public GetOperatorListV2Response setResult(OperatorPage result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetOperatorListV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "result=" + result + "\n" + "}";
    }

}
