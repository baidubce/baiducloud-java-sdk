package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HouseholdRegisterResult {
    /**
     * householdNum
     */
    @JsonProperty("HouseholdNum")
    private HouseholdWordItem householdNum;

    /**
     * name
     */
    @JsonProperty("Name")
    private HouseholdWordItem name;

    /**
     * relationship
     */
    @JsonProperty("Relationship")
    private HouseholdWordItem relationship;

    /**
     * sex
     */
    @JsonProperty("Sex")
    private HouseholdWordItem sex;

    /**
     * birthAddress
     */
    @JsonProperty("BirthAddress")
    private HouseholdWordItem birthAddress;

    /**
     * nation
     */
    @JsonProperty("Nation")
    private HouseholdWordItem nation;

    /**
     * birthday
     */
    @JsonProperty("Birthday")
    private HouseholdWordItem birthday;

    /**
     * cardNo
     */
    @JsonProperty("CardNo")
    private HouseholdWordItem cardNo;

    /**
     * formerName
     */
    @JsonProperty("FormerName")
    private HouseholdWordItem formerName;

    /**
     * hometown
     */
    @JsonProperty("Hometown")
    private HouseholdWordItem hometown;

    /**
     * otherAddress
     */
    @JsonProperty("OtherAddress")
    private HouseholdWordItem otherAddress;

    /**
     * belief
     */
    @JsonProperty("Belief")
    private HouseholdWordItem belief;

    /**
     * height
     */
    @JsonProperty("Height")
    private HouseholdWordItem height;

    /**
     * bloodType
     */
    @JsonProperty("BloodType")
    private HouseholdWordItem bloodType;

    /**
     * education
     */
    @JsonProperty("Education")
    private HouseholdWordItem education;

    /**
     * maritalStatus
     */
    @JsonProperty("MaritalStatus")
    private HouseholdWordItem maritalStatus;

    /**
     * veteranStatus
     */
    @JsonProperty("VeteranStatus")
    private HouseholdWordItem veteranStatus;

    /**
     * workAddress
     */
    @JsonProperty("WorkAddress")
    private HouseholdWordItem workAddress;

    /**
     * career
     */
    @JsonProperty("Career")
    private HouseholdWordItem career;

    /**
     * wwToCity
     */
    @JsonProperty("WWToCity")
    private HouseholdWordItem wwToCity;

    /**
     * wwHere
     */
    @JsonProperty("WWHere")
    private HouseholdWordItem wwHere;

    /**
     * date
     */
    @JsonProperty("Date")
    private HouseholdWordItem date;

    /**
     * householdType
     */
    @JsonProperty("HouseholdType")
    private HouseholdWordItem householdType;

    /**
     * householderName
     */
    @JsonProperty("HouseholderName")
    private HouseholdWordItem householderName;

    /**
     * address
     */
    @JsonProperty("Address")
    private HouseholdWordItem address;

    /**
     * issueDate
     */
    @JsonProperty("IssueDate")
    private HouseholdWordItem issueDate;

    public HouseholdRegisterResult setHouseholdNum(HouseholdWordItem householdNum) {
        this.householdNum = householdNum;
        return this;
    }

    public HouseholdWordItem getHouseholdNum() {
        return this.householdNum;
    }

    public HouseholdRegisterResult setName(HouseholdWordItem name) {
        this.name = name;
        return this;
    }

    public HouseholdWordItem getName() {
        return this.name;
    }

    public HouseholdRegisterResult setRelationship(HouseholdWordItem relationship) {
        this.relationship = relationship;
        return this;
    }

    public HouseholdWordItem getRelationship() {
        return this.relationship;
    }

    public HouseholdRegisterResult setSex(HouseholdWordItem sex) {
        this.sex = sex;
        return this;
    }

    public HouseholdWordItem getSex() {
        return this.sex;
    }

    public HouseholdRegisterResult setBirthAddress(HouseholdWordItem birthAddress) {
        this.birthAddress = birthAddress;
        return this;
    }

    public HouseholdWordItem getBirthAddress() {
        return this.birthAddress;
    }

    public HouseholdRegisterResult setNation(HouseholdWordItem nation) {
        this.nation = nation;
        return this;
    }

    public HouseholdWordItem getNation() {
        return this.nation;
    }

    public HouseholdRegisterResult setBirthday(HouseholdWordItem birthday) {
        this.birthday = birthday;
        return this;
    }

    public HouseholdWordItem getBirthday() {
        return this.birthday;
    }

    public HouseholdRegisterResult setCardNo(HouseholdWordItem cardNo) {
        this.cardNo = cardNo;
        return this;
    }

    public HouseholdWordItem getCardNo() {
        return this.cardNo;
    }

    public HouseholdRegisterResult setFormerName(HouseholdWordItem formerName) {
        this.formerName = formerName;
        return this;
    }

    public HouseholdWordItem getFormerName() {
        return this.formerName;
    }

    public HouseholdRegisterResult setHometown(HouseholdWordItem hometown) {
        this.hometown = hometown;
        return this;
    }

    public HouseholdWordItem getHometown() {
        return this.hometown;
    }

    public HouseholdRegisterResult setOtherAddress(HouseholdWordItem otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }

    public HouseholdWordItem getOtherAddress() {
        return this.otherAddress;
    }

    public HouseholdRegisterResult setBelief(HouseholdWordItem belief) {
        this.belief = belief;
        return this;
    }

    public HouseholdWordItem getBelief() {
        return this.belief;
    }

    public HouseholdRegisterResult setHeight(HouseholdWordItem height) {
        this.height = height;
        return this;
    }

    public HouseholdWordItem getHeight() {
        return this.height;
    }

    public HouseholdRegisterResult setBloodType(HouseholdWordItem bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    public HouseholdWordItem getBloodType() {
        return this.bloodType;
    }

    public HouseholdRegisterResult setEducation(HouseholdWordItem education) {
        this.education = education;
        return this;
    }

    public HouseholdWordItem getEducation() {
        return this.education;
    }

    public HouseholdRegisterResult setMaritalStatus(HouseholdWordItem maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public HouseholdWordItem getMaritalStatus() {
        return this.maritalStatus;
    }

    public HouseholdRegisterResult setVeteranStatus(HouseholdWordItem veteranStatus) {
        this.veteranStatus = veteranStatus;
        return this;
    }

    public HouseholdWordItem getVeteranStatus() {
        return this.veteranStatus;
    }

    public HouseholdRegisterResult setWorkAddress(HouseholdWordItem workAddress) {
        this.workAddress = workAddress;
        return this;
    }

    public HouseholdWordItem getWorkAddress() {
        return this.workAddress;
    }

    public HouseholdRegisterResult setCareer(HouseholdWordItem career) {
        this.career = career;
        return this;
    }

    public HouseholdWordItem getCareer() {
        return this.career;
    }

    public HouseholdRegisterResult setWwToCity(HouseholdWordItem wwToCity) {
        this.wwToCity = wwToCity;
        return this;
    }

    public HouseholdWordItem getWwToCity() {
        return this.wwToCity;
    }

    public HouseholdRegisterResult setWwHere(HouseholdWordItem wwHere) {
        this.wwHere = wwHere;
        return this;
    }

    public HouseholdWordItem getWwHere() {
        return this.wwHere;
    }

    public HouseholdRegisterResult setDate(HouseholdWordItem date) {
        this.date = date;
        return this;
    }

    public HouseholdWordItem getDate() {
        return this.date;
    }

    public HouseholdRegisterResult setHouseholdType(HouseholdWordItem householdType) {
        this.householdType = householdType;
        return this;
    }

    public HouseholdWordItem getHouseholdType() {
        return this.householdType;
    }

    public HouseholdRegisterResult setHouseholderName(HouseholdWordItem householderName) {
        this.householderName = householderName;
        return this;
    }

    public HouseholdWordItem getHouseholderName() {
        return this.householderName;
    }

    public HouseholdRegisterResult setAddress(HouseholdWordItem address) {
        this.address = address;
        return this;
    }

    public HouseholdWordItem getAddress() {
        return this.address;
    }

    public HouseholdRegisterResult setIssueDate(HouseholdWordItem issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public HouseholdWordItem getIssueDate() {
        return this.issueDate;
    }

    @Override
    public String toString() {
        return "HouseholdRegisterResult{" + "householdNum=" + householdNum + "\n" + "name=" + name + "\n" + "relationship=" + relationship + "\n" + "sex=" + sex + "\n"
                + "birthAddress=" + birthAddress + "\n" + "nation=" + nation + "\n" + "birthday=" + birthday + "\n" + "cardNo=" + cardNo + "\n" + "formerName=" + formerName + "\n"
                + "hometown=" + hometown + "\n" + "otherAddress=" + otherAddress + "\n" + "belief=" + belief + "\n" + "height=" + height + "\n" + "bloodType=" + bloodType + "\n"
                + "education=" + education + "\n" + "maritalStatus=" + maritalStatus + "\n" + "veteranStatus=" + veteranStatus + "\n" + "workAddress=" + workAddress + "\n"
                + "career=" + career + "\n" + "wwToCity=" + wwToCity + "\n" + "wwHere=" + wwHere + "\n" + "date=" + date + "\n" + "householdType=" + householdType + "\n"
                + "householderName=" + householderName + "\n" + "address=" + address + "\n" + "issueDate=" + issueDate + "\n" + "}";
    }

}