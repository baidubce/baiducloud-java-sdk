package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AirTicketWordsResult {
    /**
     * 发票名称
     */
    @JsonProperty("invoice_type_org")
    private String invoiceTypeOrg;

    /**
     * 姓名
     */
    private List<AirTicketWordItem> name;

    /**
     * 始发站
     */
    @JsonProperty("starting_station")
    private List<AirTicketWordItem> startingStation;

    /**
     * 目的站
     */
    @JsonProperty("destination_station")
    private List<AirTicketWordItem> destinationStation;

    /**
     * 航班号
     */
    private List<AirTicketWordItem> flight;

    /**
     * 日期
     */
    private List<AirTicketWordItem> date;

    /**
     * 电子客票号码
     */
    @JsonProperty("ticket_number")
    private List<AirTicketWordItem> ticketNumber;

    /**
     * 票价
     */
    private List<AirTicketWordItem> fare;

    /**
     * 民航发展基金/机建费
     */
    @JsonProperty("dev_fund")
    private List<AirTicketWordItem> devFund;

    /**
     * 燃油附加费
     */
    @JsonProperty("fuel_surcharge")
    private List<AirTicketWordItem> fuelSurcharge;

    /**
     * 其他税费
     */
    @JsonProperty("other_tax")
    private List<AirTicketWordItem> otherTax;

    /**
     * 合计金额
     */
    @JsonProperty("ticket_rates")
    private List<AirTicketWordItem> ticketRates;

    /**
     * 填开日期
     */
    @JsonProperty("issued_date")
    private List<AirTicketWordItem> issuedDate;

    /**
     * 身份证号
     */
    @JsonProperty("id_num")
    private List<AirTicketWordItem> idNum;

    /**
     * 承运人
     */
    private List<AirTicketWordItem> carrier;

    /**
     * 时间
     */
    private List<AirTicketWordItem> time;

    /**
     * 填开单位
     */
    @JsonProperty("issued_by")
    private List<AirTicketWordItem> issuedBy;

    /**
     * 印刷序号
     */
    @JsonProperty("serial_number")
    private List<AirTicketWordItem> serialNumber;

    /**
     * 保险费
     */
    private List<AirTicketWordItem> insurance;

    /**
     * 客票级别
     */
    @JsonProperty("fare_basis")
    private List<AirTicketWordItem> fareBasis;

    /**
     * 座位等级
     */
    @JsonProperty("class")
    private List<AirTicketWordItem> ocrClass;

    /**
     * 销售单位号
     */
    @JsonProperty("agent_code")
    private List<AirTicketWordItem> agentCode;

    /**
     * 签注
     */
    private List<AirTicketWordItem> endorsement;

    /**
     * 免费行李
     */
    private List<AirTicketWordItem> allow;

    /**
     * 验证码
     */
    private List<AirTicketWordItem> ck;

    /**
     * 客票生效日期
     */
    @JsonProperty("effective_date")
    private List<AirTicketWordItem> effectiveDate;

    /**
     * 有效期截止日期
     */
    @JsonProperty("expiration_date")
    private List<AirTicketWordItem> expirationDate;

    /**
     * 发票号码
     */
    @JsonProperty("invoice_num")
    private List<AirTicketWordItem> invoiceNum;

    /**
     * 增值税税率
     */
    @JsonProperty("commodity_tax_rate")
    private List<AirTicketWordItem> commodityTaxRate;

    /**
     * 增值税税额
     */
    @JsonProperty("commodity_tax")
    private List<AirTicketWordItem> commodityTax;

    /**
     * 购买方名称
     */
    @JsonProperty("purchaser_name")
    private List<AirTicketWordItem> purchaserName;

    /**
     * 统一社会信用代码/纳税人识别号
     */
    @JsonProperty("purchaser_register_num")
    private List<AirTicketWordItem> purchaserRegisterNum;

    /**
     * 国内国际标识
     */
    private List<AirTicketWordItem> identification;

    /**
     * 开票状态
     */
    @JsonProperty("invoice_status")
    private List<AirTicketWordItem> invoiceStatus;

    /**
     * 提示信息
     */
    private List<AirTicketWordItem> tip;

    /**
     * 服务类型
     */
    @JsonProperty("ServiceType")
    private List<AirTicketWordItem> serviceType;

    public AirTicketWordsResult setInvoiceTypeOrg(String invoiceTypeOrg) {
        this.invoiceTypeOrg = invoiceTypeOrg;
        return this;
    }

    public String getInvoiceTypeOrg() {
        return this.invoiceTypeOrg;
    }

    public AirTicketWordsResult setName(List<AirTicketWordItem> name) {
        this.name = name;
        return this;
    }

    public List<AirTicketWordItem> getName() {
        return this.name;
    }

    public AirTicketWordsResult setStartingStation(List<AirTicketWordItem> startingStation) {
        this.startingStation = startingStation;
        return this;
    }

    public List<AirTicketWordItem> getStartingStation() {
        return this.startingStation;
    }

    public AirTicketWordsResult setDestinationStation(List<AirTicketWordItem> destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    public List<AirTicketWordItem> getDestinationStation() {
        return this.destinationStation;
    }

    public AirTicketWordsResult setFlight(List<AirTicketWordItem> flight) {
        this.flight = flight;
        return this;
    }

    public List<AirTicketWordItem> getFlight() {
        return this.flight;
    }

    public AirTicketWordsResult setDate(List<AirTicketWordItem> date) {
        this.date = date;
        return this;
    }

    public List<AirTicketWordItem> getDate() {
        return this.date;
    }

    public AirTicketWordsResult setTicketNumber(List<AirTicketWordItem> ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }

    public List<AirTicketWordItem> getTicketNumber() {
        return this.ticketNumber;
    }

    public AirTicketWordsResult setFare(List<AirTicketWordItem> fare) {
        this.fare = fare;
        return this;
    }

    public List<AirTicketWordItem> getFare() {
        return this.fare;
    }

    public AirTicketWordsResult setDevFund(List<AirTicketWordItem> devFund) {
        this.devFund = devFund;
        return this;
    }

    public List<AirTicketWordItem> getDevFund() {
        return this.devFund;
    }

    public AirTicketWordsResult setFuelSurcharge(List<AirTicketWordItem> fuelSurcharge) {
        this.fuelSurcharge = fuelSurcharge;
        return this;
    }

    public List<AirTicketWordItem> getFuelSurcharge() {
        return this.fuelSurcharge;
    }

    public AirTicketWordsResult setOtherTax(List<AirTicketWordItem> otherTax) {
        this.otherTax = otherTax;
        return this;
    }

    public List<AirTicketWordItem> getOtherTax() {
        return this.otherTax;
    }

    public AirTicketWordsResult setTicketRates(List<AirTicketWordItem> ticketRates) {
        this.ticketRates = ticketRates;
        return this;
    }

    public List<AirTicketWordItem> getTicketRates() {
        return this.ticketRates;
    }

    public AirTicketWordsResult setIssuedDate(List<AirTicketWordItem> issuedDate) {
        this.issuedDate = issuedDate;
        return this;
    }

    public List<AirTicketWordItem> getIssuedDate() {
        return this.issuedDate;
    }

    public AirTicketWordsResult setIdNum(List<AirTicketWordItem> idNum) {
        this.idNum = idNum;
        return this;
    }

    public List<AirTicketWordItem> getIdNum() {
        return this.idNum;
    }

    public AirTicketWordsResult setCarrier(List<AirTicketWordItem> carrier) {
        this.carrier = carrier;
        return this;
    }

    public List<AirTicketWordItem> getCarrier() {
        return this.carrier;
    }

    public AirTicketWordsResult setTime(List<AirTicketWordItem> time) {
        this.time = time;
        return this;
    }

    public List<AirTicketWordItem> getTime() {
        return this.time;
    }

    public AirTicketWordsResult setIssuedBy(List<AirTicketWordItem> issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    public List<AirTicketWordItem> getIssuedBy() {
        return this.issuedBy;
    }

    public AirTicketWordsResult setSerialNumber(List<AirTicketWordItem> serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public List<AirTicketWordItem> getSerialNumber() {
        return this.serialNumber;
    }

    public AirTicketWordsResult setInsurance(List<AirTicketWordItem> insurance) {
        this.insurance = insurance;
        return this;
    }

    public List<AirTicketWordItem> getInsurance() {
        return this.insurance;
    }

    public AirTicketWordsResult setFareBasis(List<AirTicketWordItem> fareBasis) {
        this.fareBasis = fareBasis;
        return this;
    }

    public List<AirTicketWordItem> getFareBasis() {
        return this.fareBasis;
    }

    public AirTicketWordsResult setPropertyClass(List<AirTicketWordItem> ocrClass) {
        this.ocrClass = ocrClass;
        return this;
    }

    public List<AirTicketWordItem> getPropertyClass() {
        return this.ocrClass;
    }

    public AirTicketWordsResult setAgentCode(List<AirTicketWordItem> agentCode) {
        this.agentCode = agentCode;
        return this;
    }

    public List<AirTicketWordItem> getAgentCode() {
        return this.agentCode;
    }

    public AirTicketWordsResult setEndorsement(List<AirTicketWordItem> endorsement) {
        this.endorsement = endorsement;
        return this;
    }

    public List<AirTicketWordItem> getEndorsement() {
        return this.endorsement;
    }

    public AirTicketWordsResult setAllow(List<AirTicketWordItem> allow) {
        this.allow = allow;
        return this;
    }

    public List<AirTicketWordItem> getAllow() {
        return this.allow;
    }

    public AirTicketWordsResult setCk(List<AirTicketWordItem> ck) {
        this.ck = ck;
        return this;
    }

    public List<AirTicketWordItem> getCk() {
        return this.ck;
    }

    public AirTicketWordsResult setEffectiveDate(List<AirTicketWordItem> effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<AirTicketWordItem> getEffectiveDate() {
        return this.effectiveDate;
    }

    public AirTicketWordsResult setExpirationDate(List<AirTicketWordItem> expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public List<AirTicketWordItem> getExpirationDate() {
        return this.expirationDate;
    }

    public AirTicketWordsResult setInvoiceNum(List<AirTicketWordItem> invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public List<AirTicketWordItem> getInvoiceNum() {
        return this.invoiceNum;
    }

    public AirTicketWordsResult setCommodityTaxRate(List<AirTicketWordItem> commodityTaxRate) {
        this.commodityTaxRate = commodityTaxRate;
        return this;
    }

    public List<AirTicketWordItem> getCommodityTaxRate() {
        return this.commodityTaxRate;
    }

    public AirTicketWordsResult setCommodityTax(List<AirTicketWordItem> commodityTax) {
        this.commodityTax = commodityTax;
        return this;
    }

    public List<AirTicketWordItem> getCommodityTax() {
        return this.commodityTax;
    }

    public AirTicketWordsResult setPurchaserName(List<AirTicketWordItem> purchaserName) {
        this.purchaserName = purchaserName;
        return this;
    }

    public List<AirTicketWordItem> getPurchaserName() {
        return this.purchaserName;
    }

    public AirTicketWordsResult setPurchaserRegisterNum(List<AirTicketWordItem> purchaserRegisterNum) {
        this.purchaserRegisterNum = purchaserRegisterNum;
        return this;
    }

    public List<AirTicketWordItem> getPurchaserRegisterNum() {
        return this.purchaserRegisterNum;
    }

    public AirTicketWordsResult setIdentification(List<AirTicketWordItem> identification) {
        this.identification = identification;
        return this;
    }

    public List<AirTicketWordItem> getIdentification() {
        return this.identification;
    }

    public AirTicketWordsResult setInvoiceStatus(List<AirTicketWordItem> invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
        return this;
    }

    public List<AirTicketWordItem> getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public AirTicketWordsResult setTip(List<AirTicketWordItem> tip) {
        this.tip = tip;
        return this;
    }

    public List<AirTicketWordItem> getTip() {
        return this.tip;
    }

    public AirTicketWordsResult setServiceType(List<AirTicketWordItem> serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public List<AirTicketWordItem> getServiceType() {
        return this.serviceType;
    }

    @Override
    public String toString() {
        return "AirTicketWordsResult{" + "invoiceTypeOrg=" + invoiceTypeOrg + "\n" + "name=" + name + "\n" + "startingStation=" + startingStation + "\n" + "destinationStation="
                + destinationStation + "\n" + "flight=" + flight + "\n" + "date=" + date + "\n" + "ticketNumber=" + ticketNumber + "\n" + "fare=" + fare + "\n" + "devFund="
                + devFund + "\n" + "fuelSurcharge=" + fuelSurcharge + "\n" + "otherTax=" + otherTax + "\n" + "ticketRates=" + ticketRates + "\n" + "issuedDate=" + issuedDate
                + "\n" + "idNum=" + idNum + "\n" + "carrier=" + carrier + "\n" + "time=" + time + "\n" + "issuedBy=" + issuedBy + "\n" + "serialNumber=" + serialNumber + "\n"
                + "insurance=" + insurance + "\n" + "fareBasis=" + fareBasis + "\n" + "ocrClass=" + ocrClass + "\n" + "agentCode=" + agentCode + "\n" + "endorsement="
                + endorsement + "\n" + "allow=" + allow + "\n" + "ck=" + ck + "\n" + "effectiveDate=" + effectiveDate + "\n" + "expirationDate=" + expirationDate + "\n"
                + "invoiceNum=" + invoiceNum + "\n" + "commodityTaxRate=" + commodityTaxRate + "\n" + "commodityTax=" + commodityTax + "\n" + "purchaserName=" + purchaserName
                + "\n" + "purchaserRegisterNum=" + purchaserRegisterNum + "\n" + "identification=" + identification + "\n" + "invoiceStatus=" + invoiceStatus + "\n" + "tip=" + tip
                + "\n" + "serviceType=" + serviceType + "\n" + "}";
    }

}