package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewInstanceRequest extends BaseBceRequest {

    /**
    * 集群ID列表。
    */
    private List<String> instanceIds;

    /**
    * 转预付费的时长，单位月。最小值1。
    */
    private Integer duration;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public RenewInstanceRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public RenewInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

}
