package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceSearchRequest extends BaseBceRequest {

    /**
    * 图片信息，base64时编码后不超过2M，分辨率应小于1920×1080
    */
    private String image;

    /**
    * 图片类型
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 从指定的group中进行查找，逗号分隔，上限10个
    */
    @JsonProperty("group_id_list")
    private String groupIdList;

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
    * 当需要对特定用户进行比对时，指定user_id进行比对（即人脸认证功能）
    */
    @JsonProperty("user_id")
    private String userId;

    /**
    * 查找后返回的用户数量，默认为1，最多返回50个
    */
    @JsonProperty("max_user_num")
    private Integer maxUserNum;

    /**
    * 人脸检测排序类型
    */
    @JsonProperty("face_sort_type")
    private Integer faceSortType;

    /**
    * 匹配阈值，score低于此阈值的用户不会返回，最大100最小0默认0，推荐设置80
    */
    @JsonProperty("match_threshold")
    private Integer matchThreshold;

    public String getImage() {
        return image;
    }

    public FaceSearchRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceSearchRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getGroupIdList() {
        return groupIdList;
    }

    public FaceSearchRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public FaceSearchRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public FaceSearchRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public FaceSearchRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public FaceSearchRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Integer getMaxUserNum() {
        return maxUserNum;
    }

    public FaceSearchRequest setMaxUserNum(Integer maxUserNum) {
        this.maxUserNum = maxUserNum;
        return this;
    }

    public Integer getFaceSortType() {
        return faceSortType;
    }

    public FaceSearchRequest setFaceSortType(Integer faceSortType) {
        this.faceSortType = faceSortType;
        return this;
    }

    public Integer getMatchThreshold() {
        return matchThreshold;
    }

    public FaceSearchRequest setMatchThreshold(Integer matchThreshold) {
        this.matchThreshold = matchThreshold;
        return this;
    }

}
