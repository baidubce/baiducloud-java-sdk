package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HkMacauTaiwanExitentrypermitResult {
    /**
     * 证件号码
     */
    @JsonProperty("card_number")
    private List<HkMacauTaiwanExitentrypermitField> cardNumber;

    /**
     * 姓名
     */
    @JsonProperty("name_chn")
    private List<HkMacauTaiwanExitentrypermitField> nameChn;

    /**
     * 姓名（英文）
     */
    @JsonProperty("name_eng")
    private List<HkMacauTaiwanExitentrypermitField> nameEng;

    /**
     * 出生日期
     */
    private List<HkMacauTaiwanExitentrypermitField> birthday;

    /**
     * 性别
     */
    private List<HkMacauTaiwanExitentrypermitField> sex;

    /**
     * 有效期限
     */
    @JsonProperty("valid_date")
    private List<HkMacauTaiwanExitentrypermitField> validDate;

    /**
     * 签发机关
     */
    @JsonProperty("issue_authority")
    private List<HkMacauTaiwanExitentrypermitField> issueAuthority;

    /**
     * 签发地点
     */
    @JsonProperty("issue_place")
    private List<HkMacauTaiwanExitentrypermitField> issuePlace;

    /**
     * 证件下方第一行
     */
    @JsonProperty("MRZCode")
    private List<HkMacauTaiwanExitentrypermitField> mrZCode;

    /**
     * 来往香港签注-种类
     */
    @JsonProperty("hk_type")
    private List<HkMacauTaiwanExitentrypermitField> hkType;

    /**
     * 来往香港签注-有效期
     */
    @JsonProperty("hk_valid_date")
    private List<HkMacauTaiwanExitentrypermitField> hkValidDate;

    /**
     * 来往香港签注-备注
     */
    @JsonProperty("hk_remarks")
    private List<HkMacauTaiwanExitentrypermitField> hkRemarks;

    /**
     * 来往香港签注-往返有效
     */
    @JsonProperty("hk_round_trip_number")
    private List<HkMacauTaiwanExitentrypermitField> hkRoundTripNumber;

    /**
     * 来往澳门签注-种类
     */
    @JsonProperty("mc_type")
    private List<HkMacauTaiwanExitentrypermitField> mcType;

    /**
     * 来往澳门签注-有效期
     */
    @JsonProperty("mc_valid_date")
    private List<HkMacauTaiwanExitentrypermitField> mcValidDate;

    /**
     * 来往澳门签注-备注
     */
    @JsonProperty("mc_remarks")
    private List<HkMacauTaiwanExitentrypermitField> mcRemarks;

    /**
     * 来往澳门签注-往返有效
     */
    @JsonProperty("mc_round_trip_number")
    private List<HkMacauTaiwanExitentrypermitField> mcRoundTripNumber;

    /**
     * 种类
     */
    private List<HkMacauTaiwanExitentrypermitField> type;

    /**
     * 备注
     */
    private List<HkMacauTaiwanExitentrypermitField> remarks;

    /**
     * 往返有效
     */
    @JsonProperty("round_trip_number")
    private List<HkMacauTaiwanExitentrypermitField> roundTripNumber;

    /**
     * 签发次数
     */
    @JsonProperty("issue_times")
    private List<HkMacauTaiwanExitentrypermitField> issueTimes;

    /**
     * 身份证姓名
     */
    @JsonProperty("idcard_name")
    private List<HkMacauTaiwanExitentrypermitField> idcardName;

    /**
     * 身份证号码
     */
    @JsonProperty("idcard_number")
    private List<HkMacauTaiwanExitentrypermitField> idcardNumber;

    /**
     * 证件下方第一行
     */
    @JsonProperty("MRZCode1")
    private List<HkMacauTaiwanExitentrypermitField> mrZCode1;

    /**
     * 证件下方第二行
     */
    @JsonProperty("MRZCode2")
    private List<HkMacauTaiwanExitentrypermitField> mrZCode2;

    public HkMacauTaiwanExitentrypermitResult setCardNumber(List<HkMacauTaiwanExitentrypermitField> cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getCardNumber() {
        return this.cardNumber;
    }

    public HkMacauTaiwanExitentrypermitResult setNameChn(List<HkMacauTaiwanExitentrypermitField> nameChn) {
        this.nameChn = nameChn;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getNameChn() {
        return this.nameChn;
    }

    public HkMacauTaiwanExitentrypermitResult setNameEng(List<HkMacauTaiwanExitentrypermitField> nameEng) {
        this.nameEng = nameEng;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getNameEng() {
        return this.nameEng;
    }

    public HkMacauTaiwanExitentrypermitResult setBirthday(List<HkMacauTaiwanExitentrypermitField> birthday) {
        this.birthday = birthday;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getBirthday() {
        return this.birthday;
    }

    public HkMacauTaiwanExitentrypermitResult setSex(List<HkMacauTaiwanExitentrypermitField> sex) {
        this.sex = sex;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getSex() {
        return this.sex;
    }

    public HkMacauTaiwanExitentrypermitResult setValidDate(List<HkMacauTaiwanExitentrypermitField> validDate) {
        this.validDate = validDate;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getValidDate() {
        return this.validDate;
    }

    public HkMacauTaiwanExitentrypermitResult setIssueAuthority(List<HkMacauTaiwanExitentrypermitField> issueAuthority) {
        this.issueAuthority = issueAuthority;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getIssueAuthority() {
        return this.issueAuthority;
    }

    public HkMacauTaiwanExitentrypermitResult setIssuePlace(List<HkMacauTaiwanExitentrypermitField> issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getIssuePlace() {
        return this.issuePlace;
    }

    public HkMacauTaiwanExitentrypermitResult setMrZCode(List<HkMacauTaiwanExitentrypermitField> mrZCode) {
        this.mrZCode = mrZCode;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMrZCode() {
        return this.mrZCode;
    }

    public HkMacauTaiwanExitentrypermitResult setHkType(List<HkMacauTaiwanExitentrypermitField> hkType) {
        this.hkType = hkType;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getHkType() {
        return this.hkType;
    }

    public HkMacauTaiwanExitentrypermitResult setHkValidDate(List<HkMacauTaiwanExitentrypermitField> hkValidDate) {
        this.hkValidDate = hkValidDate;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getHkValidDate() {
        return this.hkValidDate;
    }

    public HkMacauTaiwanExitentrypermitResult setHkRemarks(List<HkMacauTaiwanExitentrypermitField> hkRemarks) {
        this.hkRemarks = hkRemarks;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getHkRemarks() {
        return this.hkRemarks;
    }

    public HkMacauTaiwanExitentrypermitResult setHkRoundTripNumber(List<HkMacauTaiwanExitentrypermitField> hkRoundTripNumber) {
        this.hkRoundTripNumber = hkRoundTripNumber;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getHkRoundTripNumber() {
        return this.hkRoundTripNumber;
    }

    public HkMacauTaiwanExitentrypermitResult setMcType(List<HkMacauTaiwanExitentrypermitField> mcType) {
        this.mcType = mcType;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMcType() {
        return this.mcType;
    }

    public HkMacauTaiwanExitentrypermitResult setMcValidDate(List<HkMacauTaiwanExitentrypermitField> mcValidDate) {
        this.mcValidDate = mcValidDate;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMcValidDate() {
        return this.mcValidDate;
    }

    public HkMacauTaiwanExitentrypermitResult setMcRemarks(List<HkMacauTaiwanExitentrypermitField> mcRemarks) {
        this.mcRemarks = mcRemarks;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMcRemarks() {
        return this.mcRemarks;
    }

    public HkMacauTaiwanExitentrypermitResult setMcRoundTripNumber(List<HkMacauTaiwanExitentrypermitField> mcRoundTripNumber) {
        this.mcRoundTripNumber = mcRoundTripNumber;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMcRoundTripNumber() {
        return this.mcRoundTripNumber;
    }

    public HkMacauTaiwanExitentrypermitResult setType(List<HkMacauTaiwanExitentrypermitField> type) {
        this.type = type;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getType() {
        return this.type;
    }

    public HkMacauTaiwanExitentrypermitResult setRemarks(List<HkMacauTaiwanExitentrypermitField> remarks) {
        this.remarks = remarks;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getRemarks() {
        return this.remarks;
    }

    public HkMacauTaiwanExitentrypermitResult setRoundTripNumber(List<HkMacauTaiwanExitentrypermitField> roundTripNumber) {
        this.roundTripNumber = roundTripNumber;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getRoundTripNumber() {
        return this.roundTripNumber;
    }

    public HkMacauTaiwanExitentrypermitResult setIssueTimes(List<HkMacauTaiwanExitentrypermitField> issueTimes) {
        this.issueTimes = issueTimes;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getIssueTimes() {
        return this.issueTimes;
    }

    public HkMacauTaiwanExitentrypermitResult setIdcardName(List<HkMacauTaiwanExitentrypermitField> idcardName) {
        this.idcardName = idcardName;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getIdcardName() {
        return this.idcardName;
    }

    public HkMacauTaiwanExitentrypermitResult setIdcardNumber(List<HkMacauTaiwanExitentrypermitField> idcardNumber) {
        this.idcardNumber = idcardNumber;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getIdcardNumber() {
        return this.idcardNumber;
    }

    public HkMacauTaiwanExitentrypermitResult setMrZCode1(List<HkMacauTaiwanExitentrypermitField> mrZCode1) {
        this.mrZCode1 = mrZCode1;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMrZCode1() {
        return this.mrZCode1;
    }

    public HkMacauTaiwanExitentrypermitResult setMrZCode2(List<HkMacauTaiwanExitentrypermitField> mrZCode2) {
        this.mrZCode2 = mrZCode2;
        return this;
    }

    public List<HkMacauTaiwanExitentrypermitField> getMrZCode2() {
        return this.mrZCode2;
    }

    @Override
    public String toString() {
        return "HkMacauTaiwanExitentrypermitResult{" + "cardNumber=" + cardNumber + "\n" + "nameChn=" + nameChn + "\n" + "nameEng=" + nameEng + "\n" + "birthday=" + birthday
                + "\n" + "sex=" + sex + "\n" + "validDate=" + validDate + "\n" + "issueAuthority=" + issueAuthority + "\n" + "issuePlace=" + issuePlace + "\n" + "mrZCode="
                + mrZCode + "\n" + "hkType=" + hkType + "\n" + "hkValidDate=" + hkValidDate + "\n" + "hkRemarks=" + hkRemarks + "\n" + "hkRoundTripNumber=" + hkRoundTripNumber
                + "\n" + "mcType=" + mcType + "\n" + "mcValidDate=" + mcValidDate + "\n" + "mcRemarks=" + mcRemarks + "\n" + "mcRoundTripNumber=" + mcRoundTripNumber + "\n"
                + "type=" + type + "\n" + "remarks=" + remarks + "\n" + "roundTripNumber=" + roundTripNumber + "\n" + "issueTimes=" + issueTimes + "\n" + "idcardName="
                + idcardName + "\n" + "idcardNumber=" + idcardNumber + "\n" + "mrZCode1=" + mrZCode1 + "\n" + "mrZCode2=" + mrZCode2 + "\n" + "}";
    }

}