package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsedVehicleInvoiceWordResult {
    /**
     * 发票标题
     */
    @JsonProperty("InvoiceHeader")
    private String invoiceHeader;

    /**
     * invoiceCode
     */
    @JsonProperty("InvoiceCode")
    private UsedVehicleInvoiceWordItem invoiceCode;

    /**
     * invoiceNum
     */
    @JsonProperty("InvoiceNum")
    private UsedVehicleInvoiceWordItem invoiceNum;

    /**
     * invoiceDate
     */
    @JsonProperty("InvoiceDate")
    private UsedVehicleInvoiceWordItem invoiceDate;

    /**
     * taxCode
     */
    @JsonProperty("TaxCode")
    private UsedVehicleInvoiceWordItem taxCode;

    /**
     * purchaser
     */
    @JsonProperty("Purchaser")
    private UsedVehicleInvoiceWordItem purchaser;

    /**
     * purchaserCode
     */
    @JsonProperty("PurchaserCode")
    private UsedVehicleInvoiceWordItem purchaserCode;

    /**
     * purchaserAddress
     */
    @JsonProperty("PurchaserAddress")
    private UsedVehicleInvoiceWordItem purchaserAddress;

    /**
     * purchaserPhone
     */
    @JsonProperty("PurchaserPhone")
    private UsedVehicleInvoiceWordItem purchaserPhone;

    /**
     * saler
     */
    @JsonProperty("Saler")
    private UsedVehicleInvoiceWordItem saler;

    /**
     * salerCode
     */
    @JsonProperty("SalerCode")
    private UsedVehicleInvoiceWordItem salerCode;

    /**
     * salerAddress
     */
    @JsonProperty("SalerAddress")
    private UsedVehicleInvoiceWordItem salerAddress;

    /**
     * salerPhone
     */
    @JsonProperty("SalerPhone")
    private UsedVehicleInvoiceWordItem salerPhone;

    /**
     * licensePlateNum
     */
    @JsonProperty("LicensePlateNum")
    private UsedVehicleInvoiceWordItem licensePlateNum;

    /**
     * registrationCode
     */
    @JsonProperty("RegistrationCode")
    private UsedVehicleInvoiceWordItem registrationCode;

    /**
     * vehicleType
     */
    @JsonProperty("VehicleType")
    private UsedVehicleInvoiceWordItem vehicleType;

    /**
     * vinNum
     */
    @JsonProperty("VinNum")
    private UsedVehicleInvoiceWordItem vinNum;

    /**
     * manuModel
     */
    @JsonProperty("ManuModel")
    private UsedVehicleInvoiceWordItem manuModel;

    /**
     * transferVehicleManagementOffice
     */
    @JsonProperty("TransferVehicleManagementOffice")
    private UsedVehicleInvoiceWordItem transferVehicleManagementOffice;

    /**
     * totalCarPrice
     */
    @JsonProperty("TotalCarPrice")
    private UsedVehicleInvoiceWordItem totalCarPrice;

    /**
     * totalCarPriceLow
     */
    @JsonProperty("TotalCarPriceLow")
    private UsedVehicleInvoiceWordItem totalCarPriceLow;

    /**
     * usedCarMarket
     */
    @JsonProperty("UsedCarMarket")
    private UsedVehicleInvoiceWordItem usedCarMarket;

    /**
     * taxNum
     */
    @JsonProperty("TaxNum")
    private UsedVehicleInvoiceWordItem taxNum;

    /**
     * taxAddress
     */
    @JsonProperty("TaxAddress")
    private UsedVehicleInvoiceWordItem taxAddress;

    /**
     * taxPhone
     */
    @JsonProperty("TaxPhone")
    private UsedVehicleInvoiceWordItem taxPhone;

    /**
     * sheetNum
     */
    @JsonProperty("SheetNum")
    private UsedVehicleInvoiceWordItem sheetNum;

    /**
     * invoiceNumDigit
     */
    @JsonProperty("InvoiceNumDigit")
    private UsedVehicleInvoiceWordItem invoiceNumDigit;

    public UsedVehicleInvoiceWordResult setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
        return this;
    }

    public String getInvoiceHeader() {
        return this.invoiceHeader;
    }

    public UsedVehicleInvoiceWordResult setInvoiceCode(UsedVehicleInvoiceWordItem invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public UsedVehicleInvoiceWordItem getInvoiceCode() {
        return this.invoiceCode;
    }

    public UsedVehicleInvoiceWordResult setInvoiceNum(UsedVehicleInvoiceWordItem invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public UsedVehicleInvoiceWordItem getInvoiceNum() {
        return this.invoiceNum;
    }

    public UsedVehicleInvoiceWordResult setInvoiceDate(UsedVehicleInvoiceWordItem invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public UsedVehicleInvoiceWordItem getInvoiceDate() {
        return this.invoiceDate;
    }

    public UsedVehicleInvoiceWordResult setTaxCode(UsedVehicleInvoiceWordItem taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTaxCode() {
        return this.taxCode;
    }

    public UsedVehicleInvoiceWordResult setPurchaser(UsedVehicleInvoiceWordItem purchaser) {
        this.purchaser = purchaser;
        return this;
    }

    public UsedVehicleInvoiceWordItem getPurchaser() {
        return this.purchaser;
    }

    public UsedVehicleInvoiceWordResult setPurchaserCode(UsedVehicleInvoiceWordItem purchaserCode) {
        this.purchaserCode = purchaserCode;
        return this;
    }

    public UsedVehicleInvoiceWordItem getPurchaserCode() {
        return this.purchaserCode;
    }

    public UsedVehicleInvoiceWordResult setPurchaserAddress(UsedVehicleInvoiceWordItem purchaserAddress) {
        this.purchaserAddress = purchaserAddress;
        return this;
    }

    public UsedVehicleInvoiceWordItem getPurchaserAddress() {
        return this.purchaserAddress;
    }

    public UsedVehicleInvoiceWordResult setPurchaserPhone(UsedVehicleInvoiceWordItem purchaserPhone) {
        this.purchaserPhone = purchaserPhone;
        return this;
    }

    public UsedVehicleInvoiceWordItem getPurchaserPhone() {
        return this.purchaserPhone;
    }

    public UsedVehicleInvoiceWordResult setSaler(UsedVehicleInvoiceWordItem saler) {
        this.saler = saler;
        return this;
    }

    public UsedVehicleInvoiceWordItem getSaler() {
        return this.saler;
    }

    public UsedVehicleInvoiceWordResult setSalerCode(UsedVehicleInvoiceWordItem salerCode) {
        this.salerCode = salerCode;
        return this;
    }

    public UsedVehicleInvoiceWordItem getSalerCode() {
        return this.salerCode;
    }

    public UsedVehicleInvoiceWordResult setSalerAddress(UsedVehicleInvoiceWordItem salerAddress) {
        this.salerAddress = salerAddress;
        return this;
    }

    public UsedVehicleInvoiceWordItem getSalerAddress() {
        return this.salerAddress;
    }

    public UsedVehicleInvoiceWordResult setSalerPhone(UsedVehicleInvoiceWordItem salerPhone) {
        this.salerPhone = salerPhone;
        return this;
    }

    public UsedVehicleInvoiceWordItem getSalerPhone() {
        return this.salerPhone;
    }

    public UsedVehicleInvoiceWordResult setLicensePlateNum(UsedVehicleInvoiceWordItem licensePlateNum) {
        this.licensePlateNum = licensePlateNum;
        return this;
    }

    public UsedVehicleInvoiceWordItem getLicensePlateNum() {
        return this.licensePlateNum;
    }

    public UsedVehicleInvoiceWordResult setRegistrationCode(UsedVehicleInvoiceWordItem registrationCode) {
        this.registrationCode = registrationCode;
        return this;
    }

    public UsedVehicleInvoiceWordItem getRegistrationCode() {
        return this.registrationCode;
    }

    public UsedVehicleInvoiceWordResult setVehicleType(UsedVehicleInvoiceWordItem vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public UsedVehicleInvoiceWordItem getVehicleType() {
        return this.vehicleType;
    }

    public UsedVehicleInvoiceWordResult setVinNum(UsedVehicleInvoiceWordItem vinNum) {
        this.vinNum = vinNum;
        return this;
    }

    public UsedVehicleInvoiceWordItem getVinNum() {
        return this.vinNum;
    }

    public UsedVehicleInvoiceWordResult setManuModel(UsedVehicleInvoiceWordItem manuModel) {
        this.manuModel = manuModel;
        return this;
    }

    public UsedVehicleInvoiceWordItem getManuModel() {
        return this.manuModel;
    }

    public UsedVehicleInvoiceWordResult setTransferVehicleManagementOffice(UsedVehicleInvoiceWordItem transferVehicleManagementOffice) {
        this.transferVehicleManagementOffice = transferVehicleManagementOffice;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTransferVehicleManagementOffice() {
        return this.transferVehicleManagementOffice;
    }

    public UsedVehicleInvoiceWordResult setTotalCarPrice(UsedVehicleInvoiceWordItem totalCarPrice) {
        this.totalCarPrice = totalCarPrice;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTotalCarPrice() {
        return this.totalCarPrice;
    }

    public UsedVehicleInvoiceWordResult setTotalCarPriceLow(UsedVehicleInvoiceWordItem totalCarPriceLow) {
        this.totalCarPriceLow = totalCarPriceLow;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTotalCarPriceLow() {
        return this.totalCarPriceLow;
    }

    public UsedVehicleInvoiceWordResult setUsedCarMarket(UsedVehicleInvoiceWordItem usedCarMarket) {
        this.usedCarMarket = usedCarMarket;
        return this;
    }

    public UsedVehicleInvoiceWordItem getUsedCarMarket() {
        return this.usedCarMarket;
    }

    public UsedVehicleInvoiceWordResult setTaxNum(UsedVehicleInvoiceWordItem taxNum) {
        this.taxNum = taxNum;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTaxNum() {
        return this.taxNum;
    }

    public UsedVehicleInvoiceWordResult setTaxAddress(UsedVehicleInvoiceWordItem taxAddress) {
        this.taxAddress = taxAddress;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTaxAddress() {
        return this.taxAddress;
    }

    public UsedVehicleInvoiceWordResult setTaxPhone(UsedVehicleInvoiceWordItem taxPhone) {
        this.taxPhone = taxPhone;
        return this;
    }

    public UsedVehicleInvoiceWordItem getTaxPhone() {
        return this.taxPhone;
    }

    public UsedVehicleInvoiceWordResult setSheetNum(UsedVehicleInvoiceWordItem sheetNum) {
        this.sheetNum = sheetNum;
        return this;
    }

    public UsedVehicleInvoiceWordItem getSheetNum() {
        return this.sheetNum;
    }

    public UsedVehicleInvoiceWordResult setInvoiceNumDigit(UsedVehicleInvoiceWordItem invoiceNumDigit) {
        this.invoiceNumDigit = invoiceNumDigit;
        return this;
    }

    public UsedVehicleInvoiceWordItem getInvoiceNumDigit() {
        return this.invoiceNumDigit;
    }

    @Override
    public String toString() {
        return "UsedVehicleInvoiceWordResult{" + "invoiceHeader=" + invoiceHeader + "\n" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "invoiceDate="
                + invoiceDate + "\n" + "taxCode=" + taxCode + "\n" + "purchaser=" + purchaser + "\n" + "purchaserCode=" + purchaserCode + "\n" + "purchaserAddress="
                + purchaserAddress + "\n" + "purchaserPhone=" + purchaserPhone + "\n" + "saler=" + saler + "\n" + "salerCode=" + salerCode + "\n" + "salerAddress=" + salerAddress
                + "\n" + "salerPhone=" + salerPhone + "\n" + "licensePlateNum=" + licensePlateNum + "\n" + "registrationCode=" + registrationCode + "\n" + "vehicleType="
                + vehicleType + "\n" + "vinNum=" + vinNum + "\n" + "manuModel=" + manuModel + "\n" + "transferVehicleManagementOffice=" + transferVehicleManagementOffice + "\n"
                + "totalCarPrice=" + totalCarPrice + "\n" + "totalCarPriceLow=" + totalCarPriceLow + "\n" + "usedCarMarket=" + usedCarMarket + "\n" + "taxNum=" + taxNum + "\n"
                + "taxAddress=" + taxAddress + "\n" + "taxPhone=" + taxPhone + "\n" + "sheetNum=" + sheetNum + "\n" + "invoiceNumDigit=" + invoiceNumDigit + "\n" + "}";
    }

}