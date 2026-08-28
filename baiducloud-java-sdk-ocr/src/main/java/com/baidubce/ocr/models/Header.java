package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Header {
    /**
     * 表头位置，四角点 x,y 坐标
     */
    private List<TablePoint> location;

    /**
     * 表头文字内容，按行拆分
     */
    private String words;

    public Header setLocation(List<TablePoint> location) {
        this.location = location;
        return this;
    }

    public List<TablePoint> getLocation() {
        return this.location;
    }

    public Header setWords(String words) {
        this.words = words;
        return this;
    }

    public String getWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "Header{" + "location=" + location + "\n" + "words=" + words + "\n" + "}";
    }

}