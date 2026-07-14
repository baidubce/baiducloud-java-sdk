package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DagModel {
    /**
     * DAG 的唯一标识符
     */
    private String id;

    public DagModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DagModel{" + "id=" + id + "\n" + "}";
    }

}