package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageResult {
    /**
     * 图片id
     */
    private String imageId;

    /**
     * 实际请求的图片可能会经过压缩与矫正，此为处理后的图片url
     */
    private String imageUrl;

    /**
     * 
     */
    private String paperSubject;

    /**
     * 原图预处理缩放比例，用于前端坐标还原
     */
    @JsonProperty("resize_ratio")
    private Double resizeRatio;

    /**
     * 单题批改结果
     */
    private List<QuestionResult> result;

    public ImageResult setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return this.imageId;
    }

    public ImageResult setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageResult setPaperSubject(String paperSubject) {
        this.paperSubject = paperSubject;
        return this;
    }

    public String getPaperSubject() {
        return this.paperSubject;
    }

    public ImageResult setResizeRatio(Double resizeRatio) {
        this.resizeRatio = resizeRatio;
        return this;
    }

    public Double getResizeRatio() {
        return this.resizeRatio;
    }

    public ImageResult setResult(List<QuestionResult> result) {
        this.result = result;
        return this;
    }

    public List<QuestionResult> getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "ImageResult{" + "imageId=" + imageId + "\n" + "imageUrl=" + imageUrl + "\n" + "paperSubject=" + paperSubject + "\n" + "resizeRatio=" + resizeRatio + "\n"
                + "result=" + result + "\n" + "}";
    }

}