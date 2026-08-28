package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QrcodeResponse extends BaseBceResponse {

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
    * 识别结果数，表示codes_result的元素个数
    */
    @JsonProperty("codes_result_num")
    private Integer codesResultNum;

    /**
    * 定位和识别结果数组
    */
    @JsonProperty("codes_result")
    private List<CodesResult> codesResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public QrcodeResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public QrcodeResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public QrcodeResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getCodesResultNum() {
        return codesResultNum;
    }

    public QrcodeResponse setCodesResultNum(Integer codesResultNum) {
        this.codesResultNum = codesResultNum;
        return this;
    }

    public List<CodesResult> getCodesResult() {
        return codesResult;
    }

    public QrcodeResponse setCodesResult(List<CodesResult> codesResult) {
        this.codesResult = codesResult;
        return this;
    }

    @Override
    public String toString() {
        return "QrcodeResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "codesResultNum=" + codesResultNum + "\n"
                + "codesResult=" + codesResult + "\n" + "}";
    }

}
