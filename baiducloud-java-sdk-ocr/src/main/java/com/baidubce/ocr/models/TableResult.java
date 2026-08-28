package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableResult {
    /**
     * 单个表格位置，四角点的x,y坐标
     */
    @JsonProperty("table_location")
    private List<DocAnalysisOfficePoint> tableLocation;

    /**
     * 表头信息
     */
    private List<TableHeader> header;

    /**
     * 单元格信息
     */
    private List<TableBody> body;

    /**
     * 表尾信息
     */
    private List<TableFooter> footer;

    public TableResult setTableLocation(List<DocAnalysisOfficePoint> tableLocation) {
        this.tableLocation = tableLocation;
        return this;
    }

    public List<DocAnalysisOfficePoint> getTableLocation() {
        return this.tableLocation;
    }

    public TableResult setHeader(List<TableHeader> header) {
        this.header = header;
        return this;
    }

    public List<TableHeader> getHeader() {
        return this.header;
    }

    public TableResult setBody(List<TableBody> body) {
        this.body = body;
        return this;
    }

    public List<TableBody> getBody() {
        return this.body;
    }

    public TableResult setFooter(List<TableFooter> footer) {
        this.footer = footer;
        return this;
    }

    public List<TableFooter> getFooter() {
        return this.footer;
    }

    @Override
    public String toString() {
        return "TableResult{" + "tableLocation=" + tableLocation + "\n" + "header=" + header + "\n" + "body=" + body + "\n" + "footer=" + footer + "\n" + "}";
    }

}