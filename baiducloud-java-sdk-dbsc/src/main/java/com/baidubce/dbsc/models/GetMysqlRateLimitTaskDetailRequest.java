package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlRateLimitTaskDetailRequest extends BaseBceRequest {

    /**
    * filterId
    */
    @JsonIgnore
    private Integer filterId;

    public Integer getFilterId() {
        return filterId;
    }

    public GetMysqlRateLimitTaskDetailRequest setFilterId(Integer filterId) {
        this.filterId = filterId;
        return this;
    }

}
