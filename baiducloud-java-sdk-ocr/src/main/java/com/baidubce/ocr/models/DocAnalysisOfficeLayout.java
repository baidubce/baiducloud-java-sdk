package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeLayout {
    /**
     * 版面分析的标签结果。table、figure、text、title、contents、seal、table_title、figure_title、doc_title
     */
    private String layout;

    /**
     * 当前版式检测框的概率大小
     */
    @JsonProperty("layout_prob")
    private Double layoutProb;

    /**
     * 文档版面信息标签的位置，四个顶点
     */
    @JsonProperty("layout_location")
    private List<DocAnalysisOfficePoint> layoutLocation;

    /**
     * 文档版面信息中的文本在results结果中的位置
     */
    @JsonProperty("layout_idx")
    private List<Integer> layoutIdx;

    public DocAnalysisOfficeLayout setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    public String getLayout() {
        return this.layout;
    }

    public DocAnalysisOfficeLayout setLayoutProb(Double layoutProb) {
        this.layoutProb = layoutProb;
        return this;
    }

    public Double getLayoutProb() {
        return this.layoutProb;
    }

    public DocAnalysisOfficeLayout setLayoutLocation(List<DocAnalysisOfficePoint> layoutLocation) {
        this.layoutLocation = layoutLocation;
        return this;
    }

    public List<DocAnalysisOfficePoint> getLayoutLocation() {
        return this.layoutLocation;
    }

    public DocAnalysisOfficeLayout setLayoutIdx(List<Integer> layoutIdx) {
        this.layoutIdx = layoutIdx;
        return this;
    }

    public List<Integer> getLayoutIdx() {
        return this.layoutIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeLayout{" + "layout=" + layout + "\n" + "layoutProb=" + layoutProb + "\n" + "layoutLocation=" + layoutLocation + "\n" + "layoutIdx=" + layoutIdx
                + "\n" + "}";
    }

}