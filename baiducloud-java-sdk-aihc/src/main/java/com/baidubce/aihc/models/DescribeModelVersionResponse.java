package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeModelVersionResponse extends BaseBceResponse {

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

    public DescribeModelVersionResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeModelVersionResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getInitSource() {
        return initSource;
    }

    public DescribeModelVersionResponse setInitSource(String initSource) {
        this.initSource = initSource;
        return this;
    }

    public String getModelFormat() {
        return modelFormat;
    }

    public DescribeModelVersionResponse setModelFormat(String modelFormat) {
        this.modelFormat = modelFormat;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeModelVersionResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DescribeModelVersionResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DescribeModelVersionResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public DescribeModelVersionResponse setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public DescribeModelVersionResponse setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public DescribeModelVersionResponse setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public ModelVersionEntry getVersionEntry() {
        return versionEntry;
    }

    public DescribeModelVersionResponse setVersionEntry(ModelVersionEntry versionEntry) {
        this.versionEntry = versionEntry;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeModelVersionResponse{" + "name=" + name + "\n" + "id=" + id + "\n" + "initSource=" + initSource + "\n" + "modelFormat=" + modelFormat + "\n"
                + "description=" + description + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName
                + "\n" + "visibilityScope=" + visibilityScope + "\n" + "versionEntry=" + versionEntry + "\n" + "}";
    }

}
