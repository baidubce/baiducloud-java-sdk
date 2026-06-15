package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmTemplateRequest extends BaseBceRequest {

    /**
    * 报警模板ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DescribeAlarmTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }

}
