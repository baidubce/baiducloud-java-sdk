package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateResult {
    /**
     * logStore
     */
    private LogStore logStore;

    /**
     * 是否通过校验
     */
    private Boolean valid;

    /**
     * 若校验失败，返回失败原因
     */
    private String reason;

    /**
     * 若校验通过，返回列名称列表
     */
    private List<String> columns;

    /**
     * 若校验通过，返回列类型列表
     */
    private List<String> columnTypes;

    public ValidateResult setLogStore(LogStore logStore) {
        this.logStore = logStore;
        return this;
    }

    public LogStore getLogStore() {
        return this.logStore;
    }

    public ValidateResult setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public ValidateResult setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public ValidateResult setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public ValidateResult setColumnTypes(List<String> columnTypes) {
        this.columnTypes = columnTypes;
        return this;
    }

    public List<String> getColumnTypes() {
        return this.columnTypes;
    }

    @Override
    public String toString() {
        return "ValidateResult{" + "logStore=" + logStore + "\n" + "valid=" + valid + "\n" + "reason=" + reason + "\n" + "columns=" + columns + "\n" + "columnTypes=" + columnTypes
                + "\n" + "}";
    }

}