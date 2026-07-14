package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachNodeV2Response extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应消息
    */
    private String msg;

    /**
    * result
    */
    private DagModel result;

    public Boolean getSuccess() {
        return success;
    }

    public AttachNodeV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AttachNodeV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public DagModel getResult() {
        return result;
    }

    public AttachNodeV2Response setResult(DagModel result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "AttachNodeV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "result=" + result + "\n" + "}";
    }

}
