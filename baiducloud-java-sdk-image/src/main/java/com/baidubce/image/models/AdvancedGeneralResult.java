package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedGeneralResult {
    /**
     * 图片中的物体或场景名称
     */
    private String keyword;

    /**
     * 置信度，0-1
     */
    private Float score;

    /**
     * 识别结果的上层类目
     */
    private String root;

    /**
     * baikeInfo
     */
    @JsonProperty("baike_info")
    private BaikeInfo baikeInfo;

    public AdvancedGeneralResult setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public AdvancedGeneralResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public AdvancedGeneralResult setRoot(String root) {
        this.root = root;
        return this;
    }

    public String getRoot() {
        return this.root;
    }

    public AdvancedGeneralResult setBaikeInfo(BaikeInfo baikeInfo) {
        this.baikeInfo = baikeInfo;
        return this;
    }

    public BaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Override
    public String toString() {
        return "AdvancedGeneralResult{" + "keyword=" + keyword + "\n" + "score=" + score + "\n" + "root=" + root + "\n" + "baikeInfo=" + baikeInfo + "\n" + "}";
    }

}