package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MongodbDatabaseSpaceItem {
    /**
     * 数据库名称
     */
    private String database;

    /**
     * 集合数量
     */
    private Integer collectionCount;

    /**
     * 存储空间（字节），分配给空间用于存储文档的空间总和，包括可用空间
     */
    private Long storageSize;

    /**
     * 数据空间（字节），保存的未压缩数据的总大小，当删除文档时会减小
     */
    private Long dataSize;

    /**
     * 索引空间（字节），分配给所有索引的空间总和，包括可用索引空间
     */
    private Long indexSize;

    /**
     * 文档数量，对象（文档）数量
     */
    private Long objectCount;

    /**
     * 索引数量，索引总数
     */
    private Integer indexCount;

    /**
     * 平均文档大小（字节），即dataSize/objects
     */
    private Long avgObjSize;

    /**
     * 视图数量，视图的数量
     */
    private Integer views;

    /**
     * 碎片率，可回收空间/总空间
     */
    private Double fragmentationRatio;

    /**
     * 索引碎片率，索引空闲空间/索引空间
     */
    private Double indexFragmentationRatio;

    /**
     * 总空间（字节）， 存储大小和索引大小之和
     */
    private Long totalSize;

    /**
     * 文档空闲空间（字节），分配给空间用于存储文档的可用空间总和
     */
    private Long freeStorageSize;

    /**
     * 索引空闲空间（字节），分配给所有索引的可用空间总和
     */
    private Long indexFreeStorageSize;

    /**
     * 总空闲空间（字节），文档空闲空间和索引空闲空间之和
     */
    private Long totalFreeStorageSize;

    public MongodbDatabaseSpaceItem setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getDatabase() {
        return this.database;
    }

    public MongodbDatabaseSpaceItem setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
        return this;
    }

    public Integer getCollectionCount() {
        return this.collectionCount;
    }

    public MongodbDatabaseSpaceItem setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public MongodbDatabaseSpaceItem setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public MongodbDatabaseSpaceItem setIndexSize(Long indexSize) {
        this.indexSize = indexSize;
        return this;
    }

    public Long getIndexSize() {
        return this.indexSize;
    }

    public MongodbDatabaseSpaceItem setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    public Long getObjectCount() {
        return this.objectCount;
    }

    public MongodbDatabaseSpaceItem setIndexCount(Integer indexCount) {
        this.indexCount = indexCount;
        return this;
    }

    public Integer getIndexCount() {
        return this.indexCount;
    }

    public MongodbDatabaseSpaceItem setAvgObjSize(Long avgObjSize) {
        this.avgObjSize = avgObjSize;
        return this;
    }

    public Long getAvgObjSize() {
        return this.avgObjSize;
    }

    public MongodbDatabaseSpaceItem setViews(Integer views) {
        this.views = views;
        return this;
    }

    public Integer getViews() {
        return this.views;
    }

    public MongodbDatabaseSpaceItem setFragmentationRatio(Double fragmentationRatio) {
        this.fragmentationRatio = fragmentationRatio;
        return this;
    }

    public Double getFragmentationRatio() {
        return this.fragmentationRatio;
    }

    public MongodbDatabaseSpaceItem setIndexFragmentationRatio(Double indexFragmentationRatio) {
        this.indexFragmentationRatio = indexFragmentationRatio;
        return this;
    }

    public Double getIndexFragmentationRatio() {
        return this.indexFragmentationRatio;
    }

    public MongodbDatabaseSpaceItem setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

    public MongodbDatabaseSpaceItem setFreeStorageSize(Long freeStorageSize) {
        this.freeStorageSize = freeStorageSize;
        return this;
    }

    public Long getFreeStorageSize() {
        return this.freeStorageSize;
    }

    public MongodbDatabaseSpaceItem setIndexFreeStorageSize(Long indexFreeStorageSize) {
        this.indexFreeStorageSize = indexFreeStorageSize;
        return this;
    }

    public Long getIndexFreeStorageSize() {
        return this.indexFreeStorageSize;
    }

    public MongodbDatabaseSpaceItem setTotalFreeStorageSize(Long totalFreeStorageSize) {
        this.totalFreeStorageSize = totalFreeStorageSize;
        return this;
    }

    public Long getTotalFreeStorageSize() {
        return this.totalFreeStorageSize;
    }

    @Override
    public String toString() {
        return "MongodbDatabaseSpaceItem{" + "database=" + database + "\n" + "collectionCount=" + collectionCount + "\n" + "storageSize=" + storageSize + "\n" + "dataSize="
                + dataSize + "\n" + "indexSize=" + indexSize + "\n" + "objectCount=" + objectCount + "\n" + "indexCount=" + indexCount + "\n" + "avgObjSize=" + avgObjSize + "\n"
                + "views=" + views + "\n" + "fragmentationRatio=" + fragmentationRatio + "\n" + "indexFragmentationRatio=" + indexFragmentationRatio + "\n" + "totalSize="
                + totalSize + "\n" + "freeStorageSize=" + freeStorageSize + "\n" + "indexFreeStorageSize=" + indexFreeStorageSize + "\n" + "totalFreeStorageSize="
                + totalFreeStorageSize + "\n" + "}";
    }

}