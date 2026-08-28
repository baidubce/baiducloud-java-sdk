package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisLayout {
    /**
     * 版面分析的标签结果。表格:table，图:figure，文本:text，标题:title，目录:contents
     */
    private String layout;

    /**
     * 文档版面信息标签的位置，四个顶点：左上，右上，右下，左下
     */
    @JsonProperty("layout_location")
    private List<DocAnalysisPoint> layoutLocation;

    /**
     * 文档版面信息中的文本在results结果中的位置
     */
    @JsonProperty("layout_idx")
    private List<Integer> layoutIdx;

    public DocAnalysisLayout setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    public String getLayout() {
        return this.layout;
    }

    public DocAnalysisLayout setLayoutLocation(List<DocAnalysisPoint> layoutLocation) {
        this.layoutLocation = layoutLocation;
        return this;
    }

    public List<DocAnalysisPoint> getLayoutLocation() {
        return this.layoutLocation;
    }

    public DocAnalysisLayout setLayoutIdx(List<Integer> layoutIdx) {
        this.layoutIdx = layoutIdx;
        return this;
    }

    public List<Integer> getLayoutIdx() {
        return this.layoutIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisLayout{" + "layout=" + layout + "\n" + "layoutLocation=" + layoutLocation + "\n" + "layoutIdx=" + layoutIdx + "\n" + "}";
    }

}