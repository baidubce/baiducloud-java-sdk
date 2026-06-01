package com.baidubce.apm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionQuery {
    /**
     * 异常ID
     */
    private String id;

    public ExceptionQuery setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ExceptionQuery{" + "id=" + id + "\n" + "}";
    }

}