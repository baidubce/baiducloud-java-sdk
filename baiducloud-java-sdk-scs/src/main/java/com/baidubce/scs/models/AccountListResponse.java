package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountListResponse extends BaseBceResponse {

    /**
    * 请求是否成功。
    */
    private Boolean success;

    /**
    * 账号列表。
    */
    private List<ListItem> result;

    public Boolean getSuccess() {
        return success;
    }

    public AccountListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public List<ListItem> getResult() {
        return result;
    }

    public AccountListResponse setResult(List<ListItem> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "AccountListResponse{" + "success=" + success + "\n" + "result=" + result + "\n" + "}";
    }

}
