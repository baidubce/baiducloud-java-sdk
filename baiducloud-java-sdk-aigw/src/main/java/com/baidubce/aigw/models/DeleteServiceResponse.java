package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServiceResponse extends BaseBceResponse {

    /**
    * 删除成功时为空，实际响应为 null
    */
    private String result;

    public String getResult() {
        return result;
    }

    public DeleteServiceResponse setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "DeleteServiceResponse{" + "result=" + result + "\n" + "}";
    }

}
