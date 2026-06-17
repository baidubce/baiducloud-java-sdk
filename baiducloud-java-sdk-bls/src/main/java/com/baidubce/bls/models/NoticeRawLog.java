package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoticeRawLog {
    /**
     * 配置类型，REF: 关联执行语句，CUSTOM: 自定义检索语句
     */
    private String type;

    /**
     * 引用的执行语句序号，从0开始计数，type=REF时必填
     */
    private Integer refTarget;

    /**
     * customTarget
     */
    private CustomTarget customTarget;

    /**
     * 在原始日志中展示的字段名列表
     */
    private List<String> columns;

    /**
     * 展示的日志条数，最大值为5
     */
    private Integer limit;

    public NoticeRawLog setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public NoticeRawLog setRefTarget(Integer refTarget) {
        this.refTarget = refTarget;
        return this;
    }

    public Integer getRefTarget() {
        return this.refTarget;
    }

    public NoticeRawLog setCustomTarget(CustomTarget customTarget) {
        this.customTarget = customTarget;
        return this;
    }

    public CustomTarget getCustomTarget() {
        return this.customTarget;
    }

    public NoticeRawLog setColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public List<String> getColumns() {
        return this.columns;
    }

    public NoticeRawLog setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return this.limit;
    }

    @Override
    public String toString() {
        return "NoticeRawLog{" + "type=" + type + "\n" + "refTarget=" + refTarget + "\n" + "customTarget=" + customTarget + "\n" + "columns=" + columns + "\n" + "limit=" + limit
                + "\n" + "}";
    }

}