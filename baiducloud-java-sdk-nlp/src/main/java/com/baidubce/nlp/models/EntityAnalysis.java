package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityAnalysis {
    /**
     * 识别出的实体
     */
    private String mention;

    /**
     * category
     */
    private Category category;

    /**
     * 实体关联至该百科内容的置信度
     */
    private Double confidence;

    /**
     * 实体的简介
     */
    private String desc;

    /**
     * 用于对关联结果进行标识，包括LINKED（正常关联）、NIL（无关联内容）
     */
    private String status;

    public EntityAnalysis setMention(String mention) {
        this.mention = mention;
        return this;
    }

    public String getMention() {
        return this.mention;
    }

    public EntityAnalysis setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Category getCategory() {
        return this.category;
    }

    public EntityAnalysis setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public Double getConfidence() {
        return this.confidence;
    }

    public EntityAnalysis setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public EntityAnalysis setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "EntityAnalysis{" + "mention=" + mention + "\n" + "category=" + category + "\n" + "confidence=" + confidence + "\n" + "desc=" + desc + "\n" + "status=" + status
                + "\n" + "}";
    }

}