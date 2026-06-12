package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dataset {
    /**
     * 数据集ID。新建数据集时，无需指定ID。
     */
    private String id;

    /**
     * 数据集名称
     */
    private String name;

    /**
     * 存储类型PFS：并行存储PFSBOS：对象存储BOS
     */
    private String storageType;

    /**
     * 存储实例
     */
    private String storageInstance;

    /**
     * 导入格式FILE：文件FOLDER：文件夹
     */
    private String importFormat;

    /**
     * 描述
     */
    private String description;

    /**
     * 所有者
     */
    private String owner;

    /**
     * 所有者名称
     */
    private String ownerName;

    /**
     * 可见范围ALL_PEOPLE：所有人可见ONLY_OWNER：仅所有者可读写USER_GROUP：指定范围可用
     */
    private String visibilityScope;

    /**
     * 
     */
    private List<PermissionEntry> visibilityUser;

    /**
     * 
     */
    private List<PermissionEntry> visibilityGroup;

    /**
     * 当前用户拥有的读写权限：r：只读rw：读写
     */
    private String permission;

    /**
     * 最新版本ID
     */
    private String latestVersionId;

    /**
     * 最新版本号
     */
    private String latestVersion;

    /**
     * 创建时间
     */
    private String createdAt;

    /**
     * 更新时间
     */
    private String updatedAt;

    public Dataset setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Dataset setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Dataset setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public Dataset setStorageInstance(String storageInstance) {
        this.storageInstance = storageInstance;
        return this;
    }

    public String getStorageInstance() {
        return this.storageInstance;
    }

    public Dataset setImportFormat(String importFormat) {
        this.importFormat = importFormat;
        return this;
    }

    public String getImportFormat() {
        return this.importFormat;
    }

    public Dataset setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Dataset setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return this.owner;
    }

    public Dataset setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public Dataset setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public String getVisibilityScope() {
        return this.visibilityScope;
    }

    public Dataset setVisibilityUser(List<PermissionEntry> visibilityUser) {
        this.visibilityUser = visibilityUser;
        return this;
    }

    public List<PermissionEntry> getVisibilityUser() {
        return this.visibilityUser;
    }

    public Dataset setVisibilityGroup(List<PermissionEntry> visibilityGroup) {
        this.visibilityGroup = visibilityGroup;
        return this;
    }

    public List<PermissionEntry> getVisibilityGroup() {
        return this.visibilityGroup;
    }

    public Dataset setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getPermission() {
        return this.permission;
    }

    public Dataset setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
        return this;
    }

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    public Dataset setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    public String getLatestVersion() {
        return this.latestVersion;
    }

    public Dataset setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public Dataset setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        return "Dataset{" + "id=" + id + "\n" + "name=" + name + "\n" + "storageType=" + storageType + "\n" + "storageInstance=" + storageInstance + "\n" + "importFormat="
                + importFormat + "\n" + "description=" + description + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName + "\n" + "visibilityScope=" + visibilityScope
                + "\n" + "visibilityUser=" + visibilityUser + "\n" + "visibilityGroup=" + visibilityGroup + "\n" + "permission=" + permission + "\n" + "latestVersionId="
                + latestVersionId + "\n" + "latestVersion=" + latestVersion + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}