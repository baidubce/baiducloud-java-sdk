package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableIndexColumnItem {
    /**
     * 字段名称
     */
    private String columnName;

    /**
     * 索引顺序
     */
    private Integer sequence;

    /**
     * 字段排序方式
     */
    private String collation;

    /**
     * 基数
     */
    private Long cardinality;

    /**
     * 字段是否为空
     */
    private String nullable;

    public TableIndexColumnItem setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public TableIndexColumnItem setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public TableIndexColumnItem setCollation(String collation) {
        this.collation = collation;
        return this;
    }

    public String getCollation() {
        return this.collation;
    }

    public TableIndexColumnItem setCardinality(Long cardinality) {
        this.cardinality = cardinality;
        return this;
    }

    public Long getCardinality() {
        return this.cardinality;
    }

    public TableIndexColumnItem setNullable(String nullable) {
        this.nullable = nullable;
        return this;
    }

    public String getNullable() {
        return this.nullable;
    }

    @Override
    public String toString() {
        return "TableIndexColumnItem{" + "columnName=" + columnName + "\n" + "sequence=" + sequence + "\n" + "collation=" + collation + "\n" + "cardinality=" + cardinality + "\n"
                + "nullable=" + nullable + "\n" + "}";
    }

}