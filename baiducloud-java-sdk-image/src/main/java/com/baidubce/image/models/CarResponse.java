package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarResponse extends BaseBceResponse {

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
    * 车身颜色。共11种颜色，分别为白色、黑色、灰色、香槟色、黄色、红色、绿色、紫色、橙色、棕色、蓝色
    */
    @JsonProperty("color_result")
    private String colorResult;

    /**
    * 车型识别结果数组
    */
    private List<CarResult> result;

    /**
    * 车型品牌，实例：宝马；当output_brand=true时返回
    */
    private String brand;

    /**
    * locationResult
    */
    @JsonProperty("location_result")
    private CarLocationResult locationResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public CarResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public CarResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public CarResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getColorResult() {
        return colorResult;
    }

    public CarResponse setColorResult(String colorResult) {
        this.colorResult = colorResult;
        return this;
    }

    public List<CarResult> getResult() {
        return result;
    }

    public CarResponse setResult(List<CarResult> result) {
        this.result = result;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarResponse setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarLocationResult getLocationResult() {
        return locationResult;
    }

    public CarResponse setLocationResult(CarLocationResult locationResult) {
        this.locationResult = locationResult;
        return this;
    }

    @Override
    public String toString() {
        return "CarResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "colorResult=" + colorResult + "\n" + "result="
                + result + "\n" + "brand=" + brand + "\n" + "locationResult=" + locationResult + "\n" + "}";
    }

}
