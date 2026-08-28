package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructStructInfo {
    /**
     * key 文字行的信息
     */
    private List<SmartStructGroup> group;

    public SmartStructStructInfo setGroup(List<SmartStructGroup> group) {
        this.group = group;
        return this;
    }

    public List<SmartStructGroup> getGroup() {
        return this.group;
    }

    @Override
    public String toString() {
        return "SmartStructStructInfo{" + "group=" + group + "\n" + "}";
    }

}