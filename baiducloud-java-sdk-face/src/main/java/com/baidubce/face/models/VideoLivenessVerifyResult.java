package com.baidubce.face.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoLivenessVerifyResult {
    /**
     * 活体检测的总体打分，范围[0,1]，分数越高则活体的概率越大
     */
    private Float score;

    /**
     * 返回的1-8张图片中合成图检测得分的最大值，范围[0,1]，分数越高则概率越大
     */
    private Float maxspoofing;

    /**
     * 返回的1-8张图片中合成图检测得分的中位数，范围[0,1]，分数越高则概率越大
     */
    @JsonProperty("spoofing_score")
    private Float spoofingScore;

    /**
     * thresholds
     */
    private VideoLivenessVerifyThresholds thresholds;

    /**
     * code
     */
    private VideoLivenessVerifyCodeInfo code;

    /**
     * 唇语识别结果，pass代表唇语验证通过，fail代表唇语验证未通过，当存在请求字段lip_identify字段值为COMMON或STRICT时返回
     */
    @JsonProperty("lip_language")
    private String lipLanguage;

    /**
     * 动作识别结果，pass代表动作验证通过，fail代表动作验证未通过，当存在请求字段type_identify字段值为action时返回
     */
    @JsonProperty("action_verify")
    private String actionVerify;

    /**
     * bestImage
     */
    @JsonProperty("best_image")
    private BestImage bestImage;

    /**
     * 返回1-8张抽取出来的图片信息
     */
    @JsonProperty("pic_list")
    private List<PicItem> picList;

    public VideoLivenessVerifyResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public Float getScore() {
        return this.score;
    }

    public VideoLivenessVerifyResult setMaxspoofing(Float maxspoofing) {
        this.maxspoofing = maxspoofing;
        return this;
    }

    public Float getMaxspoofing() {
        return this.maxspoofing;
    }

    public VideoLivenessVerifyResult setSpoofingScore(Float spoofingScore) {
        this.spoofingScore = spoofingScore;
        return this;
    }

    public Float getSpoofingScore() {
        return this.spoofingScore;
    }

    public VideoLivenessVerifyResult setThresholds(VideoLivenessVerifyThresholds thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public VideoLivenessVerifyThresholds getThresholds() {
        return this.thresholds;
    }

    public VideoLivenessVerifyResult setCode(VideoLivenessVerifyCodeInfo code) {
        this.code = code;
        return this;
    }

    public VideoLivenessVerifyCodeInfo getCode() {
        return this.code;
    }

    public VideoLivenessVerifyResult setLipLanguage(String lipLanguage) {
        this.lipLanguage = lipLanguage;
        return this;
    }

    public String getLipLanguage() {
        return this.lipLanguage;
    }

    public VideoLivenessVerifyResult setActionVerify(String actionVerify) {
        this.actionVerify = actionVerify;
        return this;
    }

    public String getActionVerify() {
        return this.actionVerify;
    }

    public VideoLivenessVerifyResult setBestImage(BestImage bestImage) {
        this.bestImage = bestImage;
        return this;
    }

    public BestImage getBestImage() {
        return this.bestImage;
    }

    public VideoLivenessVerifyResult setPicList(List<PicItem> picList) {
        this.picList = picList;
        return this;
    }

    public List<PicItem> getPicList() {
        return this.picList;
    }

    @Override
    public String toString() {
        return "VideoLivenessVerifyResult{" + "score=" + score + "\n" + "maxspoofing=" + maxspoofing + "\n" + "spoofingScore=" + spoofingScore + "\n" + "thresholds=" + thresholds
                + "\n" + "code=" + code + "\n" + "lipLanguage=" + lipLanguage + "\n" + "actionVerify=" + actionVerify + "\n" + "bestImage=" + bestImage + "\n" + "picList="
                + picList + "\n" + "}";
    }

}