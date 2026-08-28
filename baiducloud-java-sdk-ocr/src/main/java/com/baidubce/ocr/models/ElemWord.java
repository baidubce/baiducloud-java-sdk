package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElemWord {
    /**
     * wordLocation
     */
    @JsonProperty("word_location")
    private WordLocation wordLocation;

    /**
     * 按行返回文字属性信息
     */
    @JsonProperty("word_type")
    private String wordType;

    /**
     * 按行返回文字信息
     */
    private String word;

    public ElemWord setWordLocation(WordLocation wordLocation) {
        this.wordLocation = wordLocation;
        return this;
    }

    public WordLocation getWordLocation() {
        return this.wordLocation;
    }

    public ElemWord setWordType(String wordType) {
        this.wordType = wordType;
        return this;
    }

    public String getWordType() {
        return this.wordType;
    }

    public ElemWord setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public String toString() {
        return "ElemWord{" + "wordLocation=" + wordLocation + "\n" + "wordType=" + wordType + "\n" + "word=" + word + "\n" + "}";
    }

}