package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParserTaskRequest extends BaseBceRequest {

    /**
    * 文件的base64编码数据。版式文档：pdf、jpg、jpeg、png、bmp、tif、tiff、ofd、ppt、pptx；流式文档：doc、docx、txt、xls、xlsx、wps、html、mhtml。文档大小不超过50M，其中PDF文档最大支持2000页。若文档大小超过50M，须从file_url方式上传。优先级：file_data >
    * file_url
    */
    @JsonProperty("file_data")
    private String fileData;

    /**
    * 文件数据URL，URL长度不超过1024字节，支持单个URL传入。PDF文档大小不超过300M，非PDF文档大小不超过50M，其中PDF文档最大支持2000页。优先级：file_data > file_url。请注意关闭URL防盗链
    */
    @JsonProperty("file_url")
    private String fileUrl;

    /**
    * 文件名，请保证文件名后缀正确，例如 \"1.pdf\"
    */
    @JsonProperty("file_name")
    private String fileName;

    /**
    * 是否对版式类型文档进行公式识别。可选值：true：是；false：否
    */
    @JsonProperty("recognize_formula")
    private Boolean recognizeFormula;

    /**
    * 是否对统计图表进行解析。可选值：true：是；false：否
    */
    @JsonProperty("analysis_chart")
    private Boolean analysisChart;

    /**
    * 是否对图片进行矫正。可选值：true：是；false：否
    */
    @JsonProperty("angle_adjust")
    private Boolean angleAdjust;

    /**
    * 是否返回文档中的图片位置信息。可选值：true：是；false：否
    */
    @JsonProperty("parse_image_layout")
    private Boolean parseImageLayout;

    /**
    * 识别语种类型，默认为
    * CHN_ENG。可选值包括：CHN_ENG：中英文；JAP：日语；KOR：韩语；FRE：法语；SPA：西班牙语；POR：葡萄牙语；GER：德语；ITA：意大利语；RUS：俄语；DAN：丹麦语；DUT：荷兰语；MAL：马来语；SWE：瑞典语；IND：印尼语；POL：波兰语；ROM：罗马尼亚语；TUR：土耳其语；GRE：希腊语；HUN：匈牙利语；
    * THA：泰语；VIE：越南语；ARA：阿拉伯语；HIN：印地语
    */
    @JsonProperty("language_type")
    private String languageType;

    /**
    * 是否对数字进行全半角转换，默认为 auto。可选值：auto：不转换，按模型识别结果输出；half：将所有的符号转换为半角输出；full：将所有的符号转换为全角输出
    */
    @JsonProperty("switch_digital_width")
    private String switchDigitalWidth;

    /**
    * 是否将识别出的表格转换为 HTML 格式返回，默认为 true。可选值：true：是；false：否
    */
    @JsonProperty("html_table_format")
    private Boolean htmlTableFormat;

    /**
    * 是否返回文档切分后的片段数据（如按语义、字数、标点）。如有需要，可按下方说明进行传参：<div/>switch：是否进行文档内容切分，默认false；<br/>split_type：切分方式，默认chunk，可选值：chunk：按照「chunk_size」来切；mark：按照「separators」来切；<br/>separators：切分标点，
    * 默认['。', '；', '！', '？', ';', '!', '?']；<br/>chunk_size：切分块的大小，默认-1时表示按照语义自动切分，不限定块的大小
    */
    @JsonProperty("return_doc_chunks")
    private String returnDocChunks;

    public String getFileData() {
        return fileData;
    }

    public ParserTaskRequest setFileData(String fileData) {
        this.fileData = fileData;
        return this;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public ParserTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public ParserTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Boolean getRecognizeFormula() {
        return recognizeFormula;
    }

    public ParserTaskRequest setRecognizeFormula(Boolean recognizeFormula) {
        this.recognizeFormula = recognizeFormula;
        return this;
    }

    public Boolean getAnalysisChart() {
        return analysisChart;
    }

    public ParserTaskRequest setAnalysisChart(Boolean analysisChart) {
        this.analysisChart = analysisChart;
        return this;
    }

    public Boolean getAngleAdjust() {
        return angleAdjust;
    }

    public ParserTaskRequest setAngleAdjust(Boolean angleAdjust) {
        this.angleAdjust = angleAdjust;
        return this;
    }

    public Boolean getParseImageLayout() {
        return parseImageLayout;
    }

    public ParserTaskRequest setParseImageLayout(Boolean parseImageLayout) {
        this.parseImageLayout = parseImageLayout;
        return this;
    }

    public String getLanguageType() {
        return languageType;
    }

    public ParserTaskRequest setLanguageType(String languageType) {
        this.languageType = languageType;
        return this;
    }

    public String getSwitchDigitalWidth() {
        return switchDigitalWidth;
    }

    public ParserTaskRequest setSwitchDigitalWidth(String switchDigitalWidth) {
        this.switchDigitalWidth = switchDigitalWidth;
        return this;
    }

    public Boolean getHtmlTableFormat() {
        return htmlTableFormat;
    }

    public ParserTaskRequest setHtmlTableFormat(Boolean htmlTableFormat) {
        this.htmlTableFormat = htmlTableFormat;
        return this;
    }

    public String getReturnDocChunks() {
        return returnDocChunks;
    }

    public ParserTaskRequest setReturnDocChunks(String returnDocChunks) {
        this.returnDocChunks = returnDocChunks;
        return this;
    }

}
