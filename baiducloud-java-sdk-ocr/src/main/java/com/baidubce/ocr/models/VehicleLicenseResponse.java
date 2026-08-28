package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleLicenseResponse extends BaseBceResponse {

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
    * 图像方向，当detect_direction=true时返回该字段
    */
    private Integer direction;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名（如：号牌号码、车辆类型等），value为识别内容
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    /**
    * 质量告警信息，当请求参数vehicle_license_side=front且quality_warn=true时输出
    */
    @JsonProperty("warn_infos")
    private List<String> warnInfos;

    /**
    * qualityPropobility
    */
    @JsonProperty("quality_propobility")
    private VehicleLicenseQualityPropobility qualityPropobility;

    /**
    * 当输入参数risk_warn=true时输出
    */
    @JsonProperty("risk_type")
    private String riskType;

    /**
    * 当输入参数risk_warn=true时返回，如果检测行驶证被编辑过，该字段指定编辑软件名称
    */
    @JsonProperty("edit_tool")
    private String editTool;

    public Integer getErrorCode() {
        return errorCode;
    }

    public VehicleLicenseResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public VehicleLicenseResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public VehicleLicenseResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public VehicleLicenseResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public VehicleLicenseResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public VehicleLicenseResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public List<String> getWarnInfos() {
        return warnInfos;
    }

    public VehicleLicenseResponse setWarnInfos(List<String> warnInfos) {
        this.warnInfos = warnInfos;
        return this;
    }

    public VehicleLicenseQualityPropobility getQualityPropobility() {
        return qualityPropobility;
    }

    public VehicleLicenseResponse setQualityPropobility(VehicleLicenseQualityPropobility qualityPropobility) {
        this.qualityPropobility = qualityPropobility;
        return this;
    }

    public String getRiskType() {
        return riskType;
    }

    public VehicleLicenseResponse setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    public String getEditTool() {
        return editTool;
    }

    public VehicleLicenseResponse setEditTool(String editTool) {
        this.editTool = editTool;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleLicenseResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "warnInfos=" + warnInfos + "\n" + "qualityPropobility=" + qualityPropobility
                + "\n" + "riskType=" + riskType + "\n" + "editTool=" + editTool + "\n" + "}";
    }

}
