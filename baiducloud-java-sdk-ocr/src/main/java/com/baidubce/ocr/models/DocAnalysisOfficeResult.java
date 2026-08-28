package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeResult {
    /**
     * 文字属性（手写、印刷），handwriting 手写，print 印刷
     */
    @JsonProperty("words_type")
    private String wordsType;

    /**
     * words
     */
    private DocAnalysisOfficeWords words;

    /**
     * 单字符结果数组，result_type=small时返回
     */
    private List<DocAnalysisOfficeChar> chars;

    public DocAnalysisOfficeResult setWordsType(String wordsType) {
        this.wordsType = wordsType;
        return this;
    }

    public String getWordsType() {
        return this.wordsType;
    }

    public DocAnalysisOfficeResult setWords(DocAnalysisOfficeWords words) {
        this.words = words;
        return this;
    }

    public DocAnalysisOfficeWords getWords() {
        return this.words;
    }

    public DocAnalysisOfficeResult setChars(List<DocAnalysisOfficeChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<DocAnalysisOfficeChar> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeResult{" + "wordsType=" + wordsType + "\n" + "words=" + words + "\n" + "chars=" + chars + "\n" + "}";
    }

}