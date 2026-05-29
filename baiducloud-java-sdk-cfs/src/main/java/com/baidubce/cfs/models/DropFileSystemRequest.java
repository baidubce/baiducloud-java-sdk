package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropFileSystemRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

    public String getFsId() {
        return fsId;
    }

    public DropFileSystemRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

}
