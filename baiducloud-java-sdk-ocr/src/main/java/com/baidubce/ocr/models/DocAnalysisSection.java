package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisSection {
    /**
     * 版面分析的属性标签结果，栏:section，页眉:header，页脚:footer，页码:number，脚注:footnote
     */
    private String attribute;

    /**
     * attriLocation
     */
    @JsonProperty("attri_location")
    private DocAnalysisPolyLocation attriLocation;

    /**
     * secIdx
     */
    @JsonProperty("sec_idx")
    private DocAnalysisSecIdx secIdx;

    public DocAnalysisSection setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public DocAnalysisSection setAttriLocation(DocAnalysisPolyLocation attriLocation) {
        this.attriLocation = attriLocation;
        return this;
    }

    public DocAnalysisPolyLocation getAttriLocation() {
        return this.attriLocation;
    }

    public DocAnalysisSection setSecIdx(DocAnalysisSecIdx secIdx) {
        this.secIdx = secIdx;
        return this;
    }

    public DocAnalysisSecIdx getSecIdx() {
        return this.secIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisSection{" + "attribute=" + attribute + "\n" + "attriLocation=" + attriLocation + "\n" + "secIdx=" + secIdx + "\n" + "}";
    }

}