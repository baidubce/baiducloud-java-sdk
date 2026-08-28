package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TablePoint {
    /**
     * x坐标
     */
    private Integer x;

    /**
     * y坐标
     */
    private Integer y;

    public TablePoint setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public TablePoint setY(Integer y) {
        this.y = y;
        return this;
    }

    public Integer getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "TablePoint{" + "x=" + x + "\n" + "y=" + y + "\n" + "}";
    }

}