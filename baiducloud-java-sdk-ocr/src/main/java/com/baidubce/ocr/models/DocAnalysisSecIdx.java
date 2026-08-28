package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisSecIdx {
    /**
     * sections返回参数中的5个版面属性里，每个属性下包含的文本行id序号
     */
    private List<Double> idx;

    /**
     * 当且仅当attribute=section时才会返回。表示，返回参数中的「栏：section」里面，所包含的表格、图、段落文本、标题、目录等5个模块返回的顺序号id
     */
    @JsonProperty("para_idx")
    private List<Double> paraIdx;

    /**
     * 当且仅当attribute=section时才会返回。表示，将所有栏表示成M×N的网格，所属网格的行的id
     */
    @JsonProperty("row_idx")
    private List<Double> rowIdx;

    /**
     * 当且仅当attribute=section时才会返回。表示，将所有栏表示成M×N的网格，所属网格的列的id
     */
    @JsonProperty("col_idx")
    private List<Double> colIdx;

    public DocAnalysisSecIdx setIdx(List<Double> idx) {
        this.idx = idx;
        return this;
    }

    public List<Double> getIdx() {
        return this.idx;
    }

    public DocAnalysisSecIdx setParaIdx(List<Double> paraIdx) {
        this.paraIdx = paraIdx;
        return this;
    }

    public List<Double> getParaIdx() {
        return this.paraIdx;
    }

    public DocAnalysisSecIdx setRowIdx(List<Double> rowIdx) {
        this.rowIdx = rowIdx;
        return this;
    }

    public List<Double> getRowIdx() {
        return this.rowIdx;
    }

    public DocAnalysisSecIdx setColIdx(List<Double> colIdx) {
        this.colIdx = colIdx;
        return this;
    }

    public List<Double> getColIdx() {
        return this.colIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisSecIdx{" + "idx=" + idx + "\n" + "paraIdx=" + paraIdx + "\n" + "rowIdx=" + rowIdx + "\n" + "colIdx=" + colIdx + "\n" + "}";
    }

}