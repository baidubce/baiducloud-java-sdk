package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobsRequest extends BaseBceRequest {

    /**
    * queueID
    */
    @JsonIgnore
    private String queueID;

    /**
    * 训练任务所属队列，通用资源池须填入队列名称，不填时返回所有。托管资源池须填入队列Id
    */
    private String queue;

    /**
    * 基于状态筛选任务
    */
    private String status;

    /**
    * 筛选关键字类型，当前仅支持name/queueName
    */
    private String keywordType;

    /**
    * 关键字值
    */
    private String keyword;

    /**
    * 排序字段，支持createdAt，finishedAt，默认为createdAt
    */
    private String orderBy;

    /**
    * 排序方式，可选 [asc, desc]，asc 为升序，desc 为降序，默认值为 desc
    */
    private String order;

    /**
    * 请求分页参数，表示第几页
    */
    private Integer pageNumber;

    /**
    * 单页结果数，默认值为10
    */
    private Integer pageSize;

    public String getQueueID() {
        return queueID;
    }

    public DescribeJobsRequest setQueueID(String queueID) {
        this.queueID = queueID;
        return this;
    }

    public String getQueue() {
        return queue;
    }

    public DescribeJobsRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DescribeJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public DescribeJobsRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public DescribeJobsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DescribeJobsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DescribeJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public DescribeJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
