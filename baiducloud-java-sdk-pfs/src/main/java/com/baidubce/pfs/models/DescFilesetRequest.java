package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescFilesetRequest extends BaseBceRequest {

    /**
    * fileset所属PFS实例Id
    */
    private String instanceId;

    /**
    * fileset Id
    */
    private String filesetId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescFilesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public DescFilesetRequest setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

}
