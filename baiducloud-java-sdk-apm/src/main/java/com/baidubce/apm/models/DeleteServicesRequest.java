package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteServicesRequest extends BaseBceRequest {

    /**
    * 应用名列表，支持批量删除
    */
    private List<String> serviceNames;

    public List<String> getServiceNames() {
        return serviceNames;
    }

    public DeleteServicesRequest setServiceNames(List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }

}
