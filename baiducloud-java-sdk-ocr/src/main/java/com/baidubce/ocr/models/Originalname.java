package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Originalname {
    /**
     * 曾用名
     */
    private String name;

    /**
     * 变更日期
     */
    private String changedate;

    public Originalname setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Originalname setChangedate(String changedate) {
        this.changedate = changedate;
        return this;
    }

    public String getChangedate() {
        return this.changedate;
    }

    @Override
    public String toString() {
        return "Originalname{" + "name=" + name + "\n" + "changedate=" + changedate + "\n" + "}";
    }

}