package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MongodbCollectionSpaceItem {
    /**
     * 数据库名称
     */
    private String database;

    /**
     * 集合名称
     */
    private String collection;

    /**
     * 存储空间（字节），分配给空间用于存储文档的空间总和，包括可用空间
     */
    private Long storageSize;

    /**
     * 数据空间（字节），保存的未压缩数据的总大小
     */
    private Long dataSize;

    /**
     * 索引空间（字节），分配给所有索引的空间总和，包括可用索引空间
     */
    private Long indexSize;

    /**
     * 文档数量
     */
    private Long objectCount;

    /**
     * 索引数量
     */
    private Integer indexCount;

    /**
     * 平均文档大小（字节）
     */
    private Long avgObjSize;

    /**
     * 视图数量
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
     * 总空间（字节），存储空间、索引空间之和
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
     * 总空闲空间（字节），文档空闲空间、索引空闲空间之和
     */
    private Long totalFreeStorageSize;

    public MongodbCollectionSpaceItem setDatabase(String database) {
        this.database = database;
        return this;
    }

    public String getDatabase() {
        return this.database;
    }

    public MongodbCollectionSpaceItem setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    public String getCollection() {
        return this.collection;
    }

    public MongodbCollectionSpaceItem setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public MongodbCollectionSpaceItem setDataSize(Long dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public MongodbCollectionSpaceItem setIndexSize(Long indexSize) {
        this.indexSize = indexSize;
        return this;
    }

    public Long getIndexSize() {
        return this.indexSize;
    }

    public MongodbCollectionSpaceItem setObjectCount(Long objectCount) {
        this.objectCount = objectCount;
        return this;
    }

    public Long getObjectCount() {
        return this.objectCount;
    }

    public MongodbCollectionSpaceItem setIndexCount(Integer indexCount) {
        this.indexCount = indexCount;
        return this;
    }

    public Integer getIndexCount() {
        return this.indexCount;
    }

    public MongodbCollectionSpaceItem setAvgObjSize(Long avgObjSize) {
        this.avgObjSize = avgObjSize;
        return this;
    }

    public Long getAvgObjSize() {
        return this.avgObjSize;
    }

    public MongodbCollectionSpaceItem setViews(Integer views) {
        this.views = views;
        return this;
    }

    public Integer getViews() {
        return this.views;
    }

    public MongodbCollectionSpaceItem setFragmentationRatio(Double fragmentationRatio) {
        this.fragmentationRatio = fragmentationRatio;
        return this;
    }

    public Double getFragmentationRatio() {
        return this.fragmentationRatio;
    }

    public MongodbCollectionSpaceItem setIndexFragmentationRatio(Double indexFragmentationRatio) {
        this.indexFragmentationRatio = indexFragmentationRatio;
        return this;
    }

    public Double getIndexFragmentationRatio() {
        return this.indexFragmentationRatio;
    }

    public MongodbCollectionSpaceItem setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    public Long getTotalSize() {
        return this.totalSize;
    }

    public MongodbCollectionSpaceItem setFreeStorageSize(Long freeStorageSize) {
        this.freeStorageSize = freeStorageSize;
        return this;
    }

    public Long getFreeStorageSize() {
        return this.freeStorageSize;
    }

    public MongodbCollectionSpaceItem setIndexFreeStorageSize(Long indexFreeStorageSize) {
        this.indexFreeStorageSize = indexFreeStorageSize;
        return this;
    }

    public Long getIndexFreeStorageSize() {
        return this.indexFreeStorageSize;
    }

    public MongodbCollectionSpaceItem setTotalFreeStorageSize(Long totalFreeStorageSize) {
        this.totalFreeStorageSize = totalFreeStorageSize;
        return this;
    }

    public Long getTotalFreeStorageSize() {
        return this.totalFreeStorageSize;
    }

    @Override
    public String toString() {
        return "MongodbCollectionSpaceItem{" + "database=" + database + "\n" + "collection=" + collection + "\n" + "storageSize=" + storageSize + "\n" + "dataSize=" + dataSize
                + "\n" + "indexSize=" + indexSize + "\n" + "objectCount=" + objectCount + "\n" + "indexCount=" + indexCount + "\n" + "avgObjSize=" + avgObjSize + "\n" + "views="
                + views + "\n" + "fragmentationRatio=" + fragmentationRatio + "\n" + "indexFragmentationRatio=" + indexFragmentationRatio + "\n" + "totalSize=" + totalSize + "\n"
                + "freeStorageSize=" + freeStorageSize + "\n" + "indexFreeStorageSize=" + indexFreeStorageSize + "\n" + "totalFreeStorageSize=" + totalFreeStorageSize + "\n"
                + "}";
    }

}