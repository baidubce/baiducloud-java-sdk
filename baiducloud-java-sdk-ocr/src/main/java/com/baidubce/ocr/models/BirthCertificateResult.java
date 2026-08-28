package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BirthCertificateResult {
    /**
     * babyBirthday
     */
    @JsonProperty("BabyBirthday")
    private BabyBirthday babyBirthday;

    /**
     * birthProvince
     */
    @JsonProperty("BirthProvince")
    private BirthProvince birthProvince;

    /**
     * birthCity
     */
    @JsonProperty("BirthCity")
    private BirthCity birthCity;

    /**
     * birthCounty
     */
    @JsonProperty("BirthCounty")
    private BirthCounty birthCounty;

    /**
     * birthWeight
     */
    @JsonProperty("BirthWeight")
    private BirthWeight birthWeight;

    /**
     * birthLength
     */
    @JsonProperty("BirthLength")
    private BirthLength birthLength;

    /**
     * gestationalAge
     */
    @JsonProperty("GestationalAge")
    private GestationalAge gestationalAge;

    /**
     * babyName
     */
    @JsonProperty("BabyName")
    private BabyName babyName;

    /**
     * babySex
     */
    @JsonProperty("BabySex")
    private BabySex babySex;

    /**
     * code
     */
    @JsonProperty("Code")
    private Code code;

    /**
     * hospital
     */
    @JsonProperty("Hospital")
    private Hospital hospital;

    /**
     * fatherName
     */
    @JsonProperty("FatherName")
    private FatherName fatherName;

    /**
     * fatherID
     */
    @JsonProperty("FatherID")
    private FatherID fatherID;

    /**
     * fatherNationality
     */
    @JsonProperty("FatherNationality")
    private FatherNationality fatherNationality;

    /**
     * fatherEthnic
     */
    @JsonProperty("FatherEthnic")
    private FatherEthnic fatherEthnic;

    /**
     * fatherAddress
     */
    @JsonProperty("FatherAddress")
    private FatherAddress fatherAddress;

    /**
     * fatherAge
     */
    @JsonProperty("FatherAge")
    private FatherAge fatherAge;

    /**
     * motherName
     */
    @JsonProperty("MotherName")
    private MotherName motherName;

    /**
     * motherID
     */
    @JsonProperty("MotherID")
    private MotherID motherID;

    /**
     * motherNationality
     */
    @JsonProperty("MotherNationality")
    private MotherNationality motherNationality;

    /**
     * motherEthnic
     */
    @JsonProperty("MotherEthnic")
    private MotherEthnic motherEthnic;

    /**
     * motherAddress
     */
    @JsonProperty("MotherAddress")
    private MotherAddress motherAddress;

    /**
     * motherAge
     */
    @JsonProperty("MotherAge")
    private MotherAge motherAge;

    public BirthCertificateResult setBabyBirthday(BabyBirthday babyBirthday) {
        this.babyBirthday = babyBirthday;
        return this;
    }

    public BabyBirthday getBabyBirthday() {
        return this.babyBirthday;
    }

    public BirthCertificateResult setBirthProvince(BirthProvince birthProvince) {
        this.birthProvince = birthProvince;
        return this;
    }

    public BirthProvince getBirthProvince() {
        return this.birthProvince;
    }

    public BirthCertificateResult setBirthCity(BirthCity birthCity) {
        this.birthCity = birthCity;
        return this;
    }

    public BirthCity getBirthCity() {
        return this.birthCity;
    }

    public BirthCertificateResult setBirthCounty(BirthCounty birthCounty) {
        this.birthCounty = birthCounty;
        return this;
    }

    public BirthCounty getBirthCounty() {
        return this.birthCounty;
    }

    public BirthCertificateResult setBirthWeight(BirthWeight birthWeight) {
        this.birthWeight = birthWeight;
        return this;
    }

    public BirthWeight getBirthWeight() {
        return this.birthWeight;
    }

    public BirthCertificateResult setBirthLength(BirthLength birthLength) {
        this.birthLength = birthLength;
        return this;
    }

    public BirthLength getBirthLength() {
        return this.birthLength;
    }

    public BirthCertificateResult setGestationalAge(GestationalAge gestationalAge) {
        this.gestationalAge = gestationalAge;
        return this;
    }

    public GestationalAge getGestationalAge() {
        return this.gestationalAge;
    }

    public BirthCertificateResult setBabyName(BabyName babyName) {
        this.babyName = babyName;
        return this;
    }

    public BabyName getBabyName() {
        return this.babyName;
    }

    public BirthCertificateResult setBabySex(BabySex babySex) {
        this.babySex = babySex;
        return this;
    }

    public BabySex getBabySex() {
        return this.babySex;
    }

    public BirthCertificateResult setCode(Code code) {
        this.code = code;
        return this;
    }

    public Code getCode() {
        return this.code;
    }

    public BirthCertificateResult setHospital(Hospital hospital) {
        this.hospital = hospital;
        return this;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public BirthCertificateResult setFatherName(FatherName fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public FatherName getFatherName() {
        return this.fatherName;
    }

    public BirthCertificateResult setFatherID(FatherID fatherID) {
        this.fatherID = fatherID;
        return this;
    }

    public FatherID getFatherID() {
        return this.fatherID;
    }

    public BirthCertificateResult setFatherNationality(FatherNationality fatherNationality) {
        this.fatherNationality = fatherNationality;
        return this;
    }

    public FatherNationality getFatherNationality() {
        return this.fatherNationality;
    }

    public BirthCertificateResult setFatherEthnic(FatherEthnic fatherEthnic) {
        this.fatherEthnic = fatherEthnic;
        return this;
    }

    public FatherEthnic getFatherEthnic() {
        return this.fatherEthnic;
    }

    public BirthCertificateResult setFatherAddress(FatherAddress fatherAddress) {
        this.fatherAddress = fatherAddress;
        return this;
    }

    public FatherAddress getFatherAddress() {
        return this.fatherAddress;
    }

    public BirthCertificateResult setFatherAge(FatherAge fatherAge) {
        this.fatherAge = fatherAge;
        return this;
    }

    public FatherAge getFatherAge() {
        return this.fatherAge;
    }

    public BirthCertificateResult setMotherName(MotherName motherName) {
        this.motherName = motherName;
        return this;
    }

    public MotherName getMotherName() {
        return this.motherName;
    }

    public BirthCertificateResult setMotherID(MotherID motherID) {
        this.motherID = motherID;
        return this;
    }

    public MotherID getMotherID() {
        return this.motherID;
    }

    public BirthCertificateResult setMotherNationality(MotherNationality motherNationality) {
        this.motherNationality = motherNationality;
        return this;
    }

    public MotherNationality getMotherNationality() {
        return this.motherNationality;
    }

    public BirthCertificateResult setMotherEthnic(MotherEthnic motherEthnic) {
        this.motherEthnic = motherEthnic;
        return this;
    }

    public MotherEthnic getMotherEthnic() {
        return this.motherEthnic;
    }

    public BirthCertificateResult setMotherAddress(MotherAddress motherAddress) {
        this.motherAddress = motherAddress;
        return this;
    }

    public MotherAddress getMotherAddress() {
        return this.motherAddress;
    }

    public BirthCertificateResult setMotherAge(MotherAge motherAge) {
        this.motherAge = motherAge;
        return this;
    }

    public MotherAge getMotherAge() {
        return this.motherAge;
    }

    @Override
    public String toString() {
        return "BirthCertificateResult{" + "babyBirthday=" + babyBirthday + "\n" + "birthProvince=" + birthProvince + "\n" + "birthCity=" + birthCity + "\n" + "birthCounty="
                + birthCounty + "\n" + "birthWeight=" + birthWeight + "\n" + "birthLength=" + birthLength + "\n" + "gestationalAge=" + gestationalAge + "\n" + "babyName="
                + babyName + "\n" + "babySex=" + babySex + "\n" + "code=" + code + "\n" + "hospital=" + hospital + "\n" + "fatherName=" + fatherName + "\n" + "fatherID="
                + fatherID + "\n" + "fatherNationality=" + fatherNationality + "\n" + "fatherEthnic=" + fatherEthnic + "\n" + "fatherAddress=" + fatherAddress + "\n"
                + "fatherAge=" + fatherAge + "\n" + "motherName=" + motherName + "\n" + "motherID=" + motherID + "\n" + "motherNationality=" + motherNationality + "\n"
                + "motherEthnic=" + motherEthnic + "\n" + "motherAddress=" + motherAddress + "\n" + "motherAge=" + motherAge + "\n" + "}";
    }

}