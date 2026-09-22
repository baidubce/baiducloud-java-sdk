package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisconnectEntranceResponse extends BaseBceResponse {

    /**
    * 是否操作成功
    */
    private Boolean success;

    /**
    * 是否操作成功。和success一致。
    */
    private Boolean result;

    public Boolean getSuccess() {
        return success;
    }

    public DisconnectEntranceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Boolean getResult() {
        return result;
    }

    public DisconnectEntranceResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "DisconnectEntranceResponse{" + "success=" + success + "\n" + "result=" + result + "\n" + "}";
    }

}
