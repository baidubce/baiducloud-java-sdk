package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDbStatementV3Request extends BaseBceRequest {

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

    public DescribeDbStatementV3Request setBeginDatetime(String beginDatetime) {
        this.beginDatetime = beginDatetime;
        return this;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public DescribeDbStatementV3Request setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
        return this;
    }

    public String getService() {
        return service;
    }

    public DescribeDbStatementV3Request setService(String service) {
        this.service = service;
        return this;
    }

    public List<StatementQuery> getStatements() {
        return statements;
    }

    public DescribeDbStatementV3Request setStatements(List<StatementQuery> statements) {
        this.statements = statements;
        return this;
    }

}
