package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumbersResponse extends BaseBceResponse {

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
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 图像方向，当 detect_direction=true 时返回该字段
    */
    private Integer direction;

    /**
    * 定位和识别结果数组
    */
    @JsonProperty("words_result")
    private List<NumbersWordsResult> wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public NumbersResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public NumbersResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public NumbersResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public NumbersResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public NumbersResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public List<NumbersWordsResult> getWordsResult() {
        return wordsResult;
    }

    public NumbersResponse setWordsResult(List<NumbersWordsResult> wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "NumbersResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "direction=" + direction + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
