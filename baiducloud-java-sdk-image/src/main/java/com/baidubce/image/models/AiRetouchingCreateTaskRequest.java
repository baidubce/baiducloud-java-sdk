package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AiRetouchingCreateTaskRequest extends BaseBceRequest {

    /**
    * image
    */
    private String image;

    /**
    * url
    */
    private String url;

    /**
    * 回调透传参数
    */
    @JsonProperty("callback_data")
    private String callbackData;

    /**
    * icolorParams
    */
    @JsonProperty("IColorParams")
    private IColorParams icolorParams;

    /**
    * allHumanOptions
    */
    @JsonProperty("AllHumanOptions")
    private AllHumanOptions allHumanOptions;

    /**
    * partialHumanOptions
    */
    @JsonProperty("PartialHumanOptions")
    private PartialHumanOptions partialHumanOptions;

    /**
    * partialTemplates
    */
    @JsonProperty("PartialTemplates")
    private PartialTemplates partialTemplates;

    /**
    * transformOptions
    */
    @JsonProperty("transform_options")
    private TransformOptions transformOptions;

    public String getImage() {
        return image;
    }

    public AiRetouchingCreateTaskRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AiRetouchingCreateTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public AiRetouchingCreateTaskRequest setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public IColorParams getIcolorParams() {
        return icolorParams;
    }

    public AiRetouchingCreateTaskRequest setIcolorParams(IColorParams icolorParams) {
        this.icolorParams = icolorParams;
        return this;
    }

    public AllHumanOptions getAllHumanOptions() {
        return allHumanOptions;
    }

    public AiRetouchingCreateTaskRequest setAllHumanOptions(AllHumanOptions allHumanOptions) {
        this.allHumanOptions = allHumanOptions;
        return this;
    }

    public PartialHumanOptions getPartialHumanOptions() {
        return partialHumanOptions;
    }

    public AiRetouchingCreateTaskRequest setPartialHumanOptions(PartialHumanOptions partialHumanOptions) {
        this.partialHumanOptions = partialHumanOptions;
        return this;
    }

    public PartialTemplates getPartialTemplates() {
        return partialTemplates;
    }

    public AiRetouchingCreateTaskRequest setPartialTemplates(PartialTemplates partialTemplates) {
        this.partialTemplates = partialTemplates;
        return this;
    }

    public TransformOptions getTransformOptions() {
        return transformOptions;
    }

    public AiRetouchingCreateTaskRequest setTransformOptions(TransformOptions transformOptions) {
        this.transformOptions = transformOptions;
        return this;
    }

}
