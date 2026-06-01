package com.baidubce.apm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDbStatementRequest extends BaseBceRequest {

    /**
    * 开始时间，UTC时间
    */
    private String beginDatetime;

    /**
    * 结束时间，UTC时间
    */
    private String endDatetime;

    /**
    * 数据库所属服务名称
    */
    private String service;

    /**
    * 按数据库语句ID批量查询，每项包含id(语句ID，必填)
    */
    private List<StatementQuery> statements;

    public String getBeginDatetime() {
        return beginDatetime;
    }

    public DescribeDbStatementRequest setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeDbStatementRequest setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getService() {
        return service;
    }

    public DescribeDbStatementRequest setService(String service) {
        this.service = service;
        return this;
    }

    public List<StatementQuery> getStatements() {
        return statements;
    }

    public DescribeDbStatementRequest setStatements(List<StatementQuery> statements) {
        this.statements = statements;
        return this;
    }

}
