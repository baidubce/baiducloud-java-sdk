package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file >
    * ofd_file，当image字段存在时，url、pdf_file、ofd_file字段失效。
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。
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
    * 是否定位单字符位置，默认不定位。可选值包括：big：不定位单字符位置；small：定位单字符位置，可返回单字符候选字及置信度
    */
    @JsonProperty("recognize_granularity")
    private String recognizeGranularity;

    /**
    * 是否将识别到的英文单词拆分为字母进行输出，默认拆为字母。可选值包括：<br/>letter：将单词拆分为字母进行输出word：保留单词整体输出
    */
    @JsonProperty("eng_granularity")
    private String engGranularity;

    /**
    * 是否返回识别结果中每一行的置信度，默认为false，不返回置信度
    */
    private Boolean probability;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否检测涂改痕迹，适用于手写作文场景，默认不检测，可选值包括：true：检测，涂改痕迹部分用「☰」返回；false：不检测
    */
    @JsonProperty("detect_alteration")
    private Boolean detectAlteration;

    /**
    * 识别语言类型，默认为
    * CHN_ENG。可选值包括：auto_detect：自动检测语言，并识别；CHN_ENG：中英文混合；ENG：英文；JAP：日语；KOR：韩语；FRE：法语；SPA：西班牙语；POR：葡萄牙语；GER：德语；ITA：意大利语；RUS：俄语；DAN：丹麦语；DUT：荷兰语；MAL：马来语；SWE：瑞典语；IND：印尼语；POL：波兰语；ROM：
    * 罗马尼亚语；TUR：土耳其语；GRE：希腊语；HUN：匈牙利语；THA：泰语；VIE：越南语；ARA：阿拉伯语；HIN：印地语
    */
    @JsonProperty("language_type")
    private String languageType;

    public String getImage() {
        return image;
    }

    public HandwritingRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public HandwritingRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public HandwritingRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public HandwritingRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public HandwritingRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public HandwritingRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getRecognizeGranularity() {
        return recognizeGranularity;
    }

    public HandwritingRequest setRecognizeGranularity(String recognizeGranularity) {
        this.recognizeGranularity = recognizeGranularity;
        return this;
    }

    public String getEngGranularity() {
        return engGranularity;
    }

    public HandwritingRequest setEngGranularity(String engGranularity) {
        this.engGranularity = engGranularity;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public HandwritingRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public HandwritingRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getDetectAlteration() {
        return detectAlteration;
    }

    public HandwritingRequest setDetectAlteration(Boolean detectAlteration) {
        this.detectAlteration = detectAlteration;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public HandwritingRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

}
