package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumbersRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file，当image字段存在时，url、pdf_file、ofd_file
    * 字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。优先级：image > url > pdf_file > ofd_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。优先级：image > url > pdf_file > ofd_file，当image、url、pdf_file字段存在时，ofd_file字段失效
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 是否定位单字符位置，big：不定位单字符位置，默认值；small：定位单字符位置
    */
    @JsonProperty("recognize_granularity")
    private String recognizeGranularity;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    public String getImage() {
        return image;
    }

    public NumbersRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public NumbersRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public NumbersRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public NumbersRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public NumbersRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public NumbersRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getRecognizeGranularity() {
        return recognizeGranularity;
    }

    public NumbersRequest setRecognizeGranularity(String recognizeGranularity) {
        this.recognizeGranularity = recognizeGranularity;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public NumbersRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

}
