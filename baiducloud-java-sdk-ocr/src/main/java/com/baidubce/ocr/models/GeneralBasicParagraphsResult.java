package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralBasicParagraphsResult {
    /**
     * 一个段落包含的行序号，当 paragraph=true 时返回该字段
     */
    @JsonProperty("words_result_idx")
    private List<Integer> wordsResultIdx;

    public GeneralBasicParagraphsResult setWordsResultIdx(List<Integer> wordsResultIdx) {
        this.wordsResultIdx = wordsResultIdx;
        return this;
    }

    public List<Integer> getWordsResultIdx() {
        return this.wordsResultIdx;
    }

    @Override
    public String toString() {
        return "GeneralBasicParagraphsResult{" + "wordsResultIdx=" + wordsResultIdx + "\n" + "}";
    }

}