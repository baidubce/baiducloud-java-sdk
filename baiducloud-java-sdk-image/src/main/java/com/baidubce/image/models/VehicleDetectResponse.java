package com.baidubce.image.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleDetectResponse extends BaseBceResponse {

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
    * vehicleNum
    */
    @JsonProperty("vehicle_num")
    private VehicleNumber vehicleNum;

    /**
    * 车辆检测结果数组
    */
    @JsonProperty("vehicle_info")
    private List<VehicleInfo> vehicleInfo;

    public Integer getErrorCode() {
        return errorCode;
    }

    public VehicleDetectResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public VehicleDetectResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public VehicleDetectResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public VehicleNumber getVehicleNum() {
        return vehicleNum;
    }

    public VehicleDetectResponse setVehicleNum(VehicleNumber vehicleNum) {
        this.vehicleNum = vehicleNum;
        return this;
    }

    public List<VehicleInfo> getVehicleInfo() {
        return vehicleInfo;
    }

    public VehicleDetectResponse setVehicleInfo(List<VehicleInfo> vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleDetectResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "vehicleNum=" + vehicleNum + "\n"
                + "vehicleInfo=" + vehicleInfo + "\n" + "}";
    }

}
