package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InpaintingRequest extends BaseBceRequest {

    /**
    * 被修复的图片base64编码后大小不超过10M（参考：原图大约为8M以内），最短边至少10px，最长边最大5000px，长宽比4：1以内。注意：图片的base64编码是不包含图片头的，如（data:image/jpg;base64, ）。优先级：image > url，当image字段存在时url字段失效
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过10M（参考：原图大约为8M以内），最短边至少10px，最长边最大5000px，长宽比4：1以内，支持jpg/png/bmp格式。当image字段存在时url字段失效
    */
    private String url;

    /**
    * 要去除的位置为规则矩形时，给出坐标信息，每个元素包含left、top、width、height，int类型。如：[{'width': 92, 'top': 25, 'height': 36, 'left': 543}]。注意：上传宽高、位置坐标参数要比图片实际宽高小
    */
    private String rectangle;

    public String getImage() {
        return image;
    }

    public InpaintingRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public InpaintingRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getRectangle() {
        return rectangle;
    }

    public InpaintingRequest setRectangle(String rectangle) {
        this.rectangle = rectangle;
        return this;
    }

}
