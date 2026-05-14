package com.baidubce.snic.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAvailablePublicServicesResponse extends BaseBceResponse {

    /**
    * 公共服务的域名列表
    */
    private List<String> services;

    public List<String> getServices() {
        return services;
    }

    public QueryAvailablePublicServicesResponse setServices(List<String> services) {
        this.services = services;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAvailablePublicServicesResponse{" + "services=" + services + "\n" + "}";
    }

}
