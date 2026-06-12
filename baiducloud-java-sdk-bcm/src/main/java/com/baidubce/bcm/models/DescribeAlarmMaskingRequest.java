package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmMaskingRequest extends BaseBceRequest {

    /**
    * 屏蔽规则ID
    */
    private String id;

    public String getId() {
        return id;
    }

    public DescribeAlarmMaskingRequest setId(String id) {
        this.id = id;
        return this;
    }

}
