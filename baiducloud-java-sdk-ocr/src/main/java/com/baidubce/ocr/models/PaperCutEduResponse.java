package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduResponse extends BaseBceResponse {

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
    * 检测到的图像朝向，当detect_direction=true时返回
    */
    private Integer direction;

    /**
    * 识别题目结果数，表示qus_result的元素个数
    */
    @JsonProperty("qus_result_num")
    private Integer qusResultNum;

    /**
    * 试卷内题目图片信息
    */
    @JsonProperty("qus_figure")
    private List<QusFigure> qusFigure;

    /**
    * 试卷切题信息
    */
    @JsonProperty("qus_result")
    private List<QusResult> qusResult;

    /**
    * 传入PDF文件的总页数，当pdf_file参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    /**
    * 处理状态，如 success
    */
    @JsonProperty("processed_status")
    private String processedStatus;

    public Integer getErrorCode() {
        return errorCode;
    }

    public PaperCutEduResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public PaperCutEduResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public PaperCutEduResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public PaperCutEduResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getQusResultNum() {
        return qusResultNum;
    }

    public PaperCutEduResponse setQusResultNum(Integer qusResultNum) {
        this.qusResultNum = qusResultNum;
        return this;
    }

    public List<QusFigure> getQusFigure() {
        return qusFigure;
    }

    public PaperCutEduResponse setQusFigure(List<QusFigure> qusFigure) {
        this.qusFigure = qusFigure;
        return this;
    }

    public List<QusResult> getQusResult() {
        return qusResult;
    }

    public PaperCutEduResponse setQusResult(List<QusResult> qusResult) {
        this.qusResult = qusResult;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public PaperCutEduResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public String getProcessedStatus() {
        return processedStatus;
    }

    public PaperCutEduResponse setProcessedStatus(String processedStatus) {
        this.processedStatus = processedStatus;
        return this;
    }

    @Override
    public String toString() {
        return "PaperCutEduResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "qusResultNum=" + qusResultNum + "\n" + "qusFigure=" + qusFigure + "\n" + "qusResult=" + qusResult + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "processedStatus=" + processedStatus + "\n" + "}";
    }

}
