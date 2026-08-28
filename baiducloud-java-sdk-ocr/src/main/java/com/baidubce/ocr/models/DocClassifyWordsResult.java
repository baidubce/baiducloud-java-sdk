package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocClassifyWordsResult {
    /**
     * 类别信息
     */
    private String type;

    /**
     * 分类置信度
     */
    private Float probablity;

    /**
     * location
     */
    private DocClassifyLocation location;

    public DocClassifyWordsResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public DocClassifyWordsResult setProbablity(Float probablity) {
        this.probablity = probablity;
        return this;
    }

    public Float getProbablity() {
        return this.probablity;
    }

    public DocClassifyWordsResult setLocation(DocClassifyLocation location) {
        this.location = location;
        return this;
    }

    public DocClassifyLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "DocClassifyWordsResult{" + "type=" + type + "\n" + "probablity=" + probablity + "\n" + "location=" + location + "\n" + "}";
    }

}