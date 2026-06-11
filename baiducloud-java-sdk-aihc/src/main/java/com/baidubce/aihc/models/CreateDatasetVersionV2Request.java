package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateDatasetVersionV2Request extends BaseBceRequest {

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

    public CreateDatasetVersionV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public CreateDatasetVersionV2Request setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getMountPath() {
        return mountPath;
    }

    public CreateDatasetVersionV2Request setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

}
