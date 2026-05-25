package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatementDetail {
    /**
     * 语句ID
     */
    private String id;

    /**
     * 完整SQL语句
     */
    private String statement;

    /**
     * 语句所属服务
     */
    private String service;

    public StatementDetail setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public StatementDetail setStatement(String statement) {
        this.statement = statement;
        return this;
    }

    public String getStatement() {
        return this.statement;
    }

    public StatementDetail setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    @Override
    public String toString() {
        return "StatementDetail{" + "id=" + id + "\n" + "statement=" + statement + "\n" + "service=" + service + "\n" + "}";
    }

}