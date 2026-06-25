package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateServiceMonitorResponse extends BaseBceResponse {

    /**
    * Service Monitor名称
    */
    private String serviceMonitorName;

    public String getServiceMonitorName() {
        return serviceMonitorName;
    }

    public CreateServiceMonitorResponse setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }

    @Override
    public String toString() {
        return "CreateServiceMonitorResponse{" + "serviceMonitorName=" + serviceMonitorName + "\n" + "}";
    }

}
