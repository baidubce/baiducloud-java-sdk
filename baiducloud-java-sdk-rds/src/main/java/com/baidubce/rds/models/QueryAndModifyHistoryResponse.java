package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryAndModifyHistoryResponse extends BaseBceResponse {

    /**
    * 参数名
    */
    private String name;

    /**
    * 修改前的值
    */
    private String beforeValue;

    /**
    * 修改后的值
    */
    private String afterValue;

    /**
    * 修改状态：success：成功：pendingReboot：待重启
    */
    private String status;

    /**
    * 修改时间
    */
    private String updateTime;

    public String getName() {
        return name;
    }

    public QueryAndModifyHistoryResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getBeforeValue() {
        return beforeValue;
    }

    public QueryAndModifyHistoryResponse setBeforeValue(String beforeValue) {
        this.beforeValue = beforeValue;
        return this;
    }

    public String getAfterValue() {
        return afterValue;
    }

    public QueryAndModifyHistoryResponse setAfterValue(String afterValue) {
        this.afterValue = afterValue;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryAndModifyHistoryResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public QueryAndModifyHistoryResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "QueryAndModifyHistoryResponse{" + "name=" + name + "\n" + "beforeValue=" + beforeValue + "\n" + "afterValue=" + afterValue + "\n" + "status=" + status + "\n"
                + "updateTime=" + updateTime + "\n" + "}";
    }

}
