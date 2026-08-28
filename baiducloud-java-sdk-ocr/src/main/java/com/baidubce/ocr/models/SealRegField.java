package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SealRegField {
    /**
     * 识别内容
     */
    private String words;

    /**
     * 主字段展平图的 base64 编码，即章内上环弯曲文字切片后拼接图片，flatten_image=true 时返回
     */
    @JsonProperty("flatten_image")
    private String flattenImage;

    /**
     * 识别内容的置信度
     */
    private Double probability;

    public SealRegField setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public SealRegField setFlattenImage(String flattenImage) {
        this.flattenImage = flattenImage;
        return this;
    }

    public String getFlattenImage() {
        return this.flattenImage;
    }

    public SealRegField setProbability(Double probability) {
        this.probability = probability;
        return this;
    }

    public Double getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "SealRegField{" + "words=" + words + "\n" + "flattenImage=" + flattenImage + "\n" + "probability=" + probability + "\n" + "}";
    }

}