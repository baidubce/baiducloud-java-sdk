package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TablesResult {
    /**
     * 单个表格的四角点x,y坐标
     */
    @JsonProperty("table_location")
    private List<TablePoint> tableLocation;

    /**
     * 表头信息
     */
    private List<Header> header;

    /**
     * 单元格信息
     */
    private List<Body> body;

    /**
     * 表尾信息
     */
    private List<Footer> footer;

    public TablesResult setTableLocation(List<TablePoint> tableLocation) {
        this.tableLocation = tableLocation;
        return this;
    }

    public List<TablePoint> getTableLocation() {
        return this.tableLocation;
    }

    public TablesResult setHeader(List<Header> header) {
        this.header = header;
        return this;
    }

    public List<Header> getHeader() {
        return this.header;
    }

    public TablesResult setBody(List<Body> body) {
        this.body = body;
        return this;
    }

    public List<Body> getBody() {
        return this.body;
    }

    public TablesResult setFooter(List<Footer> footer) {
        this.footer = footer;
        return this;
    }

    public List<Footer> getFooter() {
        return this.footer;
    }

    @Override
    public String toString() {
        return "TablesResult{" + "tableLocation=" + tableLocation + "\n" + "header=" + header + "\n" + "body=" + body + "\n" + "footer=" + footer + "\n" + "}";
    }

}