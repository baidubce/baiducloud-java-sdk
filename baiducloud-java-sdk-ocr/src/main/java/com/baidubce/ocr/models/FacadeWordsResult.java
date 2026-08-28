package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacadeWordsResult {
    /**
     * 识别结果字符串
     */
    private String words;

    /**
     * words返回为主门脸名称的置信度评分
     */
    private Float score;

    /**
     * 门脸副标题等周边描述
     */
    private String brief;

    public FacadeWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public FacadeWordsResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public FacadeWordsResult setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    public String getBrief() {
        return this.brief;
    }

    @Override
    public String toString() {
        return "FacadeWordsResult{" + "words=" + words + "\n" + "score=" + score + "\n" + "brief=" + brief + "\n" + "}";
    }

}