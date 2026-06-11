package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelVersionEntry {
    /**
     * 否
     */
    private String id;

    /**
     * 否
     */
    private String version;

    /**
     * 是
     */
    private String source;

    /**
     * 是
     */
    private String storageBucket;

    /**
     * 是
     */
    private String storagePath;

    /**
     * 否
     */
    private String modelMetrics;

    /**
     * 否
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