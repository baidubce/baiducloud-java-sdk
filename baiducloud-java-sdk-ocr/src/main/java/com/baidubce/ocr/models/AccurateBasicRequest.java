package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccurateBasicRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 识别语言类型，默认为CHN_ENG。可选值包括：auto_detect：自动检测语言，并识别；CHN_ENG：中英文混合；ENG：英文；JAP：日语；KOR：韩语；FRE：法语；SPA：西班牙语；POR：葡萄牙语；GER：德语；ITA：意大利语；RUS：俄语；DAN：丹麦语；DUT：荷兰语；MAL：马来语；SWE：瑞典语；IND：印尼语；POL：
    * 波兰语；ROM：罗马尼亚语；TUR：土耳其语；GRE：希腊语；HUN：匈牙利语；THA：泰语；VIE：越南语；ARA：阿拉伯语；HIN：印地语
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否输出段落信息
    */
    private Boolean paragraph;

    /**
    * 是否返回识别结果中每一行的置信度
    */
    private Boolean probability;

    /**
    * 是否开启行级别的多方向文字识别，可选值包括: true：识别；false：不识别。若图内有不同方向的文字时，建议将此参数设置为true
    */
    @JsonProperty("multidirectional_recognize")
    private Boolean multidirectionalRecognize;

    public String getImage() {
        return image;
    }

    public AccurateBasicRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AccurateBasicRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public AccurateBasicRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public AccurateBasicRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public AccurateBasicRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public AccurateBasicRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public AccurateBasicRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public AccurateBasicRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getParagraph() {
        return paragraph;
    }

    public AccurateBasicRequest setParagraph(Boolean paragraph) {
        this.paragraph = paragraph;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public AccurateBasicRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public Boolean getMultidirectionalRecognize() {
        return multidirectionalRecognize;
    }

    public AccurateBasicRequest setMultidirectionalRecognize(Boolean multidirectionalRecognize) {
        this.multidirectionalRecognize = multidirectionalRecognize;
        return this;
    }

}
