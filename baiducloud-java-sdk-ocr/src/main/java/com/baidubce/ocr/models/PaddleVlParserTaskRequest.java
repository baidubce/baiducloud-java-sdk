package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaddleVlParserTaskRequest extends BaseBceRequest {

    /**
    * 文件的base64编码数据： -版式文档：pdf、jpg、jpeg、png、bmp、tif、tiff、ofd，图片最长边不大于4096px -流式文档：doc、docx、txt、wps、ppt、pptx 图片不超过10M，版式文档大小不超过100M，流式文档大小不超过50M，其中PDF文档最大支持500页
    * 若文档大小超过50M，须从file_url方式上传。 优先级： file_data > file_url，当file_data字段存在时，file_url字段失效
    */
    @JsonProperty("file_data")
    private String fileData;

    /**
    * 文件数据URL，URL长度不超过1024字节，支持单个URL传入。PDF文档大小不超过100M，最大支持500页。优先级：file_data > file_url。请注意关闭URL防盗链
    */
    @JsonProperty("file_url")
    private String fileUrl;

    /**
    * 文件名，请保证文件名后缀正确，例如 \"1.pdf\"
    */
    @JsonProperty("file_name")
    private String fileName;

    /**
    * 是否对统计图表进行解析。可选值：true：是；false：否
    */
    @JsonProperty("analysis_chart")
    private Boolean analysisChart;

    /**
    * 是否将跨页表格合并输出。可选值：true：是；false：否
    */
    @JsonProperty("merge_tables")
    private Boolean mergeTables;

    /**
    * 是否对段落标题（paragraph_title）进行分级。可选值：true：是；false：否
    */
    @JsonProperty("relevel_titles")
    private Boolean relevelTitles;

    /**
    * 是否识别印章内容。可选值：true：是；false：否
    */
    @JsonProperty("recognize_seal")
    private Boolean recognizeSeal;

    /**
    * 是否返回行坐标。可选值：true：是；false：否
    */
    @JsonProperty("return_span_boxes")
    private Boolean returnSpanBoxes;

    public String getFileData() {
        return fileData;
    }

    public PaddleVlParserTaskRequest setFileData(String fileData) {
        this.fileData = fileData;
        return this;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public PaddleVlParserTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public PaddleVlParserTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Boolean getAnalysisChart() {
        return analysisChart;
    }

    public PaddleVlParserTaskRequest setAnalysisChart(Boolean analysisChart) {
        this.analysisChart = analysisChart;
        return this;
    }

    public Boolean getMergeTables() {
        return mergeTables;
    }

    public PaddleVlParserTaskRequest setMergeTables(Boolean mergeTables) {
        this.mergeTables = mergeTables;
        return this;
    }

    public Boolean getRelevelTitles() {
        return relevelTitles;
    }

    public PaddleVlParserTaskRequest setRelevelTitles(Boolean relevelTitles) {
        this.relevelTitles = relevelTitles;
        return this;
    }

    public Boolean getRecognizeSeal() {
        return recognizeSeal;
    }

    public PaddleVlParserTaskRequest setRecognizeSeal(Boolean recognizeSeal) {
        this.recognizeSeal = recognizeSeal;
        return this;
    }

    public Boolean getReturnSpanBoxes() {
        return returnSpanBoxes;
    }

    public PaddleVlParserTaskRequest setReturnSpanBoxes(Boolean returnSpanBoxes) {
        this.returnSpanBoxes = returnSpanBoxes;
        return this;
    }

}
