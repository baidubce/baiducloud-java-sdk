package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateProjectRequest extends BaseBceRequest {

    /**
    * 日志组UUID
    */
    private String uuid;

    /**
    * 日志组描述
    */
    private String description;

    /**
    * 日志组是否置顶
    */
    private Boolean top;

    public String getUuid() {
        return uuid;
    }

    public UpdateProjectRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getTop() {
        return top;
    }

    public UpdateProjectRequest setTop(Boolean top) {
        this.top = top;
        return this;
    }

}
