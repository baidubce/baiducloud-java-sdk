package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hit {
    /**
     * 项目和日志集信息 如何非default项目，使用 项目$日志集名称 的格式，defualt项目只有日志集名称
     */
    private String index;

    /**
     * 日志集记录的ID  由offset和timestamp组成
     */
    private String id;

    /**
     * 得分，目前都是0
     */
    private Double score;

    /**
     * 排序字段，用于查找下一页, 目前都是单个元素
     */
    private List<String> sort;

    /**
     * 版本，目前都是1
     */
    private Integer version;

    /**
     * 日志集字段信息
     */
    private Map<String, List<Object>> fields;

    public Hit setIndex(String index) {
        this.index = index;
        return this;
    }

    public String getIndex() {
        return this.index;
    }

    public Hit setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Hit setScore(Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    public Hit setSort(List<String> sort) {
        this.sort = sort;
        return this;
    }

    public List<String> getSort() {
        return this.sort;
    }

    public Hit setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public Integer getVersion() {
        return this.version;
    }

    public Hit setFields(Map<String, List<Object>> fields) {
        this.fields = fields;
        return this;
    }

    public Map<String, List<Object>> getFields() {
        return this.fields;
    }

    @Override
    public String toString() {
        return "Hit{" + "index=" + index + "\n" + "id=" + id + "\n" + "score=" + score + "\n" + "sort=" + sort + "\n" + "version=" + version + "\n" + "fields=" + fields + "\n"
                + "}";
    }

}