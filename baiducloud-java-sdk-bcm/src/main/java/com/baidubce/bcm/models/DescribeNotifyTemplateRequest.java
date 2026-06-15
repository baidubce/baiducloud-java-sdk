package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeNotifyTemplateRequest extends BaseBceRequest {

    /**
    * 通知模板ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DescribeNotifyTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }

}
