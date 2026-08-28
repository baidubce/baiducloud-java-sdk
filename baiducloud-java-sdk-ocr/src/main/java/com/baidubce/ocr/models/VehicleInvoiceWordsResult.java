package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleInvoiceWordsResult {
    /**
     * 发票标题
     */
    @JsonProperty("InvoiceHeader")
    private String invoiceHeader;

    /**
     * 发票代码
     */
    @JsonProperty("InvoiceCode")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("InvoiceNum")
    private String invoiceNum;

    /**
     * 机打代码
     */
    @JsonProperty("PrintedCode")
    private String printedCode;

    /**
     * 机打号码
     */
    @JsonProperty("PrintedNum")
    private String printedNum;

    /**
     * 开票日期
     */
    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    /**
     * 机器编号
     */
    @JsonProperty("MachineCode")
    private String machineCode;

    /**
     * 购买方名称
     */
    @JsonProperty("Purchaser")
    private String purchaser;

    /**
     * 购买方身份证号码/组织机构代码
     */
    @JsonProperty("PurchaserCode")
    private String purchaserCode;

    /**
     * 车辆类型
     */
    @JsonProperty("VehicleType")
    private String vehicleType;

    /**
     * 厂牌型号
     */
    @JsonProperty("ManuModel")
    private String manuModel;

    /**
     * 产地
     */
    @JsonProperty("Origin")
    private String origin;

    /**
     * 合格证号
     */
    @JsonProperty("CertificateNum")
    private String certificateNum;

    /**
     * 发动机号码
     */
    @JsonProperty("EngineNum")
    private String engineNum;

    /**
     * 车架号码
     */
    @JsonProperty("VinNum")
    private String vinNum;

    /**
     * 价税合计
     */
    @JsonProperty("PriceTax")
    private String priceTax;

    /**
     * 价税合计小写
     */
    @JsonProperty("PriceTaxLow")
    private String priceTaxLow;

    /**
     * 销货单位名称
     */
    @JsonProperty("Saler")
    private String saler;

    /**
     * 销货单位电话
     */
    @JsonProperty("SalerPhone")
    private String salerPhone;

    /**
     * 销货单位纳税人识别号
     */
    @JsonProperty("SalerCode")
    private String salerCode;

    /**
     * 销货单位账号
     */
    @JsonProperty("SalerAccountNum")
    private String salerAccountNum;

    /**
     * 销货单位地址
     */
    @JsonProperty("SalerAddress")
    private String salerAddress;

    /**
     * 销货单位开户银行
     */
    @JsonProperty("SalerBank")
    private String salerBank;

    /**
     * 税率
     */
    @JsonProperty("TaxRate")
    private String taxRate;

    /**
     * 税额
     */
    @JsonProperty("Tax")
    private String tax;

    /**
     * 主管税务机关
     */
    @JsonProperty("TaxAuthor")
    private String taxAuthor;

    /**
     * 主管税务机关代码
     */
    @JsonProperty("TaxAuthorCode")
    private String taxAuthorCode;

    /**
     * 不含税价格
     */
    @JsonProperty("Price")
    private String price;

    /**
     * 限乘人数
     */
    @JsonProperty("LimitPassenger")
    private String limitPassenger;

    /**
     * 吨位
     */
    private String toonage;

    /**
     * 联次
     */
    @JsonProperty("sheet-num")
    private String sheetNum;

    /**
     * 开票人
     */
    private String drawer;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 进口证明书号
     */
    @JsonProperty("import-certificate-num")
    private String importCertificateNum;

    /**
     * 完整凭税编号
     */
    @JsonProperty("tax-payment-voucher-no")
    private String taxPaymentVoucherNo;

    /**
     * 商检单号
     */
    @JsonProperty("inspection-form-num")
    private String inspectionFormNum;

    /**
     * 税控码
     */
    @JsonProperty("tax-code")
    private String taxCode;

    /**
     * 发票号码（数字）
     */
    @JsonProperty("InvoiceNumDigit")
    private String invoiceNumDigit;

    public VehicleInvoiceWordsResult setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
        return this;
    }

    public String getInvoiceHeader() {
        return this.invoiceHeader;
    }

    public VehicleInvoiceWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public VehicleInvoiceWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public VehicleInvoiceWordsResult setPrintedCode(String printedCode) {
        this.printedCode = printedCode;
        return this;
    }

    public String getPrintedCode() {
        return this.printedCode;
    }

    public VehicleInvoiceWordsResult setPrintedNum(String printedNum) {
        this.printedNum = printedNum;
        return this;
    }

    public String getPrintedNum() {
        return this.printedNum;
    }

    public VehicleInvoiceWordsResult setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public VehicleInvoiceWordsResult setMachineCode(String machineCode) {
        this.machineCode = machineCode;
        return this;
    }

    public String getMachineCode() {
        return this.machineCode;
    }

    public VehicleInvoiceWordsResult setPurchaser(String purchaser) {
        this.purchaser = purchaser;
        return this;
    }

    public String getPurchaser() {
        return this.purchaser;
    }

    public VehicleInvoiceWordsResult setPurchaserCode(String purchaserCode) {
        this.purchaserCode = purchaserCode;
        return this;
    }

    public String getPurchaserCode() {
        return this.purchaserCode;
    }

    public VehicleInvoiceWordsResult setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public VehicleInvoiceWordsResult setManuModel(String manuModel) {
        this.manuModel = manuModel;
        return this;
    }

    public String getManuModel() {
        return this.manuModel;
    }

    public VehicleInvoiceWordsResult setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getOrigin() {
        return this.origin;
    }

    public VehicleInvoiceWordsResult setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
        return this;
    }

    public String getCertificateNum() {
        return this.certificateNum;
    }

    public VehicleInvoiceWordsResult setEngineNum(String engineNum) {
        this.engineNum = engineNum;
        return this;
    }

    public String getEngineNum() {
        return this.engineNum;
    }

    public VehicleInvoiceWordsResult setVinNum(String vinNum) {
        this.vinNum = vinNum;
        return this;
    }

    public String getVinNum() {
        return this.vinNum;
    }

    public VehicleInvoiceWordsResult setPriceTax(String priceTax) {
        this.priceTax = priceTax;
        return this;
    }

    public String getPriceTax() {
        return this.priceTax;
    }

    public VehicleInvoiceWordsResult setPriceTaxLow(String priceTaxLow) {
        this.priceTaxLow = priceTaxLow;
        return this;
    }

    public String getPriceTaxLow() {
        return this.priceTaxLow;
    }

    public VehicleInvoiceWordsResult setSaler(String saler) {
        this.saler = saler;
        return this;
    }

    public String getSaler() {
        return this.saler;
    }

    public VehicleInvoiceWordsResult setSalerPhone(String salerPhone) {
        this.salerPhone = salerPhone;
        return this;
    }

    public String getSalerPhone() {
        return this.salerPhone;
    }

    public VehicleInvoiceWordsResult setSalerCode(String salerCode) {
        this.salerCode = salerCode;
        return this;
    }

    public String getSalerCode() {
        return this.salerCode;
    }

    public VehicleInvoiceWordsResult setSalerAccountNum(String salerAccountNum) {
        this.salerAccountNum = salerAccountNum;
        return this;
    }

    public String getSalerAccountNum() {
        return this.salerAccountNum;
    }

    public VehicleInvoiceWordsResult setSalerAddress(String salerAddress) {
        this.salerAddress = salerAddress;
        return this;
    }

    public String getSalerAddress() {
        return this.salerAddress;
    }

    public VehicleInvoiceWordsResult setSalerBank(String salerBank) {
        this.salerBank = salerBank;
        return this;
    }

    public String getSalerBank() {
        return this.salerBank;
    }

    public VehicleInvoiceWordsResult setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public String getTaxRate() {
        return this.taxRate;
    }

    public VehicleInvoiceWordsResult setTax(String tax) {
        this.tax = tax;
        return this;
    }

    public String getTax() {
        return this.tax;
    }

    public VehicleInvoiceWordsResult setTaxAuthor(String taxAuthor) {
        this.taxAuthor = taxAuthor;
        return this;
    }

    public String getTaxAuthor() {
        return this.taxAuthor;
    }

    public VehicleInvoiceWordsResult setTaxAuthorCode(String taxAuthorCode) {
        this.taxAuthorCode = taxAuthorCode;
        return this;
    }

    public String getTaxAuthorCode() {
        return this.taxAuthorCode;
    }

    public VehicleInvoiceWordsResult setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getPrice() {
        return this.price;
    }

    public VehicleInvoiceWordsResult setLimitPassenger(String limitPassenger) {
        this.limitPassenger = limitPassenger;
        return this;
    }

    public String getLimitPassenger() {
        return this.limitPassenger;
    }

    public VehicleInvoiceWordsResult setToonage(String toonage) {
        this.toonage = toonage;
        return this;
    }

    public String getToonage() {
        return this.toonage;
    }

    public VehicleInvoiceWordsResult setSheetNum(String sheetNum) {
        this.sheetNum = sheetNum;
        return this;
    }

    public String getSheetNum() {
        return this.sheetNum;
    }

    public VehicleInvoiceWordsResult setDrawer(String drawer) {
        this.drawer = drawer;
        return this;
    }

    public String getDrawer() {
        return this.drawer;
    }

    public VehicleInvoiceWordsResult setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public VehicleInvoiceWordsResult setImportCertificateNum(String importCertificateNum) {
        this.importCertificateNum = importCertificateNum;
        return this;
    }

    public String getImportCertificateNum() {
        return this.importCertificateNum;
    }

    public VehicleInvoiceWordsResult setTaxPaymentVoucherNo(String taxPaymentVoucherNo) {
        this.taxPaymentVoucherNo = taxPaymentVoucherNo;
        return this;
    }

    public String getTaxPaymentVoucherNo() {
        return this.taxPaymentVoucherNo;
    }

    public VehicleInvoiceWordsResult setInspectionFormNum(String inspectionFormNum) {
        this.inspectionFormNum = inspectionFormNum;
        return this;
    }

    public String getInspectionFormNum() {
        return this.inspectionFormNum;
    }

    public VehicleInvoiceWordsResult setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    public String getTaxCode() {
        return this.taxCode;
    }

    public VehicleInvoiceWordsResult setInvoiceNumDigit(String invoiceNumDigit) {
        this.invoiceNumDigit = invoiceNumDigit;
        return this;
    }

    public String getInvoiceNumDigit() {
        return this.invoiceNumDigit;
    }

    @Override
    public String toString() {
        return "VehicleInvoiceWordsResult{" + "invoiceHeader=" + invoiceHeader + "\n" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "printedCode="
                + printedCode + "\n" + "printedNum=" + printedNum + "\n" + "invoiceDate=" + invoiceDate + "\n" + "machineCode=" + machineCode + "\n" + "purchaser=" + purchaser
                + "\n" + "purchaserCode=" + purchaserCode + "\n" + "vehicleType=" + vehicleType + "\n" + "manuModel=" + manuModel + "\n" + "origin=" + origin + "\n"
                + "certificateNum=" + certificateNum + "\n" + "engineNum=" + engineNum + "\n" + "vinNum=" + vinNum + "\n" + "priceTax=" + priceTax + "\n" + "priceTaxLow="
                + priceTaxLow + "\n" + "saler=" + saler + "\n" + "salerPhone=" + salerPhone + "\n" + "salerCode=" + salerCode + "\n" + "salerAccountNum=" + salerAccountNum + "\n"
                + "salerAddress=" + salerAddress + "\n" + "salerBank=" + salerBank + "\n" + "taxRate=" + taxRate + "\n" + "tax=" + tax + "\n" + "taxAuthor=" + taxAuthor + "\n"
                + "taxAuthorCode=" + taxAuthorCode + "\n" + "price=" + price + "\n" + "limitPassenger=" + limitPassenger + "\n" + "toonage=" + toonage + "\n" + "sheetNum="
                + sheetNum + "\n" + "drawer=" + drawer + "\n" + "remarks=" + remarks + "\n" + "importCertificateNum=" + importCertificateNum + "\n" + "taxPaymentVoucherNo="
                + taxPaymentVoucherNo + "\n" + "inspectionFormNum=" + inspectionFormNum + "\n" + "taxCode=" + taxCode + "\n" + "invoiceNumDigit=" + invoiceNumDigit + "\n" + "}";
    }

}