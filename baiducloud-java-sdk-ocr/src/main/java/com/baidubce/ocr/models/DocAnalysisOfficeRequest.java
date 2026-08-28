package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeRequest extends BaseBceRequest {

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
    * 识别语言类型，默认为CHN_ENG。可选值包括：auto_detect：自动检测语言，并识别；CHN_ENG：中英文；ENG：英文；JAP：日语；KOR：韩语；FRE：法语；SPA：西班牙语；POR：葡萄牙语；GER：德语；ITA：意大利语；RUS：俄语；DAN：丹麦语；DUT：荷兰语；MAL：马来语；SWE：瑞典语；IND：印尼语；POL：
    * 波兰语；ROM：罗马尼亚语；TUR：土耳其语；GRE：希腊语；HUN：匈牙利语；THA：泰语；VIE：越南语；ARA：阿拉伯语；HIN：印地语
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 返回识别结果是按单行结果返回，还是按单字结果返回，默认为big。可选值包括：big：返回行识别结果；small：返回行识别结果之上还会返回单字结果
    */
    @JsonProperty("result_type")
    private String resultType;

    /**
    * 是否返回单字符置信度，默认不返回，当 result_type = small 时，参数有效。可选值包括：true：返回单字符置信度；false：不返回单字符置信度
    */
    @JsonProperty("char_probability")
    private Boolean charProbability;

    /**
    * 是否检测图像朝向，默认不检测，即：false。朝向是指输入图像是正常方向、逆时针旋转90/180/270度。可选值包括: true：检测朝向；false：不检测朝向
    */
    @JsonProperty("detect_direction")
    private Boolean detectDirection;

    /**
    * 是否返回每行识别结果的置信度。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("line_probability")
    private Boolean lineProbability;

    /**
    * 是否返回每行的四角点坐标。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("disp_line_poly")
    private Boolean dispLinePoly;

    /**
    * 是否指定文字类型，默认：手写印刷混排识别。可选值包括：handwring_only：手写文字识别；handprint_mix：手写印刷混排识别
    */
    @JsonProperty("words_type")
    private String wordsType;

    /**
    * 是否输出文档版面的分析结果。默认为false layout： 表格: table, 图: figure, 文本段落: text, 段落标题: text_title, 印章: seal, 目录: contents, 表标题: table_title, 图标题: figure_title attribute： 页眉: header, 页脚:
    * footer, 页码： number, 分栏: section, 脚注: footnote
    */
    @JsonProperty("layout_analysis")
    private Boolean layoutAnalysis;

    /**
    * 是否识别并输出表格相关信息，包括单元格内容。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("recg_tables")
    private Boolean recgTables;

    /**
    * 是否识别并输出印章相关信息。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("recog_seal")
    private Boolean recogSeal;

    /**
    * 是否检测并识别公式，公式以Latex格式返回。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("recg_formula")
    private Boolean recgFormula;

    /**
    * 是否先擦除水印、印章后再识别文档。默认为false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("erase_seal")
    private Boolean eraseSeal;

    /**
    * 是否识别并输出下划线，默认false。可选值包括：true：返回；false：不返回
    */
    @JsonProperty("disp_underline_analysis")
    private Boolean dispUnderlineAnalysis;

    public String getImage() {
        return image;
    }

    public DocAnalysisOfficeRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DocAnalysisOfficeRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public DocAnalysisOfficeRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public DocAnalysisOfficeRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public DocAnalysisOfficeRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public DocAnalysisOfficeRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public DocAnalysisOfficeRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public String getResultType() {
        return resultType;
    }

    public DocAnalysisOfficeRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    public Boolean getCharProbability() {
        return charProbability;
    }

    public DocAnalysisOfficeRequest setCharProbability(Boolean charProbability) {
        this.charProbability = charProbability;
        return this;
    }

    public Boolean getDetectDirection() {
        return detectDirection;
    }

    public DocAnalysisOfficeRequest setDetectDirection(Boolean detectDirection) {
        this.detectDirection = detectDirection;
        return this;
    }

    public Boolean getLineProbability() {
        return lineProbability;
    }

    public DocAnalysisOfficeRequest setLineProbability(Boolean lineProbability) {
        this.lineProbability = lineProbability;
        return this;
    }

    public Boolean getDispLinePoly() {
        return dispLinePoly;
    }

    public DocAnalysisOfficeRequest setDispLinePoly(Boolean dispLinePoly) {
        this.dispLinePoly = dispLinePoly;
        return this;
    }

    public String getWordsType() {
        return wordsType;
    }

    public DocAnalysisOfficeRequest setWordsType(String wordsType) {
        this.wordsType = wordsType;
        return this;
    }

    public Boolean getLayoutAnalysis() {
        return layoutAnalysis;
    }

    public DocAnalysisOfficeRequest setLayoutAnalysis(Boolean layoutAnalysis) {
        this.layoutAnalysis = layoutAnalysis;
        return this;
    }

    public Boolean getRecgTables() {
        return recgTables;
    }

    public DocAnalysisOfficeRequest setRecgTables(Boolean recgTables) {
        this.recgTables = recgTables;
        return this;
    }

    public Boolean getRecogSeal() {
        return recogSeal;
    }

    public DocAnalysisOfficeRequest setRecogSeal(Boolean recogSeal) {
        this.recogSeal = recogSeal;
        return this;
    }

    public Boolean getRecgFormula() {
        return recgFormula;
    }

    public DocAnalysisOfficeRequest setRecgFormula(Boolean recgFormula) {
        this.recgFormula = recgFormula;
        return this;
    }

    public Boolean getEraseSeal() {
        return eraseSeal;
    }

    public DocAnalysisOfficeRequest setEraseSeal(Boolean eraseSeal) {
        this.eraseSeal = eraseSeal;
        return this;
    }

    public Boolean getDispUnderlineAnalysis() {
        return dispUnderlineAnalysis;
    }

    public DocAnalysisOfficeRequest setDispUnderlineAnalysis(Boolean dispUnderlineAnalysis) {
        this.dispUnderlineAnalysis = dispUnderlineAnalysis;
        return this;
    }

}
