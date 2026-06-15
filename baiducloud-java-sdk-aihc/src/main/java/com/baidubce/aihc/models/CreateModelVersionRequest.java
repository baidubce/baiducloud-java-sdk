package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModelVersionRequest extends BaseBceRequest {

    /**
    * modelId
    */
    @JsonIgnore
    private String modelId;

    /**
    * 模型存储的BOS桶
    */
    private String storageBucket;

    /**
    * BOS桶中的存储路径
    */
    private String storagePath;

    /**
    * 描述
    */
    private String description;

    /**
    * 该版本模型的来源UserUpload：用户上传
    */
    private String source;

    /**
    * 模型指标，JSON格式。格式如下，其中 Metrics、Dataset 中的内容用户可自定义填写：{"Results":[{"Metrics":{"loss":2.13,"lr":0.0005},"Dataset":{"DatasetId":"ds-xxx"}}]}
    */
    private String modelMetrics;

    public String getModelId() {
        return modelId;
    }

    public CreateModelVersionRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    public String getStorageBucket() {
        return storageBucket;
    }

    public CreateModelVersionRequest setStorageBucket(String storageBucket) {
        this.storageBucket = storageBucket;
        return this;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public CreateModelVersionRequest setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateModelVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSource() {
        return source;
    }

    public CreateModelVersionRequest setSource(String source) {
        this.source = source;
        return this;
    }

    public String getModelMetrics() {
        return modelMetrics;
    }

    public CreateModelVersionRequest setModelMetrics(String modelMetrics) {
        this.modelMetrics = modelMetrics;
        return this;
    }

}
