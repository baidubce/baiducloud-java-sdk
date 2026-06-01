package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeExceptionsRequest extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 异常所属服务名称
    */
    private String service;

    /**
    * 按exceptionId批量查询，每项包含id(异常id，必填)
    */
    private List<ExceptionQuery> exceptions;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeExceptionsRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeExceptionsRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getService() {
        return service;
    }

    public DescribeExceptionsRequest setService(String service) {
        this.service = service;
        return this;
    }

    public List<ExceptionQuery> getExceptions() {
        return exceptions;
    }

    public DescribeExceptionsRequest setExceptions(List<ExceptionQuery> exceptions) {
        this.exceptions = exceptions;
        return this;
    }

}
