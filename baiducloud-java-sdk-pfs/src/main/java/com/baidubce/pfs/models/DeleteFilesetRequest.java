package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteFilesetRequest extends BaseBceRequest {

    /**
    * fileset所属的pfs实例短id
    */
    private String instanceId;

    /**
    * 删除fileset的Id
    */
    private String filesetId;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteFilesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public DeleteFilesetRequest setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

}
