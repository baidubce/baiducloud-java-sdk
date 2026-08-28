package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeightNoteWordItem {
    /**
     * 字段识别结果
     */
    private String word;

    /**
     * 字段识别结果置信度，当请求参数probability=true时返回
     */
    private Object probability;

    public WeightNoteWordItem setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public WeightNoteWordItem setProbability(Object probability) {
        this.probability = probability;
        return this;
    }

    public Object getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "WeightNoteWordItem{" + "word=" + word + "\n" + "probability=" + probability + "\n" + "}";
    }

}