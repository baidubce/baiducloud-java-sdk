package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeReceiversResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 通知对象列表
    */
    private List<Receiver> receivers;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeReceiversResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeReceiversResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeReceiversResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Receiver> getReceivers() {
        return receivers;
    }

    public DescribeReceiversResponse setReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeReceiversResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "receivers=" + receivers + "\n" + "}";
    }

}
