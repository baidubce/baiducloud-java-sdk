package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmRecordsResult {
    /**
     * 第几页
     */
    private Integer pageNo;

    /**
     * 每页展示数量
     */
    private Integer pageSize;

    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 报警列表
     */
    private List<Alarm> alarms;

    public AlarmRecordsResult setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public AlarmRecordsResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public AlarmRecordsResult setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public AlarmRecordsResult setAlarms(List<Alarm> alarms) {
        this.alarms = alarms;
        return this;
    }

    public List<Alarm> getAlarms() {
        return this.alarms;
    }

    @Override
    public String toString() {
        return "AlarmRecordsResult{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "alarms=" + alarms + "\n" + "}";
    }

}