package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoesTheInstanceSupportEnablingAutomaticExpansionResponse extends BaseBceResponse {

    /**
    * 实例是否支持启用存储自动扩容，0表示不支持，1表示支持
    */
    private Integer supportEnableDiskAutoResize;

    public Integer getSupportEnableDiskAutoResize() {
        return supportEnableDiskAutoResize;
    }

    public DoesTheInstanceSupportEnablingAutomaticExpansionResponse setSupportEnableDiskAutoResize(Integer supportEnableDiskAutoResize) {
        this.supportEnableDiskAutoResize = supportEnableDiskAutoResize;
        return this;
    }

    @Override
    public String toString() {
        return "DoesTheInstanceSupportEnablingAutomaticExpansionResponse{" + "supportEnableDiskAutoResize=" + supportEnableDiskAutoResize + "\n" + "}";
    }

}
