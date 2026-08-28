package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisResult {
    /**
     * 文字属性（手写、印刷），handwriting手写，print印刷
     */
    @JsonProperty("words_type")
    private String wordsType;

    /**
     * words
     */
    private DocAnalysisWords words;

    /**
     * result_type=small时返回。单字符结果数组
     */
    private List<DocAnalysisChar> chars;

    public DocAnalysisResult setWordsType(String wordsType) {
        this.wordsType = wordsType;
        return this;
    }

    public String getWordsType() {
        return this.wordsType;
    }

    public DocAnalysisResult setWords(DocAnalysisWords words) {
        this.words = words;
        return this;
    }

    public DocAnalysisWords getWords() {
        return this.words;
    }

    public DocAnalysisResult setChars(List<DocAnalysisChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<DocAnalysisChar> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "DocAnalysisResult{" + "wordsType=" + wordsType + "\n" + "words=" + words + "\n" + "chars=" + chars + "\n" + "}";
    }

}