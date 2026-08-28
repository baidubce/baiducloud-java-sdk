package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误描述信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * detect_direction=true时返回。检测到的图像朝向，0：正向；1：逆时针旋转90度；2：逆时针旋转180度；3：逆时针旋转270度
    */
    @JsonProperty("img_direction")
    private Integer imgDirection;

    /**
    * 识别结果数，表示results的元素个数
    */
    @JsonProperty("results_num")
    private Integer resultsNum;

    /**
    * 识别结果数组
    */
    private List<DocAnalysisResult> results;

    /**
    * 识别结果中的公式数组，recg_formula=true时返回
    */
    @JsonProperty("formula_result")
    private List<DocAnalysisFormulaResult> formulaResult;

    /**
    * 将普通文字和公式融合后的识别结果数组，recg_formula=true时返回
    */
    @JsonProperty("words_result")
    private List<DocAnalysisWordsResult> wordsResult;

    /**
    * 版面分析结果数，表示layout的元素个数
    */
    @JsonProperty("layouts_num")
    private Integer layoutsNum;

    /**
    * 每个「栏：section」里面的文档版面模块数组，包含表格、图、段落文本、标题、目录等5个模块
    */
    private List<DocAnalysisLayout> layouts;

    /**
    * 将所有的版面中的「栏:section」内容表示成M×N的网格，sec_rows=M
    */
    @JsonProperty("sec_rows")
    private Integer secRows;

    /**
    * 将所有的版面中的「分栏」内容表示成M×N的网格，sec_cols=N
    */
    @JsonProperty("sec_cols")
    private Integer secCols;

    /**
    * 一张图片中包含的5大版面属性，包含：栏、页眉、页脚、页码、脚注
    */
    private List<DocAnalysisSection> sections;

    /**
    * 手写竖式识别结果，当recg_long_division=true时返回
    */
    @JsonProperty("long_division")
    private List<LongDivision> longDivision;

    /**
    * 手写竖式识别结果数，表示long_division的元素个数，当recg_long_division=true时返回
    */
    @JsonProperty("long_division_num")
    private Integer longDivisionNum;

    /**
    * 识别到的下划线结果，当disp_underline_analysis=true时返回
    */
    private List<Underline> underline;

    /**
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Integer getErrorCode() {
        return errorCode;
    }

    public DocAnalysisResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DocAnalysisResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public DocAnalysisResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getImgDirection() {
        return imgDirection;
    }

    public DocAnalysisResponse setImgDirection(Integer imgDirection) {
        this.imgDirection = imgDirection;
        return this;
    }

    public Integer getResultsNum() {
        return resultsNum;
    }

    public DocAnalysisResponse setResultsNum(Integer resultsNum) {
        this.resultsNum = resultsNum;
        return this;
    }

    public List<DocAnalysisResult> getResults() {
        return results;
    }

    public DocAnalysisResponse setResults(List<DocAnalysisResult> results) {
        this.results = results;
        return this;
    }

    public List<DocAnalysisFormulaResult> getFormulaResult() {
        return formulaResult;
    }

    public DocAnalysisResponse setFormulaResult(List<DocAnalysisFormulaResult> formulaResult) {
        this.formulaResult = formulaResult;
        return this;
    }

    public List<DocAnalysisWordsResult> getWordsResult() {
        return wordsResult;
    }

    public DocAnalysisResponse setWordsResult(List<DocAnalysisWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getLayoutsNum() {
        return layoutsNum;
    }

    public DocAnalysisResponse setLayoutsNum(Integer layoutsNum) {
        this.layoutsNum = layoutsNum;
        return this;
    }

    public List<DocAnalysisLayout> getLayouts() {
        return layouts;
    }

    public DocAnalysisResponse setLayouts(List<DocAnalysisLayout> layouts) {
        this.layouts = layouts;
        return this;
    }

    public Integer getSecRows() {
        return secRows;
    }

    public DocAnalysisResponse setSecRows(Integer secRows) {
        this.secRows = secRows;
        return this;
    }

    public Integer getSecCols() {
        return secCols;
    }

    public DocAnalysisResponse setSecCols(Integer secCols) {
        this.secCols = secCols;
        return this;
    }

    public List<DocAnalysisSection> getSections() {
        return sections;
    }

    public DocAnalysisResponse setSections(List<DocAnalysisSection> sections) {
        this.sections = sections;
        return this;
    }

    public List<LongDivision> getLongDivision() {
        return longDivision;
    }

    public DocAnalysisResponse setLongDivision(List<LongDivision> longDivision) {
        this.longDivision = longDivision;
        return this;
    }

    public Integer getLongDivisionNum() {
        return longDivisionNum;
    }

    public DocAnalysisResponse setLongDivisionNum(Integer longDivisionNum) {
        this.longDivisionNum = longDivisionNum;
        return this;
    }

    public List<Underline> getUnderline() {
        return underline;
    }

    public DocAnalysisResponse setUnderline(List<Underline> underline) {
        this.underline = underline;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public DocAnalysisResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "DocAnalysisResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "imgDirection=" + imgDirection + "\n"
                + "resultsNum=" + resultsNum + "\n" + "results=" + results + "\n" + "formulaResult=" + formulaResult + "\n" + "wordsResult=" + wordsResult + "\n" + "layoutsNum="
                + layoutsNum + "\n" + "layouts=" + layouts + "\n" + "secRows=" + secRows + "\n" + "secCols=" + secCols + "\n" + "sections=" + sections + "\n" + "longDivision="
                + longDivision + "\n" + "longDivisionNum=" + longDivisionNum + "\n" + "underline=" + underline + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "}";
    }

}
