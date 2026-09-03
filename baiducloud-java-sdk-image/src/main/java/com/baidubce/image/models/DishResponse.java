package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DishResponse extends BaseBceResponse {

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
    * 识别结果数量
    */
    @JsonProperty("result_num")
    private Integer resultNum;

    /**
    * 菜品识别结果数组
    */
    private List<DishResult> result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public DishResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DishResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public DishResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getResultNum() {
        return resultNum;
    }

    public DishResponse setResultNum(Integer resultNum) {
        this.resultNum = resultNum;
        return this;
    }

    public List<DishResult> getResult() {
        return result;
    }

    public DishResponse setResult(List<DishResult> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "DishResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "resultNum=" + resultNum + "\n" + "result=" + result
                + "\n" + "}";
    }

}
