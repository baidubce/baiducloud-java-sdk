package com.baidubce.dns.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Line {
    /**
     * 线路组id。
     */
    private String id;

    /**
     * 线路组名称。
     */
    private String name;

    /**
     * 线路名称，取值见[LineName](#LineName)。
     */
    private List<String> lines;

    /**
     * 关联的zone数量。
     */
    private Integer relatedZoneCount;

    /**
     * 关联的解析记录数量。
     */
    private Integer relatedRecordCount;

    public Line setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Line setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Line setLines(List<String> lines) {
        this.lines = lines;
        return this;
    }

    public List<String> getLines() {
        return this.lines;
    }

    public Line setRelatedZoneCount(Integer relatedZoneCount) {
        this.relatedZoneCount = relatedZoneCount;
        return this;
    }

    public Integer getRelatedZoneCount() {
        return this.relatedZoneCount;
    }

    public Line setRelatedRecordCount(Integer relatedRecordCount) {
        this.relatedRecordCount = relatedRecordCount;
        return this;
    }

    public Integer getRelatedRecordCount() {
        return this.relatedRecordCount;
    }

    @Override
    public String toString() {
        return "Line{" + "id=" + id + "\n" + "name=" + name + "\n" + "lines=" + lines + "\n" + "relatedZoneCount=" + relatedZoneCount + "\n" + "relatedRecordCount="
                + relatedRecordCount + "\n" + "}";
    }

}