package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdcardResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 识别结果数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名称（如：姓名、性别、民族、出生、住址、公民身份号码、签发机关、失效日期等）
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    /**
    * 图像方向（当detect_direction=true时返回）
    */
    private Integer direction;

    /**
    * 识别状态
    */
    @JsonProperty("image_status")
    private String imageStatus;

    /**
    * 风险类型（可选）
    */
    @JsonProperty("risk_type")
    private String riskType;

    /**
    * cardQuality
    */
    @JsonProperty("card_quality")
    private IdCardQuality cardQuality;

    /**
    * 头像切图的base64编码（当detect_photo=true时返回）
    */
    private String photo;

    /**
    * photoLocation
    */
    @JsonProperty("photo_location")
    private IdcardLocation photoLocation;

    /**
    * 身份证裁剪切图的base64编码（当detect_card=true时返回）
    */
    @JsonProperty("card_image")
    private String cardImage;

    /**
    * cardLocation
    */
    @JsonProperty("card_location")
    private IdcardLocation cardLocation;

    /**
    * 用于校验身份证号码、性别、出生是否一致
    */
    @JsonProperty("idcard_number_type")
    private Integer idcardNumberType;

    /**
    * 判断身份证是否被PS（当detect_ps=true时返回）
    */
    @JsonProperty("card_ps")
    private Integer cardPs;

    /**
    * 编辑软件名称（当detect_risk=true且身份证被编辑过时返回），如：Adobe Photoshop CC 2014 (Macintosh)
    */
    @JsonProperty("edit_tool")
    private String editTool;

    public Integer getErrorCode() {
        return errorCode;
    }

    public IdcardResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public IdcardResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public IdcardResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public IdcardResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public IdcardResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public IdcardResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public IdcardResponse setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus;
        return this;
    }

    public String getRiskType() {
        return riskType;
    }

    public IdcardResponse setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    public IdCardQuality getCardQuality() {
        return cardQuality;
    }

    public IdcardResponse setCardQuality(IdCardQuality cardQuality) {
        this.cardQuality = cardQuality;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public IdcardResponse setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public IdcardLocation getPhotoLocation() {
        return photoLocation;
    }

    public IdcardResponse setPhotoLocation(IdcardLocation photoLocation) {
        this.photoLocation = photoLocation;
        return this;
    }

    public String getCardImage() {
        return cardImage;
    }

    public IdcardResponse setCardImage(String cardImage) {
        this.cardImage = cardImage;
        return this;
    }

    public IdcardLocation getCardLocation() {
        return cardLocation;
    }

    public IdcardResponse setCardLocation(IdcardLocation cardLocation) {
        this.cardLocation = cardLocation;
        return this;
    }

    public Integer getIdcardNumberType() {
        return idcardNumberType;
    }

    public IdcardResponse setIdcardNumberType(Integer idcardNumberType) {
        this.idcardNumberType = idcardNumberType;
        return this;
    }

    public Integer getCardPs() {
        return cardPs;
    }

    public IdcardResponse setCardPs(Integer cardPs) {
        this.cardPs = cardPs;
        return this;
    }

    public String getEditTool() {
        return editTool;
    }

    public IdcardResponse setEditTool(String editTool) {
        this.editTool = editTool;
        return this;
    }

    @Override
    public String toString() {
        return "IdcardResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "wordsResult=" + wordsResult + "\n" + "direction=" + direction + "\n" + "imageStatus=" + imageStatus + "\n" + "riskType=" + riskType + "\n" + "cardQuality="
                + cardQuality + "\n" + "photo=" + photo + "\n" + "photoLocation=" + photoLocation + "\n" + "cardImage=" + cardImage + "\n" + "cardLocation=" + cardLocation + "\n"
                + "idcardNumberType=" + idcardNumberType + "\n" + "cardPs=" + cardPs + "\n" + "editTool=" + editTool + "\n" + "}";
    }

}
