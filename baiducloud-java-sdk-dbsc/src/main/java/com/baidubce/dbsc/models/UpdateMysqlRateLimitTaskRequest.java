package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMysqlRateLimitTaskRequest extends BaseBceRequest {

    /**
    * 限流规则id
    */
    private Integer filterId;

    /**
    * 集群ID
    */
    private String appId;

    /**
    * 节点ID
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
    * FilterType SQL限流类型，支持SELECT、UPDATE、INSERT、DELETE、REPLACE
    */
    private String filterType;

    public Integer getFilterId() {
        return filterId;
    }

    public UpdateMysqlRateLimitTaskRequest setFilterId(Integer filterId) {
        this.filterId = filterId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public UpdateMysqlRateLimitTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public UpdateMysqlRateLimitTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getFilterKey() {
        return filterKey;
    }

    public UpdateMysqlRateLimitTaskRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }

    public Integer getFilterLimit() {
        return filterLimit;
    }

    public UpdateMysqlRateLimitTaskRequest setFilterLimit(Integer filterLimit) {
        this.filterLimit = filterLimit;
        return this;
    }

    public String getFilterType() {
        return filterType;
    }

    public UpdateMysqlRateLimitTaskRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

}
