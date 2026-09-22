package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacePersonVerifyResult {
    /**
     * 与权威数据源对比的相似度可能性，用于验证人像照与权威数据源的底图是否为同一人，有正常分数时为[0~100]，推荐阈值80，超过即判断为同一人
     */
    private Float score;

    public FacePersonVerifyResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "FacePersonVerifyResult{" + "score=" + score + "\n" + "}";
    }

}