package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConsumerResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * consumer
    */
    private ConsumerDetailInfo consumer;

    public Boolean getSuccess() {
        return success;
    }

    public GetConsumerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetConsumerResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public ConsumerDetailInfo getConsumer() {
        return consumer;
    }

    public GetConsumerResponse setConsumer(ConsumerDetailInfo consumer) {
        this.consumer = consumer;
        return this;
    }

    @Override
    public String toString() {
        return "GetConsumerResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "consumer=" + consumer + "\n" + "}";
    }

}
