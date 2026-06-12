package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelVersionEntry {
    /**
     * 模型版本ID。新建版本时，无需指定ID。
     */
    private String id;

    /**
     * 版本号。新建版本时，无需指定版本号。
     */
    private String version;

    /**
     * 该版本模型的来源UserUpload：用户上传
     */
    private String source;

    /**
     * 模型存储的BOS桶
     */
    private String storageBucket;

    /**
     * BOS桶中的存储路径
     */
    private String storagePath;

    /**
     * 
     */
    private String modelMetrics;

    /**
     * 版本描述
     */
    private String description;

    public ModelVersionEntry setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ModelVersionEntry setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    public ModelVersionEntry setSource(String source) {
        this.source = source;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public ModelVersionEntry setStorageBucket(String storageBucket) {
        this.storageBucket = storageBucket;
        return this;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public ModelVersionEntry setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getStoragePath() {
        return this.storagePath;
    }

    public ModelVersionEntry setModelMetrics(String modelMetrics) {
        this.modelMetrics = modelMetrics;
        return this;
    }

    public String getModelMetrics() {
        return this.modelMetrics;
    }

    public ModelVersionEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "ModelVersionEntry{" + "id=" + id + "\n" + "version=" + version + "\n" + "source=" + source + "\n" + "storageBucket=" + storageBucket + "\n" + "storagePath="
                + storagePath + "\n" + "modelMetrics=" + modelMetrics + "\n" + "description=" + description + "\n" + "}";
    }

}