package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DrivingLicenseResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误描述信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 图像方向，当 detect_direction=true 时返回该字段。-1：未定义，0：正向，1：逆时针90度，2：逆时针180度，3：逆时针270度
    */
    private Integer direction;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 识别结果，key为字段名（如：姓名、出生日期、证号等），value为识别内容
    */
    @JsonProperty("words_result")
    private Object wordsResult;

    /**
    * 质量告警信息，当 driving_license_side=front 且 quality_warn=true 时输出
    */
    @JsonProperty("warn_infos")
    private List<String> warnInfos;

    /**
    * qualityPropobility
    */
    @JsonProperty("quality_propobility")
    private DrivingLicenseQualityPropobility qualityPropobility;

    /**
    * 风险告警信息，当risk_warn=true时输出
    */
    @JsonProperty("risk_type")
    private String riskType;

    /**
    * 当输入参数 risk_warn=true 时返回，如果检测驾驶证被编辑过，该字段指定编辑软件名称，如果没有被编辑过则返回值为空
    */
    @JsonProperty("edit_tool")
    private String editTool;

    public Integer getErrorCode() {
        return errorCode;
    }

    public DrivingLicenseResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public DrivingLicenseResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public DrivingLicenseResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getDirection() {
        return direction;
    }

    public DrivingLicenseResponse setDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public DrivingLicenseResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public Object getWordsResult() {
        return wordsResult;
    }

    public DrivingLicenseResponse setWordsResult(Object wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    public List<String> getWarnInfos() {
        return warnInfos;
    }

    public DrivingLicenseResponse setWarnInfos(List<String> warnInfos) {
        this.warnInfos = warnInfos;
        return this;
    }

    public DrivingLicenseQualityPropobility getQualityPropobility() {
        return qualityPropobility;
    }

    public DrivingLicenseResponse setQualityPropobility(DrivingLicenseQualityPropobility qualityPropobility) {
        this.qualityPropobility = qualityPropobility;
        return this;
    }

    public String getRiskType() {
        return riskType;
    }

    public DrivingLicenseResponse setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }

    public String getEditTool() {
        return editTool;
    }

    public DrivingLicenseResponse setEditTool(String editTool) {
        this.editTool = editTool;
        return this;
    }

    @Override
    public String toString() {
        return "DrivingLicenseResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "direction=" + direction + "\n"
                + "wordsResultNum=" + wordsResultNum + "\n" + "wordsResult=" + wordsResult + "\n" + "warnInfos=" + warnInfos + "\n" + "qualityPropobility=" + qualityPropobility
                + "\n" + "riskType=" + riskType + "\n" + "editTool=" + editTool + "\n" + "}";
    }

}
