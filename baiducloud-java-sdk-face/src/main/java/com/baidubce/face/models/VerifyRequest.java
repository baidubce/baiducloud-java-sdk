package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerifyRequest extends BaseBceRequest {

    /**
    * base64编码的视频数据（编码前建议先将视频进行转码，h.264编码，mp4封装），视频的base64编码不包含视频头，如
    * data:video/mp4;base64,；建议视频长度控制在01s-10s之间，视频大小建议在2M以内（视频大小强制要求在20M以内，推荐使用等分辨率压缩，压缩分辨率建议不小于640*480）视频大小分辨率建议限制在16~2032之间
    */
    @JsonProperty("video_base64")
    private String videoBase64;

    /**
    * voice为语音验证，action为视频动作活体验证，默认为voice （若您需要静默视频活体验证，此参数无需传入）
    */
    @JsonProperty("type_identify")
    private String typeIdentify;

    /**
    * 会话ID （当此字段为空时，为静默视频活体检测） 当使用语音验证及视频动作活体验证时，此字段必须传入，且获取验证码时要填入对应的验证类型
    * 。session_id获取方式参考随机校验码文档。<br/>注：session_id与type_identify参数的核验方式需保持一致，如：当type_identify参数传入action时，session_id也需为动作校验码
    */
    @JsonProperty("session_id")
    private String sessionId;

    /**
    * 辅助语音验证进行，用于判断验证码是否为当事人读出 取值COMMON/STRICT/OFF, COMMON代表使用唇语识别，STRICT代表使用唇语识别并使用更加严格的策略判断是否通过 OFF代表关闭唇语识别，默认OFF
    */
    @JsonProperty("lip_identify")
    private String lipIdentify;

    /**
    * 需要使用合成图功能时，此项传入spoofing；需要使用图片质量信息时，则传入quality；字段之间使用,号分隔
    */
    @JsonProperty("face_field")
    private String faceField;

    public String getVideoBase64() {
        return videoBase64;
    }

    public VerifyRequest setVideoBase64(String videoBase64) {
        this.videoBase64 = videoBase64;
        return this;
    }

    public String getTypeIdentify() {
        return typeIdentify;
    }

    public VerifyRequest setTypeIdentify(String typeIdentify) {
        this.typeIdentify = typeIdentify;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public VerifyRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getLipIdentify() {
        return lipIdentify;
    }

    public VerifyRequest setLipIdentify(String lipIdentify) {
        this.lipIdentify = lipIdentify;
        return this;
    }

    public String getFaceField() {
        return faceField;
    }

    public VerifyRequest setFaceField(String faceField) {
        this.faceField = faceField;
        return this;
    }

}
