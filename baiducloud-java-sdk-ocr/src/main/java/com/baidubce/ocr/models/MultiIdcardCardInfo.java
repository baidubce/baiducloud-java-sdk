package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiIdcardCardInfo {
    /**
     * cardLocation
     */
    @JsonProperty("card_location")
    private MultiIdcardLocation cardLocation;

    /**
     * 身份证正反面类型
     */
    @JsonProperty("card_type")
    private String cardType;

    /**
     * 图像方向
     */
    private Integer direction;

    /**
     * 识别状态
     */
    @JsonProperty("image_status")
    private String imageStatus;

    /**
     * 输入参数 detect_risk = true 时，则返回该字段识别身份证类型
     */
    @JsonProperty("risk_type")
    private String riskType;

    /**
     * 如果参数 detect_risk = true 时，则返回此字段。如果检测身份证被编辑过，该字段指定编辑软件名称，如:Adobe Photoshop CC 2014 (Macintosh),如果没有被编辑过则返回值无此参数
     */
    @JsonProperty("edit_tool")
    private String editTool;

    /**
     * cardQuality
     */
    @JsonProperty("card_quality")
    private MultiIdcardCardQuality cardQuality;

    /**
     * 当请求参数 detect_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
     */
    private String photo;

    /**
     * photoLocation
     */
    @JsonProperty("photo_location")
    private MultiIdcardLocation photoLocation;

    /**
     * 当请求参数 detect_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
     */
    @JsonProperty("card_image")
    private String cardImage;

    /**
     * 用于校验身份证号码、性别、出生是否一致
     */
    @JsonProperty("idcard_number_type")
    private Integer idcardNumberType;

    public MultiIdcardCardInfo setCardLocation(MultiIdcardLocation cardLocation) {
        this.cardLocation = cardLocation;
        return this;
    }

    public MultiIdcardLocation getCardLocation() {
        return this.cardLocation;
    }

    public MultiIdcardCardInfo setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public String getCardType() {
        return this.cardType;
    }

    public MultiIdcardCardInfo setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getDirection() {
        return this.direction;
    }

    public MultiIdcardCardInfo setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }

    public String getImageStatus() {
        return this.imageStatus;
    }

    public MultiIdcardCardInfo setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    public String getRiskType() {
        return this.riskType;
    }

    public MultiIdcardCardInfo setEditTool(String editTool) {
        this.editTool = editTool;
        return this;
    }

    public String getEditTool() {
        return this.editTool;
    }

    public MultiIdcardCardInfo setCardQuality(MultiIdcardCardQuality cardQuality) {
        this.cardQuality = cardQuality;
        return this;
    }

    public MultiIdcardCardQuality getCardQuality() {
        return this.cardQuality;
    }

    public MultiIdcardCardInfo setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhoto() {
        return this.photo;
    }

    public MultiIdcardCardInfo setPhotoLocation(MultiIdcardLocation photoLocation) {
        this.photoLocation = photoLocation;
        return this;
    }

    public MultiIdcardLocation getPhotoLocation() {
        return this.photoLocation;
    }

    public MultiIdcardCardInfo setCardImage(String cardImage) {
        this.cardImage = cardImage;
        return this;
    }

    public String getCardImage() {
        return this.cardImage;
    }

    public MultiIdcardCardInfo setIdcardNumberType(Integer idcardNumberType) {
        this.idcardNumberType = idcardNumberType;
        return this;
    }

    public Integer getIdcardNumberType() {
        return this.idcardNumberType;
    }

    @Override
    public String toString() {
        return "MultiIdcardCardInfo{" + "cardLocation=" + cardLocation + "\n" + "cardType=" + cardType + "\n" + "direction=" + direction + "\n" + "imageStatus=" + imageStatus
                + "\n" + "riskType=" + riskType + "\n" + "editTool=" + editTool + "\n" + "cardQuality=" + cardQuality + "\n" + "photo=" + photo + "\n" + "photoLocation="
                + photoLocation + "\n" + "cardImage=" + cardImage + "\n" + "idcardNumberType=" + idcardNumberType + "\n" + "}";
    }

}