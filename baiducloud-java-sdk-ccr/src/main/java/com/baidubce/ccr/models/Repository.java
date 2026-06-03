package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Repository {
    /**
     * 镜像的 Tag 个数
     */
    private Integer tagCount;

    /**
     * 创建时间
     */
    private String creationTime;

    /**
     * 镜像仓库描述
     */
    private String description;

    /**
     * 镜像仓库名称
     */
    private String repositoryName;

    /**
     * 镜像拉取次数
     */
    private Integer pullCount;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 公网访问镜像路径
     */
    private String repositoryPath;

    /**
     * VPC 内访问镜像路径
     */
    private String privateRepositoryPath;

    /**
     * 命名空间名称
     */
    private String projectName;

    public Repository setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    public Integer getTagCount() {
        return this.tagCount;
    }

    public Repository setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public Repository setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Repository setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getRepositoryName() {
        return this.repositoryName;
    }

    public Repository setPullCount(Integer pullCount) {
        this.pullCount = pullCount;
        return this;
    }

    public Integer getPullCount() {
        return this.pullCount;
    }

    public Repository setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Repository setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
        return this;
    }

    public String getRepositoryPath() {
        return this.repositoryPath;
    }

    public Repository setPrivateRepositoryPath(String privateRepositoryPath) {
        this.privateRepositoryPath = privateRepositoryPath;
        return this;
    }

    public String getPrivateRepositoryPath() {
        return this.privateRepositoryPath;
    }

    public Repository setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getProjectName() {
        return this.projectName;
    }

    @Override
    public String toString() {
        return "Repository{" + "tagCount=" + tagCount + "\n" + "creationTime=" + creationTime + "\n" + "description=" + description + "\n" + "repositoryName=" + repositoryName
                + "\n" + "pullCount=" + pullCount + "\n" + "updateTime=" + updateTime + "\n" + "repositoryPath=" + repositoryPath + "\n" + "privateRepositoryPath="
                + privateRepositoryPath + "\n" + "projectName=" + projectName + "\n" + "}";
    }

}