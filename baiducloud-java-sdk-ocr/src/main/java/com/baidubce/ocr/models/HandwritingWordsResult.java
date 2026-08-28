package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingWordsResult {
    /**
     * location
     */
    private HandWritingLocation location;

    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * 单字符结果，当 recognize_granularity=small 时返回该字段
     */
    private List<HandwritingChar> chars;

    /**
     * probability
     */
    private HandWritingProbability probability;

    public HandwritingWordsResult setLocation(HandWritingLocation location) {
        this.location = location;
        return this;
    }

    public HandWritingLocation getLocation() {
        return this.location;
    }

    public HandwritingWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public HandwritingWordsResult setChars(List<HandwritingChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<HandwritingChar> getChars() {
        return this.chars;
    }

    public HandwritingWordsResult setProbability(HandWritingProbability probability) {
        this.probability = probability;
        return this;
    }

    public HandWritingProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "HandwritingWordsResult{" + "location=" + location + "\n" + "words=" + words + "\n" + "chars=" + chars + "\n" + "probability=" + probability + "\n" + "}";
    }

}