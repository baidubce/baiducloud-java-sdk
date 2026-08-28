package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisWordsResult {
    /**
     * location
     */
    private DocAnalysisLocation location;

    /**
     * 识别结果中整行的内容
     */
    private String words;

    /**
     * 整行内容的类型，print：印刷，handwriting：手写
     */
    private String type;

    /**
     * 单字符结果数组，公式整体作为一个单字，result_type=small时返回
     */
    private List<DocAnalysisChar> chars;

    public DocAnalysisWordsResult setLocation(DocAnalysisLocation location) {
        this.location = location;
        return this;
    }

    public DocAnalysisLocation getLocation() {
        return this.location;
    }

    public DocAnalysisWordsResult setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public DocAnalysisWordsResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public DocAnalysisWordsResult setChars(List<DocAnalysisChar> chars) {
        this.chars = chars;
        return this;
    }

    public List<DocAnalysisChar> getChars() {
        return this.chars;
    }

    @Override
    public String toString() {
        return "DocAnalysisWordsResult{" + "location=" + location + "\n" + "words=" + words + "\n" + "type=" + type + "\n" + "chars=" + chars + "\n" + "}";
    }

}