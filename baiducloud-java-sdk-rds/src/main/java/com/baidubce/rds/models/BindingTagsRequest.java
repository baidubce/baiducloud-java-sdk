package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindingTagsRequest extends BaseBceRequest {

    /**
    * 资源列表
    */
    private List<Resource> resources;

    public List<Resource> getResources() {
        return resources;
    }

    public BindingTagsRequest setResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

}
