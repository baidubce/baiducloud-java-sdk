package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserUpdateRequest extends BaseBceRequest {

    /**
    * 图片信息(总数据大小应小于10M，分辨率应小于1920*1080)，图片上传方式根据image_type来判断
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 用户组ID，标识一组用户（由数字、字母、下划线组成），长度限制48B
    */
    @JsonProperty("group_id")
    private String groupId;

    /**
    * 用户ID（由数字、字母、下划线组成），长度限制48B
    */
    @JsonProperty("user_id")
    private String userId;

    /**
    * 用户资料，长度限制256B
    */
    @JsonProperty("user_info")
    private String userInfo;

    /**
    * 图片质量控制
    */
    @JsonProperty("quality_control")
    private String qualityControl;

    /**
    * 活体检测控制
    */
    @JsonProperty("liveness_control")
    private String livenessControl;

    /**
    * 合成图控制
    */
    @JsonProperty("spoofing_control")
    private String spoofingControl;

    /**
    * 操作方式
    */
    @JsonProperty("action_type")
    private String actionType;

    public String getImage() {
        return image;
    }

    public UserUpdateRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public UserUpdateRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public UserUpdateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserUpdateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public UserUpdateRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public UserUpdateRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public UserUpdateRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public UserUpdateRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

    public String getActionType() {
        return actionType;
    }

    public UserUpdateRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

}
