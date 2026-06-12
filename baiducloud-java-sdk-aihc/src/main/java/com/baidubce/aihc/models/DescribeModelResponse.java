package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeModelResponse extends BaseBceResponse {

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
    * 创建时间
    */
    private String createdAt;

    /**
    * 更新时间
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

    public DescribeModelResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public DescribeModelResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getInitSource() {
        return initSource;
    }

    public DescribeModelResponse setInitSource(String initSource) {
        this.initSource = initSource;
        return this;
    }

    public String getModelFormat() {
        return modelFormat;
    }

    public DescribeModelResponse setModelFormat(String modelFormat) {
        this.modelFormat = modelFormat;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeModelResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DescribeModelResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DescribeModelResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public DescribeModelResponse setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public DescribeModelResponse setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public DescribeModelResponse setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public ModelVersionEntry getVersionEntry() {
        return versionEntry;
    }

    public DescribeModelResponse setVersionEntry(ModelVersionEntry versionEntry) {
        this.versionEntry = versionEntry;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeModelResponse{" + "name=" + name + "\n" + "id=" + id + "\n" + "initSource=" + initSource + "\n" + "modelFormat=" + modelFormat + "\n" + "description="
                + description + "\n" + "createdAt=" + createdAt + "\n" + "updatedAt=" + updatedAt + "\n" + "owner=" + owner + "\n" + "ownerName=" + ownerName + "\n"
                + "visibilityScope=" + visibilityScope + "\n" + "versionEntry=" + versionEntry + "\n" + "}";
    }

}
