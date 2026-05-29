package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropMountTargetRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

    /**
    * mountId
    */
    @JsonIgnore
    private String mountId;

    public String getFsId() {
        return fsId;
    }

    public DropMountTargetRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getMountId() {
        return mountId;
    }

    public DropMountTargetRequest setMountId(String mountId) {
        this.mountId = mountId;
        return this;
    }

}
