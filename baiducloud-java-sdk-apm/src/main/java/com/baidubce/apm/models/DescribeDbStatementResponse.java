package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDbStatementResponse extends BaseBceResponse {

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
    * 数据库语句信息列表，每项包含id(语句ID)、statement(完整语句)、service(语句所属服务)
    */
    private List<StatementDetail> statements;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeDbStatementResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeDbStatementResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeDbStatementResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<StatementDetail> getStatements() {
        return statements;
    }

    public DescribeDbStatementResponse setStatements(List<StatementDetail> statements) {
        this.statements = statements;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeDbStatementResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "statements=" + statements + "\n" + "}";
    }

}
