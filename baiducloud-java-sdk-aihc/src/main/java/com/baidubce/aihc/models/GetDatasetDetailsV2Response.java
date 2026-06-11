package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDatasetDetailsV2Response extends BaseBceResponse {

    /**
    * 数据集ID
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
    * latestVersionEntry
    */
    private DatasetVersionEntry latestVersionEntry;

    /**
    * 创建时间
    */
    private String createdAt;

    /**
    * 更新时间
    */
    private String updatedAt;

    public String getId() {
        return id;
    }

    public GetDatasetDetailsV2Response setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetDatasetDetailsV2Response setName(String name) {
        this.name = name;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public GetDatasetDetailsV2Response setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageInstance() {
        return storageInstance;
    }

    public GetDatasetDetailsV2Response setStorageInstance(String storageInstance) {
        this.storageInstance = storageInstance;
        return this;
    }

    public String getImportFormat() {
        return importFormat;
    }

    public GetDatasetDetailsV2Response setImportFormat(String importFormat) {
        this.importFormat = importFormat;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetDatasetDetailsV2Response setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public GetDatasetDetailsV2Response setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public GetDatasetDetailsV2Response setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public GetDatasetDetailsV2Response setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public List<PermissionEntry> getVisibilityUser() {
        return visibilityUser;
    }

    public GetDatasetDetailsV2Response setVisibilityUser(List<PermissionEntry> visibilityUser) {
        this.visibilityUser = visibilityUser;
        return this;
    }

    public List<PermissionEntry> getVisibilityGroup() {
        return visibilityGroup;
    }

    public GetDatasetDetailsV2Response setVisibilityGroup(List<PermissionEntry> visibilityGroup) {
        this.visibilityGroup = visibilityGroup;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public GetDatasetDetailsV2Response setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getLatestVersionId() {
        return latestVersionId;
    }

    public GetDatasetDetailsV2Response setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
        return this;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public GetDatasetDetailsV2Response setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    public DatasetVersionEntry getLatestVersionEntry() {
        return latestVersionEntry;
    }

    public GetDatasetDetailsV2Response setLatestVersionEntry(DatasetVersionEntry latestVersionEntry) {
        this.latestVersionEntry = latestVersionEntry;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public GetDatasetDetailsV2Response setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public GetDatasetDetailsV2Response setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return "GetDatasetDetailsV2Response{" + "id=" + id + "\n" + "name=" + name + "\n" + "storageType=" + storageType + "\n" + "storageInstance=" + storageInstance + "\n"
                + "importFormat=" + importFormat + "\n" + "description=" + description + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName + "\n" + "visibilityScope="
                + visibilityScope + "\n" + "visibilityUser=" + visibilityUser + "\n" + "visibilityGroup=" + visibilityGroup + "\n" + "permission=" + permission + "\n"
                + "latestVersionId=" + latestVersionId + "\n" + "latestVersion=" + latestVersion + "\n" + "latestVersionEntry=" + latestVersionEntry + "\n" + "createdAt="
                + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "}";
    }

}
