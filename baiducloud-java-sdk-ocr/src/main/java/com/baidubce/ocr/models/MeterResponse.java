package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MeterResponse extends BaseBceResponse {

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
    * 识别结果数组
    */
    @JsonProperty("words_result")
    private List<MeterWordsResult> wordsResult;

    /**
    * 识别结果数，表示 words_result 的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    public Integer getErrorCode() {
        return errorCode;
    }

    public MeterResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public MeterResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public MeterResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public List<MeterWordsResult> getWordsResult() {
        return wordsResult;
    }

    public MeterResponse setWordsResult(List<MeterWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public MeterResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    @Override
    public String toString() {
        return "MeterResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResult=" + wordsResult + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "}";
    }

}
