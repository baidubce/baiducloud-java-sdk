package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Word {
    /**
     * 每行文字的内容
     */
    private String word;

    /**
     * wordsLocation
     */
    @JsonProperty("words_location")
    private WordsLocation wordsLocation;

    public Word setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public Word setWordsLocation(WordsLocation wordsLocation) {
        this.wordsLocation = wordsLocation;
        return this;
    }

    public WordsLocation getWordsLocation() {
        return this.wordsLocation;
    }

    @Override
    public String toString() {
        return "Word{" + "word=" + word + "\n" + "wordsLocation=" + wordsLocation + "\n" + "}";
    }

}