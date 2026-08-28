package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralBasicResponse extends BaseBceResponse {

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
    * 图像方向，当 detect_direction=true 时返回该字段
    */
    private Integer direction;

    /**
    * 语种类型，当 detect_language=true 时返回该字段
    */
    private Integer language;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果数组
    */
    @JsonProperty("words_result")
    private List<GeneralBasicWordsResult> wordsResult;

    /**
    * 段落检测结果，当 paragraph=true 时返回该字段
    */
    @JsonProperty("paragraphs_result")
    private List<GeneralBasicParagraphsResult> paragraphsResult;

    /**
    * 识别结果数，表示 paragraphs_result 的元素个数，当 paragraph=true 时返回该字段
    */
    @JsonProperty("paragraphs_result_num")
    private Integer paragraphsResultNum;

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

    public GeneralBasicResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public GeneralBasicResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public GeneralBasicResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getLanguage() {
        return language;
    }

    public GeneralBasicResponse setLanguage(Integer language) {
        this.language = language;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public GeneralBasicResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public GeneralBasicResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public List<GeneralBasicWordsResult> getWordsResult() {
        return wordsResult;
    }

    public GeneralBasicResponse setWordsResult(List<GeneralBasicWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public List<GeneralBasicParagraphsResult> getParagraphsResult() {
        return paragraphsResult;
    }

    public GeneralBasicResponse setParagraphsResult(List<GeneralBasicParagraphsResult> paragraphsResult) {
        this.paragraphsResult = paragraphsResult;
        return this;
    }

    public Integer getParagraphsResultNum() {
        return paragraphsResultNum;
    }

    public GeneralBasicResponse setParagraphsResultNum(Integer paragraphsResultNum) {
        this.paragraphsResultNum = paragraphsResultNum;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public GeneralBasicResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    public String getOfdFileSize() {
        return ofdFileSize;
    }

    public GeneralBasicResponse setOfdFileSize(String ofdFileSize) {
        this.ofdFileSize = ofdFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "GeneralBasicResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "direction=" + direction + "\n" + "language=" + language + "\n"
                + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "paragraphsResult=" + paragraphsResult + "\n"
                + "paragraphsResultNum=" + paragraphsResultNum + "\n" + "pdfFileSize=" + pdfFileSize + "\n" + "ofdFileSize=" + ofdFileSize + "\n" + "}";
    }

}
