package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDownloadTaskLinkRequest extends BaseBceRequest {

    /**
    * uuid
    */
    @JsonIgnore
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public GetDownloadTaskLinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

}
