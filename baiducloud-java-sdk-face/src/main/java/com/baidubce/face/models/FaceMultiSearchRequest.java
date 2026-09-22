package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceMultiSearchRequest extends BaseBceRequest {

    /**
    * 图片信息，数据大小应小于10M，分辨率应小于1920×1080
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
    * 最多处理人脸的数目，默认1（仅检测面积最大的人脸），最大值10
    */
    @JsonProperty("max_face_num")
    private Integer maxFaceNum;

    /**
    * 匹配阈值，score低于此阈值的用户不会返回，最大100最小0默认80，推荐使用默认阈值80
    */
    @JsonProperty("match_threshold")
    private Integer matchThreshold;

    /**
    * 质量控制
    */
    @JsonProperty("quality_control")
    private String qualityControl;

    /**
    * 活体控制
    */
    @JsonProperty("liveness_control")
    private String livenessControl;

    /**
    * 合成图控制
    */
    @JsonProperty("spoofing_control")
    private String spoofingControl;

    /**
    * 识别返回的最大用户数，默认为1，最大20个
    */
    @JsonProperty("max_user_num")
    private Integer maxUserNum;

    public String getImage() {
        return image;
    }

    public FaceMultiSearchRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceMultiSearchRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getGroupIdList() {
        return groupIdList;
    }

    public FaceMultiSearchRequest setGroupIdList(String groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }

    public Integer getMaxFaceNum() {
        return maxFaceNum;
    }

    public FaceMultiSearchRequest setMaxFaceNum(Integer maxFaceNum) {
        this.maxFaceNum = maxFaceNum;
        return this;
    }

    public Integer getMatchThreshold() {
        return matchThreshold;
    }

    public FaceMultiSearchRequest setMatchThreshold(Integer matchThreshold) {
        this.matchThreshold = matchThreshold;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public FaceMultiSearchRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public FaceMultiSearchRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public FaceMultiSearchRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

    public Integer getMaxUserNum() {
        return maxUserNum;
    }

    public FaceMultiSearchRequest setMaxUserNum(Integer maxUserNum) {
        this.maxUserNum = maxUserNum;
        return this;
    }

}
