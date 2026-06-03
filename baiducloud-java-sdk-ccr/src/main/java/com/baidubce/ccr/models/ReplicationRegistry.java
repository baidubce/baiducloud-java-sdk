package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationRegistry {
    /**
     * Registry 创建时间
     */
    private String creationTime;

    /**
     * credential
     */
    private RegistryCredential credential;

    /**
     * Registry 描述
     */
    private String description;

    /**
     * Registry ID
     */
    private Integer id;

    /**
     * 当 Harbor 尝试访问服务器时，是否验证证书
     */
    private Boolean insecure;

    /**
     * Registry 名称
     */
    private String name;

    /**
     * Registry 健康状态
     */
    private String status;

    /**
     * Registry 类型，可选值：`docker-hub`、`docker-registry`、`harbor`
     */
    private String type;

    /**
     * Registry 更新时间
     */
    private String updateTime;

    /**
     * Registry 地址
     */
    private String url;

    /**
     * Registry 所在地区
     */
    private String region;

    public ReplicationRegistry setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public ReplicationRegistry setCredential(RegistryCredential credential) {
        this.credential = credential;
        return this;
    }

    public RegistryCredential getCredential() {
        return this.credential;
    }

    public ReplicationRegistry setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ReplicationRegistry setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public ReplicationRegistry setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }

    public Boolean getInsecure() {
        return this.insecure;
    }

    public ReplicationRegistry setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ReplicationRegistry setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ReplicationRegistry setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ReplicationRegistry setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ReplicationRegistry setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public ReplicationRegistry setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return "ReplicationRegistry{" + "creationTime=" + creationTime + "\n" + "credential=" + credential + "\n" + "description=" + description + "\n" + "id=" + id + "\n"
                + "insecure=" + insecure + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "type=" + type + "\n" + "updateTime=" + updateTime + "\n" + "url=" + url
                + "\n" + "region=" + region + "\n" + "}";
    }

}