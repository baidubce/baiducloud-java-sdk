package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceResponse extends BaseBceResponse {

    /**
    * 服务发布点的域名，使用此域名绑定服务网卡
    */
    private String service;

    public String getService() {
        return service;
    }

    public CreateServiceResponse setService(String service) {
        this.service = service;
        return this;
    }

    @Override
    public String toString() {
        return "CreateServiceResponse{" + "service=" + service + "\n" + "}";
    }

}
