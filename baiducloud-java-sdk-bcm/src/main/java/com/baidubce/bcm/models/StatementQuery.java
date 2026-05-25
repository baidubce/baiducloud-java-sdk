package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatementQuery {
    /**
     * 语句ID
     */
    private String id;

    public StatementQuery setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "StatementQuery{" + "id=" + id + "\n" + "}";
    }

}