package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmRecordRequest extends BaseBceRequest {

    /**
    * alarmId
    */
    @JsonIgnore
    private String alarmId;

    public String getAlarmId() {
        return alarmId;
    }

    public DescribeAlarmRecordRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

}
