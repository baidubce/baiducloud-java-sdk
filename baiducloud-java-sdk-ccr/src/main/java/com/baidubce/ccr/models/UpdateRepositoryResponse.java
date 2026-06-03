package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRepositoryResponse extends BaseBceResponse {

    /**
    * 命名空间名称
    */
    private String projectName;

    /**
    * 镜像仓库名称
    */
    private String repositoryName;

    /**
    * 镜像仓库描述
    */
    private String description;

    /**
    * 公网访问镜像路径
    */
    private String repositoryPath;

    /**
    * vpc 内访问镜像路径
    */
    private String privateRepositoryPath;

    /**
    * 镜像的Tag个数
    */
    private Integer tagCount;

    /**
    * 镜像拉取次数
    */
    private Integer pullCount;

    /**
    * 创建时间
    */
    private String creationTime;

    /**
    * 更新时间
    */
    private String updateTime;

    public String getProjectName() {
        return projectName;
    }

    public UpdateRepositoryResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public UpdateRepositoryResponse setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateRepositoryResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRepositoryPath() {
        return repositoryPath;
    }

    public UpdateRepositoryResponse setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
        return this;
    }

    public String getPrivateRepositoryPath() {
        return privateRepositoryPath;
    }

    public UpdateRepositoryResponse setPrivateRepositoryPath(String privateRepositoryPath) {
        this.privateRepositoryPath = privateRepositoryPath;
        return this;
    }

    public Integer getTagCount() {
        return tagCount;
    }

    public UpdateRepositoryResponse setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    public Integer getPullCount() {
        return pullCount;
    }

    public UpdateRepositoryResponse setPullCount(Integer pullCount) {
        this.pullCount = pullCount;
        return this;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public UpdateRepositoryResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public UpdateRepositoryResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateRepositoryResponse{" + "projectName=" + projectName + "\n" + "repositoryName=" + repositoryName + "\n" + "description=" + description + "\n"
                + "repositoryPath=" + repositoryPath + "\n" + "privateRepositoryPath=" + privateRepositoryPath + "\n" + "tagCount=" + tagCount + "\n" + "pullCount=" + pullCount
                + "\n" + "creationTime=" + creationTime + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
