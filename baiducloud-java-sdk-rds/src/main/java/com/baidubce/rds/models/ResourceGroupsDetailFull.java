package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceGroupsDetailFull {
    /**
     * 集合ResourceInfo列表。
     */
    private List<ResourceInfo> groups;

    /**
     * 资源名称。
     */
    private String name;

    /**
     * 资源类型（产品类型）默认为RDS。
     */
    private String type;

    /**
     * 资源所属区域。
     */
    private String region;

    /**
     * 资源短 ID。
     */
    private String id;

    /**
     * 资源长 ID。
     */
    private String uuid;

    /**
     * 日志。
     */
    private String summary;

    /**
     * URL。
     */
    private String url;

    /**
     * 账户ID。
     */
    private String accountId;

    /**
     * 用户ID。
     */
    private String userId;

    /**
     * 分组标签。
     */
    private List<Tag> tags;

    /**
     * 资源记录ID。
     */
    private String resUuid;

    public ResourceGroupsDetailFull setGroups(List<ResourceInfo> groups) {
        this.groups = groups;
        return this;
    }

    public List<ResourceInfo> getGroups() {
        return this.groups;
    }

    public ResourceGroupsDetailFull setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ResourceGroupsDetailFull setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ResourceGroupsDetailFull setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public ResourceGroupsDetailFull setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ResourceGroupsDetailFull setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public ResourceGroupsDetailFull setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getSummary() {
        return this.summary;
    }

    public ResourceGroupsDetailFull setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public ResourceGroupsDetailFull setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ResourceGroupsDetailFull setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return this.userId;
    }

    public ResourceGroupsDetailFull setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public ResourceGroupsDetailFull setResUuid(String resUuid) {
        this.resUuid = resUuid;
        return this;
    }

    public String getResUuid() {
        return this.resUuid;
    }

    @Override
    public String toString() {
        return "ResourceGroupsDetailFull{" + "groups=" + groups + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "region=" + region + "\n" + "id=" + id + "\n" + "uuid="
                + uuid + "\n" + "summary=" + summary + "\n" + "url=" + url + "\n" + "accountId=" + accountId + "\n" + "userId=" + userId + "\n" + "tags=" + tags + "\n"
                + "resUuid=" + resUuid + "\n" + "}";
    }

}