package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConsumerListResponse extends BaseBceResponse {

    /**
    * 是否成功
    */
    private Boolean success;

    /**
    * HTTP 状态码
    */
    private Integer status;

    /**
    * 消费者总数
    */
    private Integer total;

    /**
    * 消费者摘要列表
    */
    private List<ConsumerSummary> consumers;

    /**
    * 下一页令牌
    */
    private String nextToken;

    public Boolean getSuccess() {
        return success;
    }

    public GetConsumerListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public GetConsumerListResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public GetConsumerListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public List<ConsumerSummary> getConsumers() {
        return consumers;
    }

    public GetConsumerListResponse setConsumers(List<ConsumerSummary> consumers) {
        this.consumers = consumers;
        return this;
    }

    public String getNextToken() {
        return nextToken;
    }

    public GetConsumerListResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    @Override
    public String toString() {
        return "GetConsumerListResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "total=" + total + "\n" + "consumers=" + consumers + "\n" + "nextToken="
                + nextToken + "\n" + "}";
    }

}
