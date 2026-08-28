package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CodesResult {
    /**
     * 
     */
    private String type;

    /**
     * 条形码/二维码识别内容，目前仅支持输出中英文结果
     */
    private List<String> text;

    /**
     * location
     */
    private QRCodeLocation location;

    public CodesResult setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public CodesResult setText(List<String> text) {
        this.text = text;
        return this;
    }

    public List<String> getText() {
        return this.text;
    }

    public CodesResult setLocation(QRCodeLocation location) {
        this.location = location;
        return this;
    }

    public QRCodeLocation getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "CodesResult{" + "type=" + type + "\n" + "text=" + text + "\n" + "location=" + location + "\n" + "}";
    }

}