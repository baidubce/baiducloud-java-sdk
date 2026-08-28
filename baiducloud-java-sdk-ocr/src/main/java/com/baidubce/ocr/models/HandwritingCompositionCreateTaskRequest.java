package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingCompositionCreateTaskRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大4096px。优先级：image > url > pdf_file
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 识别粒度，控制坐标返回。line：行级坐标返回；word：行级坐标+字级别坐标返回；none：不返回坐标
    */
    @JsonProperty("recognize_granularity")
    private String recognizeGranularity;

    /**
    * 需要识别的PDF文件的对应页码，默认识别第1页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    public String getImage() {
        return image;
    }

    public HandwritingCompositionCreateTaskRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public HandwritingCompositionCreateTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public HandwritingCompositionCreateTaskRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public String getRecognizeGranularity() {
        return recognizeGranularity;
    }

    public HandwritingCompositionCreateTaskRequest setRecognizeGranularity(String recognizeGranularity) {
        this.recognizeGranularity = recognizeGranularity;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public HandwritingCompositionCreateTaskRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

}
