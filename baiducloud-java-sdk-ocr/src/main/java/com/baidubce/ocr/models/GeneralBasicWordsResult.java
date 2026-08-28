package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralBasicWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * probability
     */
    private GeneralBasicProbability probability;

    public GeneralBasicWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public GeneralBasicWordsResult setProbability(GeneralBasicProbability probability) {
        this.probability = probability;
        return this;
    }

    public GeneralBasicProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "GeneralBasicWordsResult{" + "words=" + words + "\n" + "probability=" + probability + "\n" + "}";
    }

}