package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindClusterResponse extends BaseBceResponse {

    /**
    * 绑定状态。绑定请求返回 `Binding`，解绑请求返回 `Unbinding`。
    */
    private String bindingStatus;

    public String getBindingStatus() {
        return bindingStatus;
    }

    public BindClusterResponse setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
        return this;
    }

    @Override
    public String toString() {
        return "BindClusterResponse{" + "bindingStatus=" + bindingStatus + "\n" + "}";
    }

}
