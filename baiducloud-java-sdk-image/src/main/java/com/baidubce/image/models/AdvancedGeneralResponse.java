package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedGeneralResponse extends BaseBceResponse {

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
    * 识别结果数
    */
    @JsonProperty("result_num")
    private Integer resultNum;

    /**
    * 识别结果数组
    */
    private List<AdvancedGeneralResult> result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public AdvancedGeneralResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public AdvancedGeneralResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public AdvancedGeneralResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getResultNum() {
        return resultNum;
    }

    public AdvancedGeneralResponse setResultNum(Integer resultNum) {
        this.resultNum = resultNum;
        return this;
    }

    public List<AdvancedGeneralResult> getResult() {
        return result;
    }

    public AdvancedGeneralResponse setResult(List<AdvancedGeneralResult> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "AdvancedGeneralResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "resultNum=" + resultNum + "\n" + "result="
                + result + "\n" + "}";
    }

}
