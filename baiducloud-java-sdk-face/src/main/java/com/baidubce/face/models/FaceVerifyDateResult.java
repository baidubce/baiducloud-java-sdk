package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyDateResult {
    /**
     * 认证状态字段 0：身份信息核验成功 1：身份信息无效，包含“身份证号与姓名不匹配、身份证号不存在、身份证有效期信息不匹配、身份证已挂失”4种情况 2： 公安网图片不存在或质量过低
     */
    @JsonProperty("verify_status")
    private Integer verifyStatus;

    /**
     * 仅在verify_status字段取值为0时返回，用于验证生活照与权威库人脸图是否为同一人，有正常分数时为[0~100]，推荐阈值80，超过即判断为同一人
     */
    @JsonProperty("verify_score")
    private Float verifyScore;

    public FaceVerifyDateResult setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }

    public Integer getVerifyStatus() {
        return this.verifyStatus;
    }

    public FaceVerifyDateResult setVerifyScore(Float verifyScore) {
        this.verifyScore = verifyScore;
        return this;
    }

    public Float getVerifyScore() {
        return this.verifyScore;
    }

    @Override
    public String toString() {
        return "FaceVerifyDateResult{" + "verifyStatus=" + verifyStatus + "\n" + "verifyScore=" + verifyScore + "\n" + "}";
    }

}