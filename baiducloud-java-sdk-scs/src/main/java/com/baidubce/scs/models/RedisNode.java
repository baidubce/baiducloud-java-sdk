package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RedisNode {
    /**
     * 节点UUID
     */
    private String uuid;

    /**
     * 节点展示ID
     */
    private String nodeShowId;

    /**
     * 实例类型：0 proxy代理、2 redis从、3 redis主（还有1、4、5，主要关注 0/2/3）
     */
    private Integer cacheInstanceType;

    /**
     * 是否只读实例：0 不是，1 是
     */
    private Integer isReadOnly;

    /**
     * 是否在只读组中：0 不在，1 在
     */
    private Integer inGroup;

    /**
     * 可用区
     */
    private String availabilityZone;

    /**
     * 子网短ID
     */
    private String subnetId;

    /**
     * 节点在只读组中状态：0 NO_OPERATION、1 CREATING、2 AVAILABLE、3 CREATE_FAIL、4 DELETING、5 DELETED、6 UPDATING
     */
    private Integer status;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 分片名称
     */
    private String hashName;

    /**
     * 分片ID
     */
    private Integer shardId;

    /**
     * 节点ID
     */
    private Integer nodeId;

    public RedisNode setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return this.uuid;
    }

    public RedisNode setNodeShowId(String nodeShowId) {
        this.nodeShowId = nodeShowId;
        return this;
    }

    public String getNodeShowId() {
        return this.nodeShowId;
    }

    public RedisNode setCacheInstanceType(Integer cacheInstanceType) {
        this.cacheInstanceType = cacheInstanceType;
        return this;
    }

    public Integer getCacheInstanceType() {
        return this.cacheInstanceType;
    }

    public RedisNode setIsReadOnly(Integer isReadOnly) {
        this.isReadOnly = isReadOnly;
        return this;
    }

    public Integer getIsReadOnly() {
        return this.isReadOnly;
    }

    public RedisNode setInGroup(Integer inGroup) {
        this.inGroup = inGroup;
        return this;
    }

    public Integer getInGroup() {
        return this.inGroup;
    }

    public RedisNode setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    public RedisNode setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public RedisNode setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public RedisNode setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public RedisNode setHashName(String hashName) {
        this.hashName = hashName;
        return this;
    }

    public String getHashName() {
        return this.hashName;
    }

    public RedisNode setShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }

    public Integer getShardId() {
        return this.shardId;
    }

    public RedisNode setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public Integer getNodeId() {
        return this.nodeId;
    }

    @Override
    public String toString() {
        return "RedisNode{" + "uuid=" + uuid + "\n" + "nodeShowId=" + nodeShowId + "\n" + "cacheInstanceType=" + cacheInstanceType + "\n" + "isReadOnly=" + isReadOnly + "\n"
                + "inGroup=" + inGroup + "\n" + "availabilityZone=" + availabilityZone + "\n" + "subnetId=" + subnetId + "\n" + "status=" + status + "\n" + "weight=" + weight
                + "\n" + "hashName=" + hashName + "\n" + "shardId=" + shardId + "\n" + "nodeId=" + nodeId + "\n" + "}";
    }

}