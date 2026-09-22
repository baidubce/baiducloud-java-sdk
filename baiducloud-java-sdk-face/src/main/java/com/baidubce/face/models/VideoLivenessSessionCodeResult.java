package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoLivenessSessionCodeResult {
    /**
     * 随机校验码会话id，有效期5分钟，请提示用户在五分钟内完成全部操作；验证码使用过即失效，每次使用视频活体前请重新拉取验证码
     */
    @JsonProperty("session_id")
    private String sessionId;

    /**
     * 随机验证码，数字形式，1~6位数字；若为动作活体时，返回数字表示的动作对应关系为：0:眨眼  4:抬头  5:低头  7:左右转头（不区分先后顺序，分别向左和向右转头）
     */
    private String code;

    public VideoLivenessSessionCodeResult setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public VideoLivenessSessionCodeResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "VideoLivenessSessionCodeResult{" + "sessionId=" + sessionId + "\n" + "code=" + code + "\n" + "}";
    }

}