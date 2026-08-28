package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebImageLocRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否返回每行识别结果的置信度。默认为false
    */
    private Boolean probability;

    /**
    * 是否返回文字所在区域的外接四边形的4个点坐标信息。默认为false
    */
    @JsonProperty("poly_location")
    private Boolean polyLocation;

    /**
    * 是否定位单字符位置，big：不定位单字符位置，默认值；small：定位单字符位置
    */
    @JsonProperty("recognize_granularity")
    private String recognizeGranularity;

    public String getImage() {
        return image;
    }

    public WebImageLocRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WebImageLocRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public WebImageLocRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public WebImageLocRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public WebImageLocRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public WebImageLocRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public WebImageLocRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public WebImageLocRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public Boolean getPolyLocation() {
        return polyLocation;
    }

    public WebImageLocRequest setPolyLocation(Boolean polyLocation) {
        this.polyLocation = polyLocation;
        return this;
    }

    public String getRecognizeGranularity() {
        return recognizeGranularity;
    }

    public WebImageLocRequest setRecognizeGranularity(String recognizeGranularity) {
        this.recognizeGranularity = recognizeGranularity;
        return this;
    }

}
