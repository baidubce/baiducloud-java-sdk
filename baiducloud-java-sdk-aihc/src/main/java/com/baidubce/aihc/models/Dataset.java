package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dataset {
    /**
     * 是
     */
    private String id;

    /**
     * 是
     */
    private String name;

    /**
     * 是
     */
    private String storageType;

    /**
     * 是
     */
    private String storageInstance;

    /**
     * 是
     */
    private String importFormat;

    /**
     * 否
     */
    private String description;

    /**
     * 是
     */
    private String owner;

    /**
     * 是
     */
    private String ownerName;

    /**
     * 是
     */
    private String visibilityScope;

    /**
     * 否
     */
    private List<PermissionEntry> visibilityUser;

    /**
     * 否
     */
    private List<PermissionEntry> visibilityGroup;

    /**
     * 是
     */
    private String permission;

    /**
     * 否
     */
    private String latestVersionId;

    /**
     * 否
     */
    private String latestVersion;

    /**
     * 是
     */
    private String createdAt;

    /**
     * 是
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