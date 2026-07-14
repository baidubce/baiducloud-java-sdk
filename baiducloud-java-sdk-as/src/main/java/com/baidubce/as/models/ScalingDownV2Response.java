package com.baidubce.as.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScalingDownV2Response extends BaseBceResponse {

    /**
    * 节点数量
    */
    private Boolean success;

    /**
    * 区域信息
    */
    private String msg;

    /**
    * result
    */
    private DagModel result;

    public Boolean getSuccess() {
        return success;
    }

    public ScalingDownV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ScalingDownV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public DagModel getResult() {
        return result;
    }

    public ScalingDownV2Response setResult(DagModel result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ScalingDownV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "result=" + result + "\n" + "}";
    }

}
