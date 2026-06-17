package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Extend {
    /**
     * 日志集原来的列名
     */
    private String column;

    /**
     * 该列在日志视图中的别名
     */
    private String alias;

    public Extend setColumn(String column) {
        this.column = column;
        return this;
    }

    public String getColumn() {
        return this.column;
    }

    public Extend setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    @Override
    public String toString() {
        return "Extend{" + "column=" + column + "\n" + "alias=" + alias + "\n" + "}";
    }

}