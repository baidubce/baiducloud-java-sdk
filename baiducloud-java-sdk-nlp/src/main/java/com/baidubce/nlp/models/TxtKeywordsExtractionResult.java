package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtKeywordsExtractionResult {
    /**
     * 关键词的置信度，数值范围[0,1]
     */
    private Float score;

    /**
     * 提取出的关键词
     */
    private String word;

    public TxtKeywordsExtractionResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public TxtKeywordsExtractionResult setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "TxtKeywordsExtractionResult{" + "score=" + score + "\n" + "word=" + word + "\n" + "}";
    }

}