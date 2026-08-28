package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageInfo {
    /**
     * 图像四方向，0表示正向，1/2/3依次表示逆时针旋转90度，180度，270度
     */
    private String direction;

    public ImageInfo setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {
        return "ImageInfo{" + "direction=" + direction + "\n" + "}";
    }

}