package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmsResponse extends BaseBceResponse {

    /**
    * 报警历史列表
    */
    private List<Alarm> alarms;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    /**
    * 总条数
    */
    private Integer totalCount;

    public List<Alarm> getAlarms() {
        return alarms;
    }

    public DescribeAlarmsResponse setAlarms(List<Alarm> alarms) {
        this.alarms = alarms;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeAlarmsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmsResponse{" + "alarms=" + alarms + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
