package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisRequest extends BaseBceRequest {

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
    * 识别语言类型，默认为CHN_ENG。可选值包括：<br/>CHN_ENG：中英文；ENG：英文
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 返回识别结果是按单行结果返回，还是按单字结果返回，默认为big。可选值包括：<br/>big：返回行识别结果；small：返回行识别结果之上还会返回单字结果
    */
    @JsonProperty("result_type")
    private String resultType;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。<br/>其中，0：正向；1：逆时针旋转90度；2：逆时针旋转180度；3：逆时针旋转270度
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否返回每行识别结果的置信度。默认为false
    */
    @JsonProperty("line_probability")
    private Boolean lineProbability;

    /**
    * 是否返回每行的四角点坐标。默认为false
    */
    @JsonProperty("disp_line_poly")
    private Boolean dispLinePoly;

    /**
    * 文字类型。默认：印刷文字识别。可选值包括：<br/>handwring_only：手写文字识别；handprint_mix：手写印刷混排识别
    */
    @JsonProperty("words_type")
    private String wordsType;

    /**
    * 是否分析文档版面：包括layout（图、表、标题、段落、目录）；attribute（栏、页眉、页脚、页码、脚注）的分析输出<br/>输出格式详见示例返回参数
    */
    @JsonProperty("layout_analysis")
    private Boolean layoutAnalysis;

    /**
    * 是否检测并识别公式，默认为false，公式以Latex格式文本返回。<br/>可选值包括：<br/>true：检测并识别公式；<br/>false：不检测识别公式
    */
    @JsonProperty("recg_formula")
    private Boolean recgFormula;

    /**
    * 是否检测并识别手写竖式，默认为false。可选值包括：<br/>true：检测并识别手写竖式；<br/>false：不检测手写竖式
    */
    @JsonProperty("recg_long_division")
    private Boolean recgLongDivision;

    /**
    * 是否开启下划线识别功能。可选值包括：<br/>true：开启，在返回参数underline内输出下划线信息；<br/>false：关闭，默认值，不输出下划线信息
    */
    @JsonProperty("disp_underline_analysis")
    private Boolean dispUnderlineAnalysis;

    /**
    * 是否开启返回涂改识别结果功能。可选值包括：<br/>true：开启检测，涂改部分统一用\"☰\"返回；<br/>false：关闭，默认值，不输出涂改识别结果
    */
    @JsonProperty("recg_alter")
    private Boolean recgAlter;

    public String getImage() {
        return image;
    }

    public DocAnalysisRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DocAnalysisRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public DocAnalysisRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public DocAnalysisRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public DocAnalysisRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public String getResultType() {
        return resultType;
    }

    public DocAnalysisRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public DocAnalysisRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getLineProbability() {
        return lineProbability;
    }

    public DocAnalysisRequest setLineProbability(Boolean lineProbability) {
        this.lineProbability = lineProbability;
        return this;
    }

    public Boolean getDispLinePoly() {
        return dispLinePoly;
    }

    public DocAnalysisRequest setDispLinePoly(Boolean dispLinePoly) {
        this.dispLinePoly = dispLinePoly;
        return this;
    }

    public String getWordsType() {
        return wordsType;
    }

    public DocAnalysisRequest setWordsType(String wordsType) {
        this.wordsType = wordsType;
        return this;
    }

    public Boolean getLayoutAnalysis() {
        return layoutAnalysis;
    }

    public DocAnalysisRequest setLayoutAnalysis(Boolean layoutAnalysis) {
        this.layoutAnalysis = layoutAnalysis;
        return this;
    }

    public Boolean getRecgFormula() {
        return recgFormula;
    }

    public DocAnalysisRequest setRecgFormula(Boolean recgFormula) {
        this.recgFormula = recgFormula;
        return this;
    }

    public Boolean getRecgLongDivision() {
        return recgLongDivision;
    }

    public DocAnalysisRequest setRecgLongDivision(Boolean recgLongDivision) {
        this.recgLongDivision = recgLongDivision;
        return this;
    }

    public Boolean getDispUnderlineAnalysis() {
        return dispUnderlineAnalysis;
    }

    public DocAnalysisRequest setDispUnderlineAnalysis(Boolean dispUnderlineAnalysis) {
        this.dispUnderlineAnalysis = dispUnderlineAnalysis;
        return this;
    }

    public Boolean getRecgAlter() {
        return recgAlter;
    }

    public DocAnalysisRequest setRecgAlter(Boolean recgAlter) {
        this.recgAlter = recgAlter;
        return this;
    }

}
