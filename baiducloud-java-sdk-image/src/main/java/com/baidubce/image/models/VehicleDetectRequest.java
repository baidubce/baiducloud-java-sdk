package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleDetectRequest extends BaseBceRequest {

    /**
    * 图像数据，Base64编码字符串，不超过4M。最短边至少50px，最长边最多4096px。支持图片格式：jpg，bmp，png。 注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少50px，最长边最大4096px，支持jpg/png/bmp格式，当image字段存在时url字段失效。
    */
    private String url;

    /**
    * 只统计该矩形区域内的车辆数，缺省时为全图统计。  逗号分隔，如'x1,y1,x2,y2,x3,y3...xn,yn'，按顺序依次给出每个顶点的x、y坐标（默认尾点和首点相连），形成闭合矩形区域。
    * 服务会做范围（顶点左边需在图像范围内）及个数校验（数组长度必须为偶数，且为4个顶点）；目前只支持单个矩形区域。坐标取值不能超过图像宽度和高度，比如1280的宽度，坐标值最大到1279。
    */
    private String area;

    public String getImage() {
        return image;
    }

    public VehicleDetectRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public VehicleDetectRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getArea() {
        return area;
    }

    public VehicleDetectRequest setArea(String area) {
        this.area = area;
        return this;
    }

}
