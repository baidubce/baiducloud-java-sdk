package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMysqlRateLimitTaskRequest extends BaseBceRequest {

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 实例ID
    */
    private String nodeId;

    /**
    * FilterKey 限流关键字，多组关键字，逗号分割，支持字符集utf8，除逗号为关键字外只能做分隔符使用，其他不设置限制
    */
    private String filterKey;

    /**
    * FilterLimit 限流规则的并发数：取值 0-100w 闭区间
    */
    private Integer filterLimit;

    /**
    * FilterType SQL限流类型：SELECTUPDATEINSERTDELETEREPLACE
    */
    private String filterType;

    public String getAppId() {
        return appId;
    }

    public CreateMysqlRateLimitTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public CreateMysqlRateLimitTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getFilterKey() {
        return filterKey;
    }

    public CreateMysqlRateLimitTaskRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }

    public Integer getFilterLimit() {
        return filterLimit;
    }

    public CreateMysqlRateLimitTaskRequest setFilterLimit(Integer filterLimit) {
        this.filterLimit = filterLimit;
        return this;
    }

    public String getFilterType() {
        return filterType;
    }

    public CreateMysqlRateLimitTaskRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

}
