package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeTopologyRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 应用名。若未设置，表示查询全局拓扑；若设置，表示查询服务上下游拓扑。支持模糊搜索，例如".*mall.*"
    */
    private String serviceName;

    /**
    * 按env过滤，若未设置，返回所有环境的拓扑图
    */
    private String env;

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    public String getAction() {
        return action;
    }

    public DescribeTopologyRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getServiceName() {
        return serviceName;
    }

    public DescribeTopologyRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getEnv() {
        return env;
    }

    public DescribeTopologyRequest setEnv(String env) {
        this.env = env;
        return this;
    }

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeTopologyRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeTopologyRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

}
