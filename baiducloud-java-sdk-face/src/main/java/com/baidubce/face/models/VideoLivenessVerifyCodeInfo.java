package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoLivenessVerifyCodeInfo {
    /**
     * 生成的验证码
     */
    private String create;

    /**
     * 验证码的语音识别结果
     */
    private String identify;

    /**
     * 验证码相似度，取值0~1，1代表完全一致，0代表完全不一致，推荐阈值0.75
     */
    private Float similarity;

    public VideoLivenessVerifyCodeInfo setCreate(String create) {
        this.create = create;
        return this;
    }

    public String getCreate() {
        return this.create;
    }

    public VideoLivenessVerifyCodeInfo setIdentify(String identify) {
        this.identify = identify;
        return this;
    }

    public String getIdentify() {
        return this.identify;
    }

    public VideoLivenessVerifyCodeInfo setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    public Float getSimilarity() {
        return this.similarity;
    }

    @Override
    public String toString() {
        return "VideoLivenessVerifyCodeInfo{" + "create=" + create + "\n" + "identify=" + identify + "\n" + "similarity=" + similarity + "\n" + "}";
    }

}