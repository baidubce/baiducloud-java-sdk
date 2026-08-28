package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisFormulaResult {
    /**
     * formLocation
     */
    @JsonProperty("form_location")
    private FormLocation formLocation;

    /**
     * 识别结果中公式的内容
     */
    @JsonProperty("form_words")
    private String formWords;

    public DocAnalysisFormulaResult setFormLocation(FormLocation formLocation) {
        this.formLocation = formLocation;
        return this;
    }

    public FormLocation getFormLocation() {
        return this.formLocation;
    }

    public DocAnalysisFormulaResult setFormWords(String formWords) {
        this.formWords = formWords;
        return this;
    }

    public String getFormWords() {
        return this.formWords;
    }

    @Override
    public String toString() {
        return "DocAnalysisFormulaResult{" + "formLocation=" + formLocation + "\n" + "formWords=" + formWords + "\n" + "}";
    }

}