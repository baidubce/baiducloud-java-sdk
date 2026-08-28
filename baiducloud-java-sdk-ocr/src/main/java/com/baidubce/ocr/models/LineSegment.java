package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineSegment {
    /**
     * 对应lines里的lineId
     */
    private String lineId;

    /**
     * 该句在行中的起始位置标识
     */
    private Integer startIndex;

    /**
     * 该句在行中的结束位置标识
     */
    private Integer endIndex;

    public LineSegment setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getLineId() {
        return this.lineId;
    }

    public LineSegment setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }

    public LineSegment setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }

    @Override
    public String toString() {
        return "LineSegment{" + "lineId=" + lineId + "\n" + "startIndex=" + startIndex + "\n" + "endIndex=" + endIndex + "\n" + "}";
    }

}