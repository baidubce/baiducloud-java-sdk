package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaResult {
    /**
     * 公式的位置信息，矩形框坐标数组
     */
    @JsonProperty("form_location")
    private List<DocAnalysisOfficePoint> formLocation;

    /**
     * 公式的内容信息，以Latex格式返回
     */
    @JsonProperty("form_words")
    private String formWords;

    public FormulaResult setFormLocation(List<DocAnalysisOfficePoint> formLocation) {
        this.formLocation = formLocation;
        return this;
    }

    public List<DocAnalysisOfficePoint> getFormLocation() {
        return this.formLocation;
    }

    public FormulaResult setFormWords(String formWords) {
        this.formWords = formWords;
        return this;
    }

    public String getFormWords() {
        return this.formWords;
    }

    @Override
    public String toString() {
        return "FormulaResult{" + "formLocation=" + formLocation + "\n" + "formWords=" + formWords + "\n" + "}";
    }

}