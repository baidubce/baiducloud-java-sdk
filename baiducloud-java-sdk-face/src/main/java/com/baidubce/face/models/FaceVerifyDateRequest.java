package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyDateRequest extends BaseBceRequest {

    /**
    * 姓名(需要是 utf8 编码)
    */
    private String name;

    /**
    * 身份证件号
    */
    @JsonProperty("id_card_number")
    private String idCardNumber;

    /**
    * 身份证有效期起始日期：年月日8位数字完整传入（如20120422）；起始日期不得早于19840101（第一代身份证签发日期）
    */
    @JsonProperty("start_date")
    private String startDate;

    /**
    * 身份证有效期截止日期：年月日8位数字完整传入（如20170422），1：截止日期须晚于起始日期5年以上（包含5年）；2：有效期截止日期为"长期"时，须转换为"00000000"入参请求；
    */
    @JsonProperty("end_date")
    private String endDate;

    /**
    * 图片信息(数据大小应小于10M 分辨率应小于1920*1080)
    */
    private String image;

    /**
    * 图片类型 **BASE64** : 图片的base64值
    */
    @JsonProperty("image_type")
    private String imageType;

    /**
    * 活体控制参数 **NONE**: 不进行控制 **LOW**:较低的活体要求(高通过率 低攻击拒绝率) **NORMAL**: 一般的活体要求(平衡的攻击拒绝率, 通过率) **HIGH**: 较高的活体要求(高攻击拒绝率 低通过率) **默认为NONE**
    */
    @JsonProperty("liveness_control")
    private String livenessControl;

    /**
    * 合成图控制参数 **NONE**: 不进行控制 **LOW**:较低的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**低通过率、高攻击拒绝率** **NORMAL**: 一般的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**平衡的攻击拒绝率, 通过率** **HIGH**:
    * 较高的合成图阈值数值，由于合成图判定逻辑为大于阈值视为合成图攻击，该项代表**高通过率、低攻击拒绝率**) **默认为NONE**
    */
    @JsonProperty("spoofing_control")
    private String spoofingControl;

    /**
    * 质量控制参数 **NONE**: 不进行控制 **LOW**:较低的质量要求 **NORMAL**: 一般的质量要求 **HIGH**: 较高的质量要求 **默认为NONE**
    */
    @JsonProperty("quality_control")
    private String qualityControl;

    public String getName() {
        return name;
    }

    public FaceVerifyDateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public FaceVerifyDateRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public FaceVerifyDateRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public FaceVerifyDateRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getImage() {
        return image;
    }

    public FaceVerifyDateRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public FaceVerifyDateRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    public String getLivenessControl() {
        return livenessControl;
    }

    public FaceVerifyDateRequest setLivenessControl(String livenessControl) {
        this.livenessControl = livenessControl;
        return this;
    }

    public String getSpoofingControl() {
        return spoofingControl;
    }

    public FaceVerifyDateRequest setSpoofingControl(String spoofingControl) {
        this.spoofingControl = spoofingControl;
        return this;
    }

    public String getQualityControl() {
        return qualityControl;
    }

    public FaceVerifyDateRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }

}
