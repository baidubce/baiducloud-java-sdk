package com.baidubce.scs.models;

import java.lang.String;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CacheClusterNode {
    /**
     * 分片实例ID
     */
    private String instanceId;

    /**
     * 分片规格（GB）
     */
    private String flavorInGB;

    /**
     * 分片名称
     */
    private String hashName;

    /**
     * 社区版集群中独有，绑定了本分片主的IP的域名
     */
    private String domain;

    /**
     * 创建时间（格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC）
     */
    private String createTime;

    /**
     * 分片ID
     */
    private String shardId;

    public CacheClusterNode setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public CacheClusterNode setFlavorInGB(String flavorInGB) {
        this.flavorInGB = flavorInGB;
        return this;
    }

    public String getFlavorInGB() {
        return this.flavorInGB;
    }

    public CacheClusterNode setHashName(String hashName) {
        this.hashName = hashName;
        return this;
    }

    public String getHashName() {
        return this.hashName;
    }

    public CacheClusterNode setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getDomain() {
        return this.domain;
    }

    public CacheClusterNode setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public CacheClusterNode setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    public String getShardId() {
        return this.shardId;
    }

    @Override
    public String toString() {
        return "CacheClusterNode{" + "instanceId=" + instanceId + "\n" + "flavorInGB=" + flavorInGB + "\n" + "hashName=" + hashName + "\n" + "domain=" + domain + "\n"
                + "createTime=" + createTime + "\n" + "shardId=" + shardId + "\n" + "}";
    }

}