package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Body {
    /**
     * 单元格四角点x,y坐标
     */
    @JsonProperty("cell_location")
    private List<TablePoint> cellLocation;

    /**
     * 单元格行起始编号，横线编号从0开始
     */
    @JsonProperty("row_start")
    private Integer rowStart;

    /**
     * 单元格行终止编号
     */
    @JsonProperty("row_end")
    private Integer rowEnd;

    /**
     * 单元格列起始编号，竖线编号从0开始
     */
    @JsonProperty("col_start")
    private Integer colStart;

    /**
     * 单元格列终止编号
     */
    @JsonProperty("col_end")
    private Integer colEnd;

    /**
     * 单元格文字内容
     */
    private String words;

    /**
     * 单元格内文字内容，分行显示，当请求参数 cell_contents = true 时返回
     */
    private List<TableContent> contents;

    public Body setCellLocation(List<TablePoint> cellLocation) {
        this.cellLocation = cellLocation;
        return this;
    }

    public List<TablePoint> getCellLocation() {
        return this.cellLocation;
    }

    public Body setRowStart(Integer rowStart) {
        this.rowStart = rowStart;
        return this;
    }

    public Integer getRowStart() {
        return this.rowStart;
    }

    public Body setRowEnd(Integer rowEnd) {
        this.rowEnd = rowEnd;
        return this;
    }

    public Integer getRowEnd() {
        return this.rowEnd;
    }

    public Body setColStart(Integer colStart) {
        this.colStart = colStart;
        return this;
    }

    public Integer getColStart() {
        return this.colStart;
    }

    public Body setColEnd(Integer colEnd) {
        this.colEnd = colEnd;
        return this;
    }

    public Integer getColEnd() {
        return this.colEnd;
    }

    public Body setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    public Body setContents(List<TableContent> contents) {
        this.contents = contents;
        return this;
    }

    public List<TableContent> getContents() {
        return this.contents;
    }

    @Override
    public String toString() {
        return "Body{" + "cellLocation=" + cellLocation + "\n" + "rowStart=" + rowStart + "\n" + "rowEnd=" + rowEnd + "\n" + "colStart=" + colStart + "\n" + "colEnd=" + colEnd
                + "\n" + "words=" + words + "\n" + "contents=" + contents + "\n" + "}";
    }

}