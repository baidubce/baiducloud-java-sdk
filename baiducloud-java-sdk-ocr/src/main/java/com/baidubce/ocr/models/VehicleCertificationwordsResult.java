package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleCertificationwordsResult {
    /**
     * 合格证编号
     */
    @JsonProperty("CertificationNo")
    private String certificationNo;

    /**
     * 发证日期
     */
    @JsonProperty("CertificateDate")
    private String certificateDate;

    /**
     * 车辆制造企业名
     */
    @JsonProperty("Manufacturer")
    private String manufacturer;

    /**
     * 车辆品牌
     */
    @JsonProperty("CarBrand")
    private String carBrand;

    /**
     * 车辆名称
     */
    @JsonProperty("CarName")
    private String carName;

    /**
     * 车辆型号
     */
    @JsonProperty("CarModel")
    private String carModel;

    /**
     * 车架号
     */
    @JsonProperty("VinNo")
    private String vinNo;

    /**
     * 车身颜色
     */
    @JsonProperty("CarColor")
    private String carColor;

    /**
     * 发动机型号
     */
    @JsonProperty("EngineType")
    private String engineType;

    /**
     * 发动机号
     */
    @JsonProperty("EngineNo")
    private String engineNo;

    /**
     * 燃料种类
     */
    @JsonProperty("FuelType")
    private String fuelType;

    /**
     * 排量
     */
    @JsonProperty("Displacement")
    private String displacement;

    /**
     * 功率
     */
    @JsonProperty("Power")
    private String power;

    /**
     * 排放标准
     */
    @JsonProperty("EmissionStandard")
    private String emissionStandard;

    /**
     * 轮胎数
     */
    @JsonProperty("TyreNum")
    private String tyreNum;

    /**
     * 轴距
     */
    @JsonProperty("Wheelbase")
    private String wheelbase;

    /**
     * 轴数
     */
    @JsonProperty("AxleNum")
    private String axleNum;

    /**
     * 转向形式
     */
    @JsonProperty("SteeringType")
    private String steeringType;

    /**
     * 总质量
     */
    @JsonProperty("TotalWeight")
    private String totalWeight;

    /**
     * 整备质量
     */
    @JsonProperty("SaddleMass")
    private String saddleMass;

    /**
     * 驾驶室准乘人数
     */
    @JsonProperty("LimitPassenger")
    private String limitPassenger;

    /**
     * 最高设计车速
     */
    @JsonProperty("SpeedLimit")
    private String speedLimit;

    /**
     * 车辆制造日期
     */
    @JsonProperty("ManufactureDate")
    private String manufactureDate;

    /**
     * 底盘ID
     */
    @JsonProperty("ChassisID")
    private String chassisID;

    /**
     * 底盘型号
     */
    @JsonProperty("ChassisModel")
    private String chassisModel;

    /**
     * 额定载客人数
     */
    @JsonProperty("SeatingCapacity")
    private String seatingCapacity;

    /**
     * 合格印章：1表示有，0表示无
     */
    @JsonProperty("QualifySeal")
    private String qualifySeal;

    /**
     * CGS印章：1表示有，0表示无
     */
    @JsonProperty("CGSSeal")
    private String cgSSeal;

    public VehicleCertificationwordsResult setCertificationNo(String certificationNo) {
        this.certificationNo = certificationNo;
        return this;
    }

    public String getCertificationNo() {
        return this.certificationNo;
    }

    public VehicleCertificationwordsResult setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
        return this;
    }

    public String getCertificateDate() {
        return this.certificateDate;
    }

    public VehicleCertificationwordsResult setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public VehicleCertificationwordsResult setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        return this;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public VehicleCertificationwordsResult setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public String getCarName() {
        return this.carName;
    }

    public VehicleCertificationwordsResult setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public VehicleCertificationwordsResult setVinNo(String vinNo) {
        this.vinNo = vinNo;
        return this;
    }

    public String getVinNo() {
        return this.vinNo;
    }

    public VehicleCertificationwordsResult setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public VehicleCertificationwordsResult setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public VehicleCertificationwordsResult setEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }

    public String getEngineNo() {
        return this.engineNo;
    }

    public VehicleCertificationwordsResult setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public VehicleCertificationwordsResult setDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public VehicleCertificationwordsResult setPower(String power) {
        this.power = power;
        return this;
    }

    public String getPower() {
        return this.power;
    }

    public VehicleCertificationwordsResult setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
        return this;
    }

    public String getEmissionStandard() {
        return this.emissionStandard;
    }

    public VehicleCertificationwordsResult setTyreNum(String tyreNum) {
        this.tyreNum = tyreNum;
        return this;
    }

    public String getTyreNum() {
        return this.tyreNum;
    }

    public VehicleCertificationwordsResult setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
        return this;
    }

    public String getWheelbase() {
        return this.wheelbase;
    }

    public VehicleCertificationwordsResult setAxleNum(String axleNum) {
        this.axleNum = axleNum;
        return this;
    }

    public String getAxleNum() {
        return this.axleNum;
    }

    public VehicleCertificationwordsResult setSteeringType(String steeringType) {
        this.steeringType = steeringType;
        return this;
    }

    public String getSteeringType() {
        return this.steeringType;
    }

    public VehicleCertificationwordsResult setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    public String getTotalWeight() {
        return this.totalWeight;
    }

    public VehicleCertificationwordsResult setSaddleMass(String saddleMass) {
        this.saddleMass = saddleMass;
        return this;
    }

    public String getSaddleMass() {
        return this.saddleMass;
    }

    public VehicleCertificationwordsResult setLimitPassenger(String limitPassenger) {
        this.limitPassenger = limitPassenger;
        return this;
    }

    public String getLimitPassenger() {
        return this.limitPassenger;
    }

    public VehicleCertificationwordsResult setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public String getSpeedLimit() {
        return this.speedLimit;
    }

    public VehicleCertificationwordsResult setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    public String getManufactureDate() {
        return this.manufactureDate;
    }

    public VehicleCertificationwordsResult setChassisID(String chassisID) {
        this.chassisID = chassisID;
        return this;
    }

    public String getChassisID() {
        return this.chassisID;
    }

    public VehicleCertificationwordsResult setChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
        return this;
    }

    public String getChassisModel() {
        return this.chassisModel;
    }

    public VehicleCertificationwordsResult setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public String getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public VehicleCertificationwordsResult setQualifySeal(String qualifySeal) {
        this.qualifySeal = qualifySeal;
        return this;
    }

    public String getQualifySeal() {
        return this.qualifySeal;
    }

    public VehicleCertificationwordsResult setCgSSeal(String cgSSeal) {
        this.cgSSeal = cgSSeal;
        return this;
    }

    public String getCgSSeal() {
        return this.cgSSeal;
    }

    @Override
    public String toString() {
        return "VehicleCertificationwordsResult{" + "certificationNo=" + certificationNo + "\n" + "certificateDate=" + certificateDate + "\n" + "manufacturer=" + manufacturer
                + "\n" + "carBrand=" + carBrand + "\n" + "carName=" + carName + "\n" + "carModel=" + carModel + "\n" + "vinNo=" + vinNo + "\n" + "carColor=" + carColor + "\n"
                + "engineType=" + engineType + "\n" + "engineNo=" + engineNo + "\n" + "fuelType=" + fuelType + "\n" + "displacement=" + displacement + "\n" + "power=" + power
                + "\n" + "emissionStandard=" + emissionStandard + "\n" + "tyreNum=" + tyreNum + "\n" + "wheelbase=" + wheelbase + "\n" + "axleNum=" + axleNum + "\n"
                + "steeringType=" + steeringType + "\n" + "totalWeight=" + totalWeight + "\n" + "saddleMass=" + saddleMass + "\n" + "limitPassenger=" + limitPassenger + "\n"
                + "speedLimit=" + speedLimit + "\n" + "manufactureDate=" + manufactureDate + "\n" + "chassisID=" + chassisID + "\n" + "chassisModel=" + chassisModel + "\n"
                + "seatingCapacity=" + seatingCapacity + "\n" + "qualifySeal=" + qualifySeal + "\n" + "cgSSeal=" + cgSSeal + "\n" + "}";
    }

}