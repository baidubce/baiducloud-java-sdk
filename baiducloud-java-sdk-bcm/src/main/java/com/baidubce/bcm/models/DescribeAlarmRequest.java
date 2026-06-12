package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmRequest extends BaseBceRequest {

    /**
    * 报警记录ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DescribeAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }

}
