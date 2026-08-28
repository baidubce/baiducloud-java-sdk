package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px。<br/>优先级：image > url > pdf_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当pdf_file参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第1页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * 识别语言类型，默认为CHN_ENG。可选值包括：<br/>- CHN_ENG：中英文；- ENG：英文，纯英文场景下建议开启
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括：<br/>- true：检测朝向，输入非正向图片时建议开启；- false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 识别文字类型，默认为手写印刷混排识别，即：handprint_mix。可选值包括：<br/>- handprint_mix：手写印刷混排；- handwring_only：手写，纯手写场景下建议开启
    */
    @JsonProperty("words_type")
    private String wordsType;

    /**
    * 是否拼接题目元素内每行的文本信息后输出，默认不拼接，即：false。开启该参数后，处理耗时预计会增加1s。可选值包括：<br/>- true：拼接题目元素每行的文本信息，在elem_text内输出；- false：不拼接，仅按行输出文本信息
    */
    @JsonProperty("splice_text")
    private Boolean spliceText;

    /**
    * 是否打开图像矫正与增强，默认不打开，即：false。可选值包括：<br/>- true：开启；- false：不开启
    */
    private Boolean enhance;

    /**
    * 是否仅进行题目切分，默认不打开，即：false。可选值包括：<br/>- true：开启；- false：不开启
    */
    @JsonProperty("only_split")
    private Boolean onlySplit;

    public String getImage() {
        return image;
    }

    public PaperCutEduRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PaperCutEduRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public PaperCutEduRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public PaperCutEduRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public PaperCutEduRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public PaperCutEduRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public String getWordsType() {
        return wordsType;
    }

    public PaperCutEduRequest setWordsType(String wordsType) {
        this.wordsType = wordsType;
        return this;
    }

    public Boolean getSpliceText() {
        return spliceText;
    }

    public PaperCutEduRequest setSpliceText(Boolean spliceText) {
        this.spliceText = spliceText;
        return this;
    }

    public Boolean getEnhance() {
        return enhance;
    }

    public PaperCutEduRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }

    public Boolean getOnlySplit() {
        return onlySplit;
    }

    public PaperCutEduRequest setOnlySplit(Boolean onlySplit) {
        this.onlySplit = onlySplit;
        return this;
    }

}
