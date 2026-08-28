package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HandwritingGetEssayResult {
    /**
     * 识别粒度，控制坐标返回，可选值：line：行级坐标返回；word：行级坐标+字级别坐标返回；none：不返回坐标
     */
    @JsonProperty("recognize_granularity")
    private String recognizeGranularity;

    /**
     * 识别的学生班级信息
     */
    private String grade;

    /**
     * 识别的学生学号信息
     */
    private String ids;

    /**
     * 识别的学生姓名信息
     */
    private String name;

    /**
     * essayOverall
     */
    private HandwritingGetEssayOverall essayOverall;

    /**
     * title
     */
    private Title title;

    /**
     * content
     */
    private HandwritingCompositionGetResultContent content;

    public HandwritingGetEssayResult setRecognizeGranularity(String recognizeGranularity) {
        this.recognizeGranularity = recognizeGranularity;
        return this;
    }

    public String getRecognizeGranularity() {
        return this.recognizeGranularity;
    }

    public HandwritingGetEssayResult setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public String getGrade() {
        return this.grade;
    }

    public HandwritingGetEssayResult setIds(String ids) {
        this.ids = ids;
        return this;
    }

    public String getIds() {
        return this.ids;
    }

    public HandwritingGetEssayResult setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public HandwritingGetEssayResult setEssayOverall(HandwritingGetEssayOverall essayOverall) {
        this.essayOverall = essayOverall;
        return this;
    }

    public HandwritingGetEssayOverall getEssayOverall() {
        return this.essayOverall;
    }

    public HandwritingGetEssayResult setTitle(Title title) {
        this.title = title;
        return this;
    }

    public Title getTitle() {
        return this.title;
    }

    public HandwritingGetEssayResult setContent(HandwritingCompositionGetResultContent content) {
        this.content = content;
        return this;
    }

    public HandwritingCompositionGetResultContent getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "HandwritingGetEssayResult{" + "recognizeGranularity=" + recognizeGranularity + "\n" + "grade=" + grade + "\n" + "ids=" + ids + "\n" + "name=" + name + "\n"
                + "essayOverall=" + essayOverall + "\n" + "title=" + title + "\n" + "content=" + content + "\n" + "}";
    }

}