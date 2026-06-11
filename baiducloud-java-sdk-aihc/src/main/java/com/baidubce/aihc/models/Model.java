package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Model {
    /**
     * 否
     */
    private String id;

    /**
     * 是
     */
    private String name;

    /**
     * 是
     */
    private String initSource;

    /**
     * 否
     */
    private String latestVersion;

    /**
     * 否
     */
    private String latestVersionId;

    /**
     * 是
     */
    private String modelFormat;

    /**
     * 否
     */
    private String description;

    /**
     * 否
     */
    private String updatedAt;

    /**
     * 否
     */
    private String createdAt;

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

    public Model setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Model setInitSource(String initSource) {
        this.initSource = initSource;
        return this;
    }

    public String getInitSource() {
        return this.initSource;
    }

    public Model setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    public String getLatestVersion() {
        return this.latestVersion;
    }

    public Model setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
        return this;
    }

    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    public Model setModelFormat(String modelFormat) {
        this.modelFormat = modelFormat;
        return this;
    }

    public String getModelFormat() {
        return this.modelFormat;
    }

    public Model setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Model setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Model setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public Model setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return this.owner;
    }

    public Model setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public Model setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public String getVisibilityScope() {
        return this.visibilityScope;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id + "\n" + "name=" + name + "\n" + "initSource=" + initSource + "\n" + "latestVersion=" + latestVersion + "\n" + "latestVersionId="
                + latestVersionId + "\n" + "modelFormat=" + modelFormat + "\n" + "description=" + description + "\n" + "updatedAt=" + updatedAt + "\n" + "createdAt=" + createdAt
                + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName + "\n" + "visibilityScope=" + visibilityScope + "\n" + "}";
    }

}