package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGetResponse extends BaseBceResponse {

    /**
    * 错误码，0表示成功
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 请求标识码，随机数，唯一
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 时间戳
    */
    private Long timestamp;

    /**
    * result
    */
    private UserGetResult result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public UserGetResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public UserGetResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public UserGetResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public UserGetResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public UserGetResult getResult() {
        return result;
    }

    public UserGetResponse setResult(UserGetResult result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "UserGetResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "timestamp=" + timestamp + "\n" + "result="
                + result + "\n" + "}";
    }

}
