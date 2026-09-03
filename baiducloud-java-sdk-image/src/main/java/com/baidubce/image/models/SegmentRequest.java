package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SegmentRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过10M，最短边至少128px，最长边最大3000px，支持JPG、JPEG、PNG、WEBP、BMP格式。<br/>优先级：image >
    * url，当image字段存在时url字段失效。<br/>注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过10M，最短边至少128px，最长边最大3000px，支持JPG、JPEG、PNG、WEBP、BMP格式。<br/>优先级：image > url，当image字段存在时url字段失效
    */
    private String url;

    /**
    * 选择分割抠图的方式。<br/>auto：自动检测画面中的主体进行抠图；<br/>control：手动框选主体进行抠图，需输入主体位置外框。默认为auto
    */
    private String method;

    /**
    * 指定返回的图像形式。<br/>rgba：返回抠出主体、背景透明的四通道PNG图；<br/>mask：返回单通道mask图（白色代表主体前景，黑色代表背景）。默认为rgba
    */
    @JsonProperty("return_form")
    private String returnForm;

    /**
    * 是否对边缘进行平滑处理。<br/>false：不对边缘平滑处理；<br/>true：对边缘平滑处理。默认值为true
    */
    @JsonProperty("refine_mask")
    private Boolean refineMask;

    /**
    * 所选择主体的位置信息数组，以boxes矩形坐标表示，当method参数选择\"control\"时必填。输入矩形框左上角和右下角的坐标信息[[[x1,y1],[x2,y2]]]，支持输入多个矩形框同时分割多个主体，[ [[x1,y1], [x2,y2]], [[x3,y3], [x4,y4]]
    * ]，建议矩形框完整框住主体。<br/>注意：矩形框不能与图片边缘重合，且矩形框尺寸需大于10×10，即：0<x1<x2<width，0<y1<y2<height，x2-x1≥10px，y2-y1≥10px
    */
    private String position;

    public String getImage() {
        return image;
    }

    public SegmentRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SegmentRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public SegmentRequest setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getReturnForm() {
        return returnForm;
    }

    public SegmentRequest setReturnForm(String returnForm) {
        this.returnForm = returnForm;
        return this;
    }

    public Boolean getRefineMask() {
        return refineMask;
    }

    public SegmentRequest setRefineMask(Boolean refineMask) {
        this.refineMask = refineMask;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public SegmentRequest setPosition(String position) {
        this.position = position;
        return this;
    }

}
