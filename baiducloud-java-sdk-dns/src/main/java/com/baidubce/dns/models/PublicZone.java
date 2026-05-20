package com.baidubce.dns.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublicZone {
    /**
     * zone的id。
     */
    private String id;

    /**
     * 域名名称。
     */
    private String name;

    /**
     * 域名状态，包含：正常(running)、未被注册(unregister)、NS尚未修改(nsunchange)、服务异常(failed)、未备案(torenew)。
     */
    private String status;

    /**
     * 产品版本，包含：基础版(free)、普惠版(discount)、企业版(flagship)。
     */
    private String productVersion;

    /**
     * 创建时间(北京时间)，比如：“2022-04-28 17:05:45”。
     */
    private String createTime;

    /**
     * 到期时间(北京时间)，比如：“2023-04-28 17:05:44”。
     */
    private String expireTime;

    /**
     * 标签键值对列表。
     */
    private List<TagModel> tags;

    public PublicZone setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PublicZone setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public PublicZone setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public PublicZone setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public PublicZone setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public PublicZone setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public PublicZone setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "PublicZone{" + "id=" + id + "\n" + "name=" + name + "\n" + "status=" + status + "\n" + "productVersion=" + productVersion + "\n" + "createTime=" + createTime
                + "\n" + "expireTime=" + expireTime + "\n" + "tags=" + tags + "\n" + "}";
    }

}