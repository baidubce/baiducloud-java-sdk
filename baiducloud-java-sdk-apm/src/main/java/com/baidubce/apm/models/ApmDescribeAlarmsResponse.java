package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmsResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 报警事件列表
    */
    private List<AlarmEventDetail> alarms;

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

    public Boolean getSuccess() {
        return success;
    }

    public ApmDescribeAlarmsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ApmDescribeAlarmsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApmDescribeAlarmsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<AlarmEventDetail> getAlarms() {
        return alarms;
    }

    public ApmDescribeAlarmsResponse setAlarms(List<AlarmEventDetail> alarms) {
        this.alarms = alarms;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ApmDescribeAlarmsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ApmDescribeAlarmsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ApmDescribeAlarmsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "ApmDescribeAlarmsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "alarms=" + alarms + "\n" + "pageNo=" + pageNo
                + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
