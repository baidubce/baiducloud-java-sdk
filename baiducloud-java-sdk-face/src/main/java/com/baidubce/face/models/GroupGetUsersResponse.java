package com.baidubce.face.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetUsersResponse extends BaseBceResponse {

    /**
    * result
    */
    private GroupGetUsersResult result;

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

    public GroupGetUsersResult getResult() {
        return result;
    }

    public GroupGetUsersResponse setResult(GroupGetUsersResult result) {
        this.result = result;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public GroupGetUsersResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public GroupGetUsersResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public GroupGetUsersResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    @Override
    public String toString() {
        return "GroupGetUsersResponse{" + "result=" + result + "\n" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "}";
    }

}
