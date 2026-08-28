package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralBasicRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 识别语言类型，默认为CHN_ENG。可选值包括：CHN_ENG：中英文混合；ENG：英文；JAP：日语；KOR：韩语；FRE：法语；SPA：西班牙语；POR：葡萄牙语；GER：德语；ITA：意大利语；RUS：俄语
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否检测语言，默认不检测，即：false。当前支持中文、英语、日语、韩语
    */
    @JsonProperty("detect_language")
    private Boolean detectLanguage;

    /**
    * 是否输出段落信息
    */
    private Boolean paragraph;

    /**
    * 是否返回识别结果中每一行的置信度
    */
    private Boolean probability;

    public String getImage() {
        return image;
    }

    public GeneralBasicRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GeneralBasicRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public GeneralBasicRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public GeneralBasicRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public GeneralBasicRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public GeneralBasicRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public GeneralBasicRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public GeneralBasicRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getDetectLanguage() {
        return detectLanguage;
    }

    public GeneralBasicRequest setDetectLanguage(Boolean detectLanguage) {
        this.detectLanguage = detectLanguage;
        return this;
    }

    public Boolean getParagraph() {
        return paragraph;
    }

    public GeneralBasicRequest setParagraph(Boolean paragraph) {
        this.paragraph = paragraph;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public GeneralBasicRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

}
