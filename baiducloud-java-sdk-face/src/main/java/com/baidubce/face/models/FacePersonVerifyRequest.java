package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacePersonVerifyRequest extends BaseBceRequest {

    /**
    * 图片信息，图片上传方式根据image_type来判断
    */
    private String image;

    /**
    * 图片类型 **BASE64**:图片的Base64值，Base64编码后的文件大小不超过2M；图片尺寸不超过1920*1080 **FACE_TOKEN**: 人脸图片的唯一标识，调用人脸检测接口时，会为每个人脸图片赋予一个唯一的FACE_TOKEN，同一张图片多次检测得到的FACE_TOKEN是同一个，FACE_TOKEN有效期为60min。
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 证件号码
    */
    @JsonProperty("id_card_number")
    private String idCardNumber;

    /**
    * 姓名（注：需要是UTF-8编码的中文）
    */
    private String name;

    /**
    * 图片质量控制 **NONE**: 不进行控制 **LOW**:较低的质量要求 **NORMAL**: 一般的质量要求 **HIGH**: 较高的质量要求 **默认 NONE**
    */
    @JsonProperty("quality_control")
    private String qualityControl;

    /**
    * 活体检测控制 **NONE**: 不进行控制 **LOW**:较低的活体要求(高通过率 低攻击拒绝率) **NORMAL**: 一般的活体要求(平衡的攻击拒绝率, 通过率) **HIGH**: 较高的活体要求(高攻击拒绝率 低通过率) **默认NONE**
    */
    @JsonProperty("liveness_control")
    private String livenessControl;

    /**
    * 合成图控制参数 **NONE**: 不进行控制 **LOW**:较低的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**低通过率、高攻击拒绝率** **NORMAL**: 一般的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**平衡的攻击拒绝率, 通过率** **HIGH**:
    * 较高的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**高通过率、低攻击拒绝率**) **默认为NONE**
    */
    @JsonProperty("spoofing_control")
    private String spoofingControl;

    public String getImage() {
        return image;
    }

    public FacePersonVerifyRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FacePersonVerifyRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public FacePersonVerifyRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public FacePersonVerifyRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public FacePersonVerifyRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public FacePersonVerifyRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public FacePersonVerifyRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

}
