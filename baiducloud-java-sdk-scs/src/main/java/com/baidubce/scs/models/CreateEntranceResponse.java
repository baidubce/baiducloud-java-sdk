package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEntranceResponse extends BaseBceResponse {

    /**
    * 是否创建成功
    */
    private Boolean success;

    /**
    * 是否创建成功，和success一致
    */
    private Boolean result;

    public Boolean getSuccess() {
        return success;
    }

    public CreateEntranceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getResult() {
        return result;
    }

    public CreateEntranceResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "CreateEntranceResponse{" + "success=" + success + "\n" + "result=" + result + "\n" + "}";
    }

}
