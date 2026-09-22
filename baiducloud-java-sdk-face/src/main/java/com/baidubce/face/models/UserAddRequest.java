package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAddRequest extends BaseBceRequest {

    /**
    * 图片信息(总数据大小应小于10M，分辨率应小于1920*1080)，图片上传方式根据image_type来判断。 注：组内每个uid下的人脸图片数目上限为20张
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 用户组id，标识一组用户（由数字、字母、下划线组成），长度限制48B。产品建议：根据您的业务需求，可以将需要注册的用户，按照业务划分，分配到不同的group下，例如按照会员手机尾号作为groupid，用于刷脸支付、会员计费消费等，这样可以尽可能控制每个group下的用户数与人脸数，提升检索的准确率
    */
    @JsonProperty("group_id")
    private String groupId;

    /**
    * 用户ID，由数字、字母、下划线组成，长度限制48B
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

    /**
    * 人脸检测排序类型
    */
    @JsonProperty("face_sort_type")
    private Integer faceSortType;

    public String getImage() {
        return image;
    }

    public UserAddRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public UserAddRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public UserAddRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserAddRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public UserAddRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public UserAddRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public UserAddRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public UserAddRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

    public String getActionType() {
        return actionType;
    }

    public UserAddRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public Integer getFaceSortType() {
        return faceSortType;
    }

    public UserAddRequest setFaceSortType(Integer faceSortType) {
        this.faceSortType = faceSortType;
        return this;
    }

}
