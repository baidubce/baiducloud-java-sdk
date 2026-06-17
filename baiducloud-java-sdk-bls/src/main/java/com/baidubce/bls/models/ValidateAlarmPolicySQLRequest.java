package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateAlarmPolicySQLRequest extends BaseBceRequest {

    /**
    * 监控对象列表
    */
    private List<LogStore> logStores;

    /**
    * 执行语句
    */
    private String query;

    public List<LogStore> getLogStores() {
        return logStores;
    }

    public ValidateAlarmPolicySQLRequest setLogStores(List<LogStore> logStores) {
        this.logStores = logStores;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public ValidateAlarmPolicySQLRequest setQuery(String query) {
        this.query = query;
        return this;
    }

}
