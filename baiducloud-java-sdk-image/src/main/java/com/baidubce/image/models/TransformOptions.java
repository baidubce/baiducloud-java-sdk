package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransformOptions {
    /**
     * 图片自动矫正
     */
    @JsonProperty("auto_correct_angle")
    private Boolean autoCorrectAngle;

    /**
     * 结果图大小压缩
     */
    @JsonProperty("size_compress")
    private Boolean sizeCompress;

    public TransformOptions setAutoCorrectAngle(Boolean autoCorrectAngle) {
        this.autoCorrectAngle = autoCorrectAngle;
        return this;
    }

    public Boolean getAutoCorrectAngle() {
        return this.autoCorrectAngle;
    }

    public TransformOptions setSizeCompress(Boolean sizeCompress) {
        this.sizeCompress = sizeCompress;
        return this;
    }

    public Boolean getSizeCompress() {
        return this.sizeCompress;
    }

    @Override
    public String toString() {
        return "TransformOptions{" + "autoCorrectAngle=" + autoCorrectAngle + "\n" + "sizeCompress=" + sizeCompress + "\n" + "}";
    }

}