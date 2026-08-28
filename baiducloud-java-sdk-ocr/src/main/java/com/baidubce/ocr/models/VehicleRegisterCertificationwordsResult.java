package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleRegisterCertificationwordsResult {
    /**
     * number
     */
    private VehicleRegistrationCertificateWordsItem number;

    /**
     * nameIdcardNo
     */
    @JsonProperty("name_idcard_no")
    private VehicleRegistrationCertificateWordsItem nameIdcardNo;

    /**
     * registrationAuthority
     */
    @JsonProperty("registration_authority")
    private VehicleRegistrationCertificateWordsItem registrationAuthority;

    /**
     * registrationDate
     */
    @JsonProperty("registration_date")
    private VehicleRegistrationCertificateWordsItem registrationDate;

    /**
     * registrationNum
     */
    @JsonProperty("registration_num")
    private VehicleRegistrationCertificateWordsItem registrationNum;

    /**
     * vehicleModel
     */
    @JsonProperty("vehicle_model")
    private VehicleRegistrationCertificateWordsItem vehicleModel;

    /**
     * vehicleType
     */
    @JsonProperty("vehicle_type")
    private VehicleRegistrationCertificateWordsItem vehicleType;

    /**
     * vin
     */
    private VehicleRegistrationCertificateWordsItem vin;

    /**
     * engineNum
     */
    @JsonProperty("engine_num")
    private VehicleRegistrationCertificateWordsItem engineNum;

    /**
     * seatingCapacity
     */
    @JsonProperty("seating_capacity")
    private VehicleRegistrationCertificateWordsItem seatingCapacity;

    /**
     * bodyColor
     */
    @JsonProperty("body_color")
    private VehicleRegistrationCertificateWordsItem bodyColor;

    /**
     * natureOfUse
     */
    @JsonProperty("nature_of_use")
    private VehicleRegistrationCertificateWordsItem natureOfUse;

    /**
     * dateOfProduction
     */
    @JsonProperty("date_of_production")
    private VehicleRegistrationCertificateWordsItem dateOfProduction;

    /**
     * dateOfIssue
     */
    @JsonProperty("date_of_issue")
    private VehicleRegistrationCertificateWordsItem dateOfIssue;

    /**
     * sealOfIssueAuthority
     */
    @JsonProperty("seal_of_issue_authority")
    private VehicleRegistrationCertificateWordsItem sealOfIssueAuthority;

    public VehicleRegisterCertificationwordsResult setNumber(VehicleRegistrationCertificateWordsItem number) {
        this.number = number;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getNumber() {
        return this.number;
    }

    public VehicleRegisterCertificationwordsResult setNameIdcardNo(VehicleRegistrationCertificateWordsItem nameIdcardNo) {
        this.nameIdcardNo = nameIdcardNo;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getNameIdcardNo() {
        return this.nameIdcardNo;
    }

    public VehicleRegisterCertificationwordsResult setRegistrationAuthority(VehicleRegistrationCertificateWordsItem registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public VehicleRegisterCertificationwordsResult setRegistrationDate(VehicleRegistrationCertificateWordsItem registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getRegistrationDate() {
        return this.registrationDate;
    }

    public VehicleRegisterCertificationwordsResult setRegistrationNum(VehicleRegistrationCertificateWordsItem registrationNum) {
        this.registrationNum = registrationNum;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getRegistrationNum() {
        return this.registrationNum;
    }

    public VehicleRegisterCertificationwordsResult setVehicleModel(VehicleRegistrationCertificateWordsItem vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getVehicleModel() {
        return this.vehicleModel;
    }

    public VehicleRegisterCertificationwordsResult setVehicleType(VehicleRegistrationCertificateWordsItem vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getVehicleType() {
        return this.vehicleType;
    }

    public VehicleRegisterCertificationwordsResult setVin(VehicleRegistrationCertificateWordsItem vin) {
        this.vin = vin;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getVin() {
        return this.vin;
    }

    public VehicleRegisterCertificationwordsResult setEngineNum(VehicleRegistrationCertificateWordsItem engineNum) {
        this.engineNum = engineNum;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getEngineNum() {
        return this.engineNum;
    }

    public VehicleRegisterCertificationwordsResult setSeatingCapacity(VehicleRegistrationCertificateWordsItem seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getSeatingCapacity() {
        return this.seatingCapacity;
    }

    public VehicleRegisterCertificationwordsResult setBodyColor(VehicleRegistrationCertificateWordsItem bodyColor) {
        this.bodyColor = bodyColor;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getBodyColor() {
        return this.bodyColor;
    }

    public VehicleRegisterCertificationwordsResult setNatureOfUse(VehicleRegistrationCertificateWordsItem natureOfUse) {
        this.natureOfUse = natureOfUse;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getNatureOfUse() {
        return this.natureOfUse;
    }

    public VehicleRegisterCertificationwordsResult setDateOfProduction(VehicleRegistrationCertificateWordsItem dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getDateOfProduction() {
        return this.dateOfProduction;
    }

    public VehicleRegisterCertificationwordsResult setDateOfIssue(VehicleRegistrationCertificateWordsItem dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getDateOfIssue() {
        return this.dateOfIssue;
    }

    public VehicleRegisterCertificationwordsResult setSealOfIssueAuthority(VehicleRegistrationCertificateWordsItem sealOfIssueAuthority) {
        this.sealOfIssueAuthority = sealOfIssueAuthority;
        return this;
    }

    public VehicleRegistrationCertificateWordsItem getSealOfIssueAuthority() {
        return this.sealOfIssueAuthority;
    }

    @Override
    public String toString() {
        return "VehicleRegisterCertificationwordsResult{" + "number=" + number + "\n" + "nameIdcardNo=" + nameIdcardNo + "\n" + "registrationAuthority=" + registrationAuthority
                + "\n" + "registrationDate=" + registrationDate + "\n" + "registrationNum=" + registrationNum + "\n" + "vehicleModel=" + vehicleModel + "\n" + "vehicleType="
                + vehicleType + "\n" + "vin=" + vin + "\n" + "engineNum=" + engineNum + "\n" + "seatingCapacity=" + seatingCapacity + "\n" + "bodyColor=" + bodyColor + "\n"
                + "natureOfUse=" + natureOfUse + "\n" + "dateOfProduction=" + dateOfProduction + "\n" + "dateOfIssue=" + dateOfIssue + "\n" + "sealOfIssueAuthority="
                + sealOfIssueAuthority + "\n" + "}";
    }

}