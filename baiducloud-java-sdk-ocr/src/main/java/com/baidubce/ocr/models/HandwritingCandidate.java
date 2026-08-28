package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingCandidate {
    /**
     * 单字符识别结果的候选词文字
     */
    private String word;

    /**
     * 单字符识别结果的候选词置信度
     */
    private String prob;

    public HandwritingCandidate setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public HandwritingCandidate setProb(String prob) {
        this.prob = prob;
        return this;
    }

    public String getProb() {
        return this.prob;
    }

    @Override
    public String toString() {
        return "HandwritingCandidate{" + "word=" + word + "\n" + "prob=" + prob + "\n" + "}";
    }

}