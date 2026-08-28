package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionResult {
    /**
     * 批改结果，0：未批；1：正确；2：错误；3：未作答
     */
    private Integer correctResult;

    /**
     * 题目ID
     */
    private String questionId;

    /**
     * 题目内容，当前该字段不会返回内容
     */
    private String question;

    /**
     * 题目坐标，left_x：左上角X坐标；left_y：左上角Y坐标；right_x：右下角X坐标；right_y：右下角Y坐标
     */
    private List<Area> questionArea;

    /**
     * 是否完成批改。true：批改完成；false：批改未完成
     */
    private Boolean isFinish;

    /**
     * 题目序号，0：题目1；1：题目2；依此类推
     */
    private Integer seqence;

    /**
     * 
     */
    private Integer type;

    /**
     * 批改后的题目图片url
     */
    private String cropUrl;

    /**
     * 题目作答区批改结果数组，每个元素对应一个作答区
     */
    private List<Slot> slot;

    public QuestionResult setCorrectResult(Integer correctResult) {
        this.correctResult = correctResult;
        return this;
    }

    public Integer getCorrectResult() {
        return this.correctResult;
    }

    public QuestionResult setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    public String getQuestionId() {
        return this.questionId;
    }

    public QuestionResult setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getQuestion() {
        return this.question;
    }

    public QuestionResult setQuestionArea(List<Area> questionArea) {
        this.questionArea = questionArea;
        return this;
    }

    public List<Area> getQuestionArea() {
        return this.questionArea;
    }

    public QuestionResult setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
        return this;
    }

    public Boolean getIsFinish() {
        return this.isFinish;
    }

    public QuestionResult setSeqence(Integer seqence) {
        this.seqence = seqence;
        return this;
    }

    public Integer getSeqence() {
        return this.seqence;
    }

    public QuestionResult setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public QuestionResult setCropUrl(String cropUrl) {
        this.cropUrl = cropUrl;
        return this;
    }

    public String getCropUrl() {
        return this.cropUrl;
    }

    public QuestionResult setSlot(List<Slot> slot) {
        this.slot = slot;
        return this;
    }

    public List<Slot> getSlot() {
        return this.slot;
    }

    @Override
    public String toString() {
        return "QuestionResult{" + "correctResult=" + correctResult + "\n" + "questionId=" + questionId + "\n" + "question=" + question + "\n" + "questionArea=" + questionArea
                + "\n" + "isFinish=" + isFinish + "\n" + "seqence=" + seqence + "\n" + "type=" + type + "\n" + "cropUrl=" + cropUrl + "\n" + "slot=" + slot + "\n" + "}";
    }

}