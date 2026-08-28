package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocAnalysisOfficeSecIdx {
    /**
     * 每个属性下包含的文本行id序号
     */
    private List<Double> idx;

    /**
     * 当attribute=section时返回，表示section中包含的9个模块的返回顺序号id
     */
    @JsonProperty("para_idx")
    private List<Double> paraIdx;

    /**
     * 当attribute=section时返回，表示所属网格的行的id
     */
    @JsonProperty("row_idx")
    private List<Double> rowIdx;

    /**
     * 当attribute=section时返回，表示所属网格的列的id
     */
    @JsonProperty("col_idx")
    private List<Double> colIdx;

    public DocAnalysisOfficeSecIdx setIdx(List<Double> idx) {
        this.idx = idx;
        return this;
    }

    public List<Double> getIdx() {
        return this.idx;
    }

    public DocAnalysisOfficeSecIdx setParaIdx(List<Double> paraIdx) {
        this.paraIdx = paraIdx;
        return this;
    }

    public List<Double> getParaIdx() {
        return this.paraIdx;
    }

    public DocAnalysisOfficeSecIdx setRowIdx(List<Double> rowIdx) {
        this.rowIdx = rowIdx;
        return this;
    }

    public List<Double> getRowIdx() {
        return this.rowIdx;
    }

    public DocAnalysisOfficeSecIdx setColIdx(List<Double> colIdx) {
        this.colIdx = colIdx;
        return this;
    }

    public List<Double> getColIdx() {
        return this.colIdx;
    }

    @Override
    public String toString() {
        return "DocAnalysisOfficeSecIdx{" + "idx=" + idx + "\n" + "paraIdx=" + paraIdx + "\n" + "rowIdx=" + rowIdx + "\n" + "colIdx=" + colIdx + "\n" + "}";
    }

}