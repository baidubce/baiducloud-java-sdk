package com.baidubce.ccr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instance {
    /**
     * 实例 ID
     */
    private String id;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 实例类型。<br>`BASIC`：基础版；`STANDARD`：标准版；`ADVANCED`：高级版
     */
    private String instanceType;

    /**
     * 公网访问地址
     */
    private String publicURL;

    /**
     * 内网访问地址
     */
    private String privateURL;

    /**
     * 自定义域名信息
     */
    private List<String> customDomains;

    /**
     * 地域
     */
    private String region;

    /**
     * 实例状态
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 到期时间
     */
    private String expireTime;

    /**
     * 标签键值对信息
     */
    private List<LogicalTag> tags;

    public Instance setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Instance setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Instance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public Instance setPublicURL(String publicURL) {
        this.publicURL = publicURL;
        return this;
    }

    public String getPublicURL() {
        return this.publicURL;
    }

    public Instance setPrivateURL(String privateURL) {
        this.privateURL = privateURL;
        return this;
    }

    public String getPrivateURL() {
        return this.privateURL;
    }

    public Instance setCustomDomains(List<String> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    public List<String> getCustomDomains() {
        return this.customDomains;
    }

    public Instance setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public Instance setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Instance setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public Instance setTags(List<LogicalTag> tags) {
        this.tags = tags;
        return this;
    }

    public List<LogicalTag> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Instance{" + "id=" + id + "\n" + "name=" + name + "\n" + "instanceType=" + instanceType + "\n" + "publicURL=" + publicURL + "\n" + "privateURL=" + privateURL
                + "\n" + "customDomains=" + customDomains + "\n" + "region=" + region + "\n" + "status=" + status + "\n" + "createTime=" + createTime + "\n" + "expireTime="
                + expireTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}