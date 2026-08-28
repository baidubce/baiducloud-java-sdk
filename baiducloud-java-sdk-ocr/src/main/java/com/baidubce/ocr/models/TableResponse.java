package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableResponse extends BaseBceResponse {

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
    * 日志id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 检测到的表格数量
    */
    @JsonProperty("table_num")
    private Integer tableNum;

    /**
    * 表格内容
    */
    @JsonProperty("tables_result")
    private List<TablesResult> tablesResult;

    /**
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 图像内表格转换为excel文件的base64编码，当 return_excel 参数为true时返回该字段
    */
    @JsonProperty("excel_file")
    private String excelFile;

    public Integer getErrorCode() {
        return errorCode;
    }

    public TableResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public TableResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public TableResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public TableResponse setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
        return this;
    }

    public List<TablesResult> getTablesResult() {
        return tablesResult;
    }

    public TableResponse setTablesResult(List<TablesResult> tablesResult) {
        this.tablesResult = tablesResult;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public TableResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public String getExcelFile() {
        return excelFile;
    }

    public TableResponse setExcelFile(String excelFile) {
        this.excelFile = excelFile;
        return this;
    }

    @Override
    public String toString() {
        return "TableResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "tableNum=" + tableNum + "\n" + "tablesResult="
                + tablesResult + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "excelFile=" + excelFile + "\n" + "}";
    }

}
