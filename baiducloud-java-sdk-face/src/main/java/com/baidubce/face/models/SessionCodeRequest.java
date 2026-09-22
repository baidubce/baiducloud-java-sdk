package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionCodeRequest extends BaseBceRequest {

    /**
    * 0：下发语音验证码和唇语验证码，默认类型；1：下发视频动作活体验证码
    */
    private String type;

    /**
    * 当type=0时，生成语音和唇语验证码的最小长度：最小3，最大6，默认3；当type=1时，生成视频动作活体验证码的最小长度，最小1，最大3，默认3
    */
    @JsonProperty("min_code_length")
    private String minCodeLength;

    /**
    * 当type=0时，生成语音和唇语验证码的最大长度，最小3，最大6，默认3；当type=1时，生成视频动作活体验证码的最大长度：最小1，最大3，默认3
    */
    @JsonProperty("max_code_length")
    private String maxCodeLength;

    public String getType() {
        return type;
    }

    public SessionCodeRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getMinCodeLength() {
        return minCodeLength;
    }

    public SessionCodeRequest setMinCodeLength(String minCodeLength) {
        this.minCodeLength = minCodeLength;
        return this;
    }

    public String getMaxCodeLength() {
        return maxCodeLength;
    }

    public SessionCodeRequest setMaxCodeLength(String maxCodeLength) {
        this.maxCodeLength = maxCodeLength;
        return this;
    }

}
