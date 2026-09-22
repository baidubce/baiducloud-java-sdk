package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceDeleteRequest extends BaseBceRequest {

    /**
    * 用户ID（由数字、字母、下划线组成），长度限制48B
    */
    @JsonProperty("user_id")
    private String userId;

    /**
    * 用户组ID（由数字、字母、下划线组成） 长度限制48B，删除指定group_id中的user_id信息
    */
    @JsonProperty("group_id")
    private String groupId;

    /**
    * 需要删除的人脸图片token，（由数字、字母、下划线组成）长度限制64B
    */
    @JsonProperty("face_token")
    private String faceToken;

    /**
    * 请求标识码，随机数，唯一
    */
    @JsonProperty("log_id")
    private Long logId;

    public String getUserId() {
        return userId;
    }

    public FaceDeleteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public FaceDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getFaceToken() {
        return faceToken;
    }

    public FaceDeleteRequest setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public FaceDeleteRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

}
