package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumbersWordsResult {
    /**
     * location
     */
    private NumbersLocation location;

    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * 单字符结果，当 recognize_granularity=small 时返回该字段
     */
    private List<NumberChar> chars;

    public NumbersWordsResult setLocation(NumbersLocation location) {
        this.location = location;
        return this;
    }

    public NumbersLocation getLocation() {
        return this.location;
    }

    public NumbersWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public NumbersWordsResult setChars(List<NumberChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<NumberChar> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "NumbersWordsResult{" + "location=" + location + "\n" + "words=" + words + "\n" + "chars=" + chars + "\n" + "}";
    }

}