package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindServiceTagRequest extends BaseBceRequest {

    /**
    * 应用名
    */
    private String serviceName;

    /**
    * 应用ID
    */
    private String serviceId;

    /**
    * 绑定标签列表，只支持更新全量标签，不支持更新部分标签
    */
    private List<Tag> tags;

    public String getServiceName() {
        return serviceName;
    }

    public BindServiceTagRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public BindServiceTagRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public BindServiceTagRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
