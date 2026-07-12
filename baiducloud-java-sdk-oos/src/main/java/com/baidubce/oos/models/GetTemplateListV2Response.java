package com.baidubce.oos.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTemplateListV2Response extends BaseBceResponse {

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
    private TemplatePage result;

    public Boolean getSuccess() {
        return success;
    }

    public GetTemplateListV2Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GetTemplateListV2Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public TemplatePage getResult() {
        return result;
    }

    public GetTemplateListV2Response setResult(TemplatePage result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetTemplateListV2Response{" + "success=" + success + "\n" + "msg=" + msg + "\n" + "result=" + result + "\n" + "}";
    }

}
