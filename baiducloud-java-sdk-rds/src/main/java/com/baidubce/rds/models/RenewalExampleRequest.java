package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewalExampleRequest extends BaseBceRequest {

    /**
    * 续费周期，单位为月
    */
    private Integer duration;

    /**
    * 实例ID列表
    */
    private List<String> instanceIds;

    public Integer getDuration() {
        return duration;
    }

    public RenewalExampleRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public RenewalExampleRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
