package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDatasetVersionRequest extends BaseBceRequest {

    /**
    * 版本描述
    */
    private String description;

    /**
    * 存储路径
    */
    private String storagePath;

    /**
    * 默认挂载路径
    */
    private String mountPath;

    public String getDescription() {
        return description;
    }

    public CreateDatasetVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public CreateDatasetVersionRequest setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getMountPath() {
        return mountPath;
    }

    public CreateDatasetVersionRequest setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

}
