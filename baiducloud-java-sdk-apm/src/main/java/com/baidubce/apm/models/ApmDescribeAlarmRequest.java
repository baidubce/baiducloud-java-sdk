package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmRequest extends BaseBceRequest {

    /**
    * 报警事件ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public ApmDescribeAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }

}
