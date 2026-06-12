package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatasetVersionEntry {
    /**
     * 数据集版本ID。新建版本时，无需指定ID。
     */
    private String id;

    /**
     * 版本号。新建版本时，无需指定版本号。
     */
    private String version;

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

    /**
     * 创建用户
     */
    private String createUser;

    public DatasetVersionEntry setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public DatasetVersionEntry setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    public DatasetVersionEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DatasetVersionEntry setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getStoragePath() {
        return this.storagePath;
    }

    public DatasetVersionEntry setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public String getMountPath() {
        return this.mountPath;
    }

    public DatasetVersionEntry setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    @Override
    public String toString() {
        return "DatasetVersionEntry{" + "id=" + id + "\n" + "version=" + version + "\n" + "description=" + description + "\n" + "storagePath=" + storagePath + "\n" + "mountPath="
                + mountPath + "\n" + "createUser=" + createUser + "\n" + "}";
    }

}