package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LongDivision {
    /**
     * location
     */
    private DocAnalysisLocation location;

    /**
     * 按行输出手写竖式内文字结果
     */
    private List<Word> words;

    public LongDivision setLocation(DocAnalysisLocation location) {
        this.location = location;
        return this;
    }

    public DocAnalysisLocation getLocation() {
        return this.location;
    }

    public LongDivision setWords(List<Word> words) {
        this.words = words;
        return this;
    }

    public List<Word> getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "LongDivision{" + "location=" + location + "\n" + "words=" + words + "\n" + "}";
    }

}