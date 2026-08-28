package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceWordsResult {
    /**
     * 发票类型
     */
    @JsonProperty("InvoiceType")
    private String invoiceType;

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
     * 开票日期
     */
    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    /**
     * 合计金额小写
     */
    @JsonProperty("AmountInFiguers")
    private String amountInFiguers;

    /**
     * 合计金额大写
     */
    @JsonProperty("AmountInWords")
    private String amountInWords;

    /**
     * 商品名称
     */
    @JsonProperty("CommodityName")
    private List<InvoiceRowWord> commodityName;

    /**
     * 商品单位
     */
    @JsonProperty("CommodityUnit")
    private List<InvoiceRowWord> commodityUnit;

    /**
     * 商品单价
     */
    @JsonProperty("CommodityPrice")
    private List<InvoiceRowWord> commodityPrice;

    /**
     * 商品数量
     */
    @JsonProperty("CommodityNum")
    private List<InvoiceRowWord> commodityNum;

    /**
     * 商品金额
     */
    @JsonProperty("CommodityAmount")
    private List<InvoiceRowWord> commodityAmount;

    /**
     * 行业分类
     */
    @JsonProperty("IndustrySort")
    private String industrySort;

    /**
     * 机打号码
     */
    @JsonProperty("MachineNum")
    private String machineNum;

    /**
     * 校验码
     */
    @JsonProperty("CheckCode")
    private String checkCode;

    /**
     * 销售方名称
     */
    @JsonProperty("SellerName")
    private String sellerName;

    /**
     * 销售方纳税人识别号
     */
    @JsonProperty("SellerRegisterNum")
    private String sellerRegisterNum;

    /**
     * 购买方名称
     */
    @JsonProperty("PurchaserName")
    private String purchaserName;

    /**
     * 购买方纳税人识别号
     */
    @JsonProperty("PurchaserRegisterNum")
    private String purchaserRegisterNum;

    /**
     * 合计税额
     */
    @JsonProperty("TotalTax")
    private String totalTax;

    /**
     * 省
     */
    @JsonProperty("Province")
    private String province;

    /**
     * 市
     */
    @JsonProperty("City")
    private String city;

    /**
     * 时间
     */
    @JsonProperty("Time")
    private String time;

    /**
     * 联次
     */
    @JsonProperty("SheetNum")
    private String sheetNum;

    public InvoiceWordsResult setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public String getInvoiceType() {
        return this.invoiceType;
    }

    public InvoiceWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public InvoiceWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public InvoiceWordsResult setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public InvoiceWordsResult setAmountInFiguers(String amountInFiguers) {
        this.amountInFiguers = amountInFiguers;
        return this;
    }

    public String getAmountInFiguers() {
        return this.amountInFiguers;
    }

    public InvoiceWordsResult setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
        return this;
    }

    public String getAmountInWords() {
        return this.amountInWords;
    }

    public InvoiceWordsResult setCommodityName(List<InvoiceRowWord> commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public List<InvoiceRowWord> getCommodityName() {
        return this.commodityName;
    }

    public InvoiceWordsResult setCommodityUnit(List<InvoiceRowWord> commodityUnit) {
        this.commodityUnit = commodityUnit;
        return this;
    }

    public List<InvoiceRowWord> getCommodityUnit() {
        return this.commodityUnit;
    }

    public InvoiceWordsResult setCommodityPrice(List<InvoiceRowWord> commodityPrice) {
        this.commodityPrice = commodityPrice;
        return this;
    }

    public List<InvoiceRowWord> getCommodityPrice() {
        return this.commodityPrice;
    }

    public InvoiceWordsResult setCommodityNum(List<InvoiceRowWord> commodityNum) {
        this.commodityNum = commodityNum;
        return this;
    }

    public List<InvoiceRowWord> getCommodityNum() {
        return this.commodityNum;
    }

    public InvoiceWordsResult setCommodityAmount(List<InvoiceRowWord> commodityAmount) {
        this.commodityAmount = commodityAmount;
        return this;
    }

    public List<InvoiceRowWord> getCommodityAmount() {
        return this.commodityAmount;
    }

    public InvoiceWordsResult setIndustrySort(String industrySort) {
        this.industrySort = industrySort;
        return this;
    }

    public String getIndustrySort() {
        return this.industrySort;
    }

    public InvoiceWordsResult setMachineNum(String machineNum) {
        this.machineNum = machineNum;
        return this;
    }

    public String getMachineNum() {
        return this.machineNum;
    }

    public InvoiceWordsResult setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    public String getCheckCode() {
        return this.checkCode;
    }

    public InvoiceWordsResult setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public InvoiceWordsResult setSellerRegisterNum(String sellerRegisterNum) {
        this.sellerRegisterNum = sellerRegisterNum;
        return this;
    }

    public String getSellerRegisterNum() {
        return this.sellerRegisterNum;
    }

    public InvoiceWordsResult setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
        return this;
    }

    public String getPurchaserName() {
        return this.purchaserName;
    }

    public InvoiceWordsResult setPurchaserRegisterNum(String purchaserRegisterNum) {
        this.purchaserRegisterNum = purchaserRegisterNum;
        return this;
    }

    public String getPurchaserRegisterNum() {
        return this.purchaserRegisterNum;
    }

    public InvoiceWordsResult setTotalTax(String totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public String getTotalTax() {
        return this.totalTax;
    }

    public InvoiceWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public InvoiceWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public InvoiceWordsResult setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public InvoiceWordsResult setSheetNum(String sheetNum) {
        this.sheetNum = sheetNum;
        return this;
    }

    public String getSheetNum() {
        return this.sheetNum;
    }

    @Override
    public String toString() {
        return "InvoiceWordsResult{" + "invoiceType=" + invoiceType + "\n" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "invoiceDate=" + invoiceDate
                + "\n" + "amountInFiguers=" + amountInFiguers + "\n" + "amountInWords=" + amountInWords + "\n" + "commodityName=" + commodityName + "\n" + "commodityUnit="
                + commodityUnit + "\n" + "commodityPrice=" + commodityPrice + "\n" + "commodityNum=" + commodityNum + "\n" + "commodityAmount=" + commodityAmount + "\n"
                + "industrySort=" + industrySort + "\n" + "machineNum=" + machineNum + "\n" + "checkCode=" + checkCode + "\n" + "sellerName=" + sellerName + "\n"
                + "sellerRegisterNum=" + sellerRegisterNum + "\n" + "purchaserName=" + purchaserName + "\n" + "purchaserRegisterNum=" + purchaserRegisterNum + "\n" + "totalTax="
                + totalTax + "\n" + "province=" + province + "\n" + "city=" + city + "\n" + "time=" + time + "\n" + "sheetNum=" + sheetNum + "\n" + "}";
    }

}