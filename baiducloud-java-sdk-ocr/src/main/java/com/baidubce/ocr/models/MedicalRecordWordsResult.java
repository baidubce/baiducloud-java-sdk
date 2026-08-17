package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalRecordWordsResult {
    /**
     * recordNum
     */
    @JsonProperty("RecordNum")
    private MedicalRecordFieldValue recordNum;

    /**
     * name
     */
    @JsonProperty("Name")
    private MedicalRecordFieldValue name;

    /**
     * sex
     */
    @JsonProperty("Sex")
    private MedicalRecordFieldValue sex;

    /**
     * birthday
     */
    @JsonProperty("Birthday")
    private MedicalRecordFieldValue birthday;

    /**
     * age
     */
    @JsonProperty("Age")
    private MedicalRecordFieldValue age;

    /**
     * career
     */
    @JsonProperty("Career")
    private MedicalRecordFieldValue career;

    /**
     * maritalStatus
     */
    @JsonProperty("MaritalStatus")
    private MedicalRecordFieldValue maritalStatus;

    /**
     * nation
     */
    @JsonProperty("Nation")
    private MedicalRecordFieldValue nation;

    /**
     * id
     */
    @JsonProperty("ID")
    private MedicalRecordFieldValue id;

    /**
     * nationality
     */
    @JsonProperty("Nationality")
    private MedicalRecordFieldValue nationality;

    /**
     * admissionDepartment
     */
    @JsonProperty("AdmissionDepartment")
    private MedicalRecordFieldValue admissionDepartment;

    /**
     * dischargeDepartment
     */
    @JsonProperty("DischargeDepartment")
    private MedicalRecordFieldValue dischargeDepartment;

    /**
     * hospitalDay
     */
    @JsonProperty("HospitalDay")
    private MedicalRecordFieldValue hospitalDay;

    /**
     * allergy
     */
    @JsonProperty("Allergy")
    private MedicalRecordFieldValue allergy;

    /**
     * bloodType
     */
    @JsonProperty("BloodType")
    private MedicalRecordFieldValue bloodType;

    public MedicalRecordWordsResult setRecordNum(MedicalRecordFieldValue recordNum) {
        this.recordNum = recordNum;
        return this;
    }

    public MedicalRecordFieldValue getRecordNum() {
        return this.recordNum;
    }

    public MedicalRecordWordsResult setName(MedicalRecordFieldValue name) {
        this.name = name;
        return this;
    }

    public MedicalRecordFieldValue getName() {
        return this.name;
    }

    public MedicalRecordWordsResult setSex(MedicalRecordFieldValue sex) {
        this.sex = sex;
        return this;
    }

    public MedicalRecordFieldValue getSex() {
        return this.sex;
    }

    public MedicalRecordWordsResult setBirthday(MedicalRecordFieldValue birthday) {
        this.birthday = birthday;
        return this;
    }

    public MedicalRecordFieldValue getBirthday() {
        return this.birthday;
    }

    public MedicalRecordWordsResult setAge(MedicalRecordFieldValue age) {
        this.age = age;
        return this;
    }

    public MedicalRecordFieldValue getAge() {
        return this.age;
    }

    public MedicalRecordWordsResult setCareer(MedicalRecordFieldValue career) {
        this.career = career;
        return this;
    }

    public MedicalRecordFieldValue getCareer() {
        return this.career;
    }

    public MedicalRecordWordsResult setMaritalStatus(MedicalRecordFieldValue maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public MedicalRecordFieldValue getMaritalStatus() {
        return this.maritalStatus;
    }

    public MedicalRecordWordsResult setNation(MedicalRecordFieldValue nation) {
        this.nation = nation;
        return this;
    }

    public MedicalRecordFieldValue getNation() {
        return this.nation;
    }

    public MedicalRecordWordsResult setId(MedicalRecordFieldValue id) {
        this.id = id;
        return this;
    }

    public MedicalRecordFieldValue getId() {
        return this.id;
    }

    public MedicalRecordWordsResult setNationality(MedicalRecordFieldValue nationality) {
        this.nationality = nationality;
        return this;
    }

    public MedicalRecordFieldValue getNationality() {
        return this.nationality;
    }

    public MedicalRecordWordsResult setAdmissionDepartment(MedicalRecordFieldValue admissionDepartment) {
        this.admissionDepartment = admissionDepartment;
        return this;
    }

    public MedicalRecordFieldValue getAdmissionDepartment() {
        return this.admissionDepartment;
    }

    public MedicalRecordWordsResult setDischargeDepartment(MedicalRecordFieldValue dischargeDepartment) {
        this.dischargeDepartment = dischargeDepartment;
        return this;
    }

    public MedicalRecordFieldValue getDischargeDepartment() {
        return this.dischargeDepartment;
    }

    public MedicalRecordWordsResult setHospitalDay(MedicalRecordFieldValue hospitalDay) {
        this.hospitalDay = hospitalDay;
        return this;
    }

    public MedicalRecordFieldValue getHospitalDay() {
        return this.hospitalDay;
    }

    public MedicalRecordWordsResult setAllergy(MedicalRecordFieldValue allergy) {
        this.allergy = allergy;
        return this;
    }

    public MedicalRecordFieldValue getAllergy() {
        return this.allergy;
    }

    public MedicalRecordWordsResult setBloodType(MedicalRecordFieldValue bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    public MedicalRecordFieldValue getBloodType() {
        return this.bloodType;
    }

    @Override
    public String toString() {
        return "MedicalRecordWordsResult{" + "recordNum=" + recordNum + "\n" + "name=" + name + "\n" + "sex=" + sex + "\n" + "birthday=" + birthday + "\n" + "age=" + age + "\n"
                + "career=" + career + "\n" + "maritalStatus=" + maritalStatus + "\n" + "nation=" + nation + "\n" + "id=" + id + "\n" + "nationality=" + nationality + "\n"
                + "admissionDepartment=" + admissionDepartment + "\n" + "dischargeDepartment=" + dischargeDepartment + "\n" + "hospitalDay=" + hospitalDay + "\n" + "allergy="
                + allergy + "\n" + "bloodType=" + bloodType + "\n" + "}";
    }

}