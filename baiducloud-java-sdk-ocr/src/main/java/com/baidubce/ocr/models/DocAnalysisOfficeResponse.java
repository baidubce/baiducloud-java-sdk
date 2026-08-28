package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 检测到的图像朝向，detect_direction=true 时返回该字段。0：正向；1：逆时针旋转90度；2：逆时针旋转180度；3：逆时针旋转270度
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
    private List<DocAnalysisOfficeResult> results;

    /**
    * 版面分析结果数，layout_analysis=true时返回
    */
    @JsonProperty("layouts_num")
    private Integer layoutsNum;

    /**
    * 文档版面模块数组，layout_analysis=true时返回
    */
    private List<DocAnalysisOfficeLayout> layouts;

    /**
    * 将所有的版面中的「栏:section」内容表示成 M x N 的网格，sec_rows = M
    */
    @JsonProperty("sec_rows")
    private Integer secRows;

    /**
    * 将所有的版面中的「分栏」内容表示成 M x N 的网格，sec_cols = N
    */
    @JsonProperty("sec_cols")
    private Integer secCols;

    /**
    * 一张图片中包含的5大版面属性，layout_analysis=true时返回
    */
    private List<DocAnalysisOfficeSection> sections;

    /**
    * 检测到的表格数量，当recg_tables=true时返回
    */
    @JsonProperty("table_num")
    private Integer tableNum;

    /**
    * 每个表格的内容数组，当recg_tables=true时返回
    */
    @JsonProperty("tables_result")
    private List<TableResult> tablesResult;

    /**
    * 识别到的印章结果数，当recog_seal=true时返回
    */
    @JsonProperty("seal_recog_num")
    private Integer sealRecogNum;

    /**
    * 印章内容数组，当recog_seal=true时返回
    */
    @JsonProperty("seal_recog_results")
    private List<SealRecogResult> sealRecogResults;

    /**
    * 识别到的公式数组，当 recg_formula=true 时返回
    */
    @JsonProperty("formula_result")
    private List<FormulaResult> formulaResult;

    /**
    * 识别到的下划线数组
    */
    private List<Object> underline;

    /**
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 传入OFD文件的总页数，当 ofd_file 参数有效时返回该字段
    */
    @JsonProperty("ofd_file_size")
    private String ofdFileSize;

    public Integer getErrorCode() {
        return errorCode;
    }

    public DocAnalysisOfficeResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DocAnalysisOfficeResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public DocAnalysisOfficeResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getImgDirection() {
        return imgDirection;
    }

    public DocAnalysisOfficeResponse setImgDirection(Integer imgDirection) {
        this.imgDirection = imgDirection;
        return this;
    }

    public Integer getResultsNum() {
        return resultsNum;
    }

    public DocAnalysisOfficeResponse setResultsNum(Integer resultsNum) {
        this.resultsNum = resultsNum;
        return this;
    }

    public List<DocAnalysisOfficeResult> getResults() {
        return results;
    }

    public DocAnalysisOfficeResponse setResults(List<DocAnalysisOfficeResult> results) {
        this.results = results;
        return this;
    }

    public Integer getLayoutsNum() {
        return layoutsNum;
    }

    public DocAnalysisOfficeResponse setLayoutsNum(Integer layoutsNum) {
        this.layoutsNum = layoutsNum;
        return this;
    }

    public List<DocAnalysisOfficeLayout> getLayouts() {
        return layouts;
    }

    public DocAnalysisOfficeResponse setLayouts(List<DocAnalysisOfficeLayout> layouts) {
        this.layouts = layouts;
        return this;
    }

    public Integer getSecRows() {
        return secRows;
    }

    public DocAnalysisOfficeResponse setSecRows(Integer secRows) {
        this.secRows = secRows;
        return this;
    }

    public Integer getSecCols() {
        return secCols;
    }

    public DocAnalysisOfficeResponse setSecCols(Integer secCols) {
        this.secCols = secCols;
        return this;
    }

    public List<DocAnalysisOfficeSection> getSections() {
        return sections;
    }

    public DocAnalysisOfficeResponse setSections(List<DocAnalysisOfficeSection> sections) {
        this.sections = sections;
        return this;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public DocAnalysisOfficeResponse setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
        return this;
    }

    public List<TableResult> getTablesResult() {
        return tablesResult;
    }

    public DocAnalysisOfficeResponse setTablesResult(List<TableResult> tablesResult) {
        this.tablesResult = tablesResult;
        return this;
    }

    public Integer getSealRecogNum() {
        return sealRecogNum;
    }

    public DocAnalysisOfficeResponse setSealRecogNum(Integer sealRecogNum) {
        this.sealRecogNum = sealRecogNum;
        return this;
    }

    public List<SealRecogResult> getSealRecogResults() {
        return sealRecogResults;
    }

    public DocAnalysisOfficeResponse setSealRecogResults(List<SealRecogResult> sealRecogResults) {
        this.sealRecogResults = sealRecogResults;
        return this;
    }

    public List<FormulaResult> getFormulaResult() {
        return formulaResult;
    }

    public DocAnalysisOfficeResponse setFormulaResult(List<FormulaResult> formulaResult) {
        this.formulaResult = formulaResult;
        return this;
    }

    public List<Object> getUnderline() {
        return underline;
    }

    public DocAnalysisOfficeResponse setUnderline(List<Object> underline) {
        this.underline = underline;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public DocAnalysisOfficeResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public String getOfdFileSize() {
        return ofdFileSize;
    }

    public DocAnalysisOfficeResponse setOfdFileSize(String ofdFileSize) {
        this.ofdFileSize = ofdFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "imgDirection=" + imgDirection + "\n"
                + "resultsNum=" + resultsNum + "\n" + "results=" + results + "\n" + "layoutsNum=" + layoutsNum + "\n" + "layouts=" + layouts + "\n" + "secRows=" + secRows + "\n"
                + "secCols=" + secCols + "\n" + "sections=" + sections + "\n" + "tableNum=" + tableNum + "\n" + "tablesResult=" + tablesResult + "\n" + "sealRecogNum="
                + sealRecogNum + "\n" + "sealRecogResults=" + sealRecogResults + "\n" + "formulaResult=" + formulaResult + "\n" + "underline=" + underline + "\n" + "pdfFileSize="
                + pdfFileSize + "\n" + "ofdFileSize=" + ofdFileSize + "\n" + "}";
    }

}
