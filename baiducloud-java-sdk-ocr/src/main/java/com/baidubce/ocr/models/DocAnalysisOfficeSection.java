package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeSection {
    /**
     * 版面分析的属性标签结果，section、header、footer、number、footnote
     */
    private String attribute;

    /**
     * 当前版面检测框的概率大小
     */
    @JsonProperty("sections_prob")
    private Double sectionsProb;

    /**
     * attriLocation
     */
    @JsonProperty("attri_location")
    private AttriLocation attriLocation;

    /**
     * secIdx
     */
    @JsonProperty("sec_idx")
    private DocAnalysisOfficeSecIdx secIdx;

    public DocAnalysisOfficeSection setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public DocAnalysisOfficeSection setSectionsProb(Double sectionsProb) {
        this.sectionsProb = sectionsProb;
        return this;
    }

    public Double getSectionsProb() {
        return this.sectionsProb;
    }

    public DocAnalysisOfficeSection setAttriLocation(AttriLocation attriLocation) {
        this.attriLocation = attriLocation;
        return this;
    }

    public AttriLocation getAttriLocation() {
        return this.attriLocation;
    }

    public DocAnalysisOfficeSection setSecIdx(DocAnalysisOfficeSecIdx secIdx) {
        this.secIdx = secIdx;
        return this;
    }

    public DocAnalysisOfficeSecIdx getSecIdx() {
        return this.secIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeSection{" + "attribute=" + attribute + "\n" + "sectionsProb=" + sectionsProb + "\n" + "attriLocation=" + attriLocation + "\n" + "secIdx=" + secIdx
                + "\n" + "}";
    }

}