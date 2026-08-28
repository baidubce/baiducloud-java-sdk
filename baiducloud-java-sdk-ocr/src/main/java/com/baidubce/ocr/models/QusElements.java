package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QusElements {
    /**
     * 题目文本信息，当scene_type=paper时输出
     */
    @JsonProperty("question_words")
    private String questionWords;

    /**
     * 选项文本信息，当qus_type为选择题时有值
     */
    private List<String> choices;

    /**
     * 题目类型，当scene_type=paper时输出
     */
    @JsonProperty("qus_type")
    private String qusType;

    /**
     * 手写作答信息
     */
    @JsonProperty("answer_words")
    private List<String> answerWords;

    public QusElements setQuestionWords(String questionWords) {
        this.questionWords = questionWords;
        return this;
    }

    public String getQuestionWords() {
        return this.questionWords;
    }

    public QusElements setChoices(List<String> choices) {
        this.choices = choices;
        return this;
    }

    public List<String> getChoices() {
        return this.choices;
    }

    public QusElements setQusType(String qusType) {
        this.qusType = qusType;
        return this;
    }

    public String getQusType() {
        return this.qusType;
    }

    public QusElements setAnswerWords(List<String> answerWords) {
        this.answerWords = answerWords;
        return this;
    }

    public List<String> getAnswerWords() {
        return this.answerWords;
    }

    @Override
    public String toString() {
        return "QusElements{" + "questionWords=" + questionWords + "\n" + "choices=" + choices + "\n" + "qusType=" + qusType + "\n" + "answerWords=" + answerWords + "\n" + "}";
    }

}