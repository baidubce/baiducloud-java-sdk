package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterModel {
    /**
     * 集群id
     */
    private String id;

    /**
     * 集群名称
     */
    private String name;

    /**
     * 集群类型
     */
    private String type;

    /**
     * 集群状态
     */
    private String status;

    /**
     * 集群性能容量
     */
    private Integer ccuCount;

    /**
     * 集群创建时间
     */
    private String createTime;

    /**
     * 集群失效时间
     */
    private String expireTime;

    /**
     * 描述
     */
    private String desc;

    public ClusterModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ClusterModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ClusterModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ClusterModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ClusterModel setCcuCount(Integer ccuCount) {
        this.ccuCount = ccuCount;
        return this;
    }

    public Integer getCcuCount() {
        return this.ccuCount;
    }

    public ClusterModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ClusterModel setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public ClusterModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "ClusterModel{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "status=" + status + "\n" + "ccuCount=" + ccuCount + "\n" + "createTime="
                + createTime + "\n" + "expireTime=" + expireTime + "\n" + "desc=" + desc + "\n" + "}";
    }

}