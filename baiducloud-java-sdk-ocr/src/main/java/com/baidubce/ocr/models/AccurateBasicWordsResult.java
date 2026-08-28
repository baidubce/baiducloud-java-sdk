package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccurateBasicWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * probability
     */
    private AccurateBasicProbability probability;

    public AccurateBasicWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public AccurateBasicWordsResult setProbability(AccurateBasicProbability probability) {
        this.probability = probability;
        return this;
    }

    public AccurateBasicProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "AccurateBasicWordsResult{" + "words=" + words + "\n" + "probability=" + probability + "\n" + "}";
    }

}