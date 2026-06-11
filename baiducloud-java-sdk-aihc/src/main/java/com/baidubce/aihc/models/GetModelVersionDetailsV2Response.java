package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetModelVersionDetailsV2Response extends BaseBceResponse {

    /**
    * 模型名称
    */
    private String name;

    /**
    * 模型ID
    */
    private String id;

    /**
    * 模型创建时的来源UserUpload：用户上传
    */
    private String initSource;

    /**
    * 模型格式
    */
    private String modelFormat;

    /**
    * 描述
    */
    private String description;

    /**
    * 模型创建时间
    */
    private String createdAt;

    /**
    * 模型更新时间
    */
    private String updatedAt;

    /**
    * 所有者
    */
    private String owner;

    /**
    * 所有者名称
    */
    private String ownerName;

    /**
    * 可见范围
    */
    private String visibilityScope;

    /**
    * versionEntry
    */
    private ModelVersionEntry versionEntry;

    public String getName() {
        return name;
    }

    public GetModelVersionDetailsV2Response setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetModelVersionDetailsV2Response setId(String id) {
        this.id = id;
        return this;
    }

    public String getInitSource() {
        return initSource;
    }

    public GetModelVersionDetailsV2Response setInitSource(String initSource) {
        this.initSource = initSource;
        return this;
    }

    public String getModelFormat() {
        return modelFormat;
    }

    public GetModelVersionDetailsV2Response setModelFormat(String modelFormat) {
        this.modelFormat = modelFormat;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GetModelVersionDetailsV2Response setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public GetModelVersionDetailsV2Response setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public GetModelVersionDetailsV2Response setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public GetModelVersionDetailsV2Response setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public GetModelVersionDetailsV2Response setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public GetModelVersionDetailsV2Response setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public ModelVersionEntry getVersionEntry() {
        return versionEntry;
    }

    public GetModelVersionDetailsV2Response setVersionEntry(ModelVersionEntry versionEntry) {
        this.versionEntry = versionEntry;
        return this;
    }

    @Override
    public String toString() {
        return "GetModelVersionDetailsV2Response{" + "name=" + name + "\n" + "id=" + id + "\n" + "initSource=" + initSource + "\n" + "modelFormat=" + modelFormat + "\n"
                + "description=" + description + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName
                + "\n" + "visibilityScope=" + visibilityScope + "\n" + "versionEntry=" + versionEntry + "\n" + "}";
    }

}
