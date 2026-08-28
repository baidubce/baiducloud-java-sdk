package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultipleInvoiceResult {
    /**
     * 发票代码
     */
    @JsonProperty("invoice_code")
    private List<WordOnlyItem> invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("invoice_num")
    private List<ResultItem> invoiceNum;

    /**
     * 开票日期
     */
    @JsonProperty("invoice_date")
    private List<ResultItem> invoiceDate;

    /**
     * 合计金额
     */
    @JsonProperty("total_amount")
    private List<ResultItem> totalAmount;

    /**
     * 发票类型（分类结果，不含 probability/location）
     */
    @JsonProperty("invoice_type")
    private List<WordOnlyItem> invoiceType;

    /**
     * 校验码
     */
    @JsonProperty("check_code")
    private List<WordOnlyItem> checkCode;

    /**
     * 销售方名称
     */
    @JsonProperty("seller_name")
    private List<ResultItem> sellerName;

    /**
     * 销售方纳税人识别号
     */
    @JsonProperty("seller_register_num")
    private List<ResultItem> sellerRegisterNum;

    /**
     * 购买方名称
     */
    @JsonProperty("purchaser_name")
    private List<ResultItem> purchaserName;

    /**
     * 购买方纳税人识别号
     */
    @JsonProperty("purchaser_register_num")
    private List<ResultItem> purchaserRegisterNum;

    public MultipleInvoiceResult setInvoiceCode(List<WordOnlyItem> invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public List<WordOnlyItem> getInvoiceCode() {
        return this.invoiceCode;
    }

    public MultipleInvoiceResult setInvoiceNum(List<ResultItem> invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public List<ResultItem> getInvoiceNum() {
        return this.invoiceNum;
    }

    public MultipleInvoiceResult setInvoiceDate(List<ResultItem> invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public List<ResultItem> getInvoiceDate() {
        return this.invoiceDate;
    }

    public MultipleInvoiceResult setTotalAmount(List<ResultItem> totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public List<ResultItem> getTotalAmount() {
        return this.totalAmount;
    }

    public MultipleInvoiceResult setInvoiceType(List<WordOnlyItem> invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public List<WordOnlyItem> getInvoiceType() {
        return this.invoiceType;
    }

    public MultipleInvoiceResult setCheckCode(List<WordOnlyItem> checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    public List<WordOnlyItem> getCheckCode() {
        return this.checkCode;
    }

    public MultipleInvoiceResult setSellerName(List<ResultItem> sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public List<ResultItem> getSellerName() {
        return this.sellerName;
    }

    public MultipleInvoiceResult setSellerRegisterNum(List<ResultItem> sellerRegisterNum) {
        this.sellerRegisterNum = sellerRegisterNum;
        return this;
    }

    public List<ResultItem> getSellerRegisterNum() {
        return this.sellerRegisterNum;
    }

    public MultipleInvoiceResult setPurchaserName(List<ResultItem> purchaserName) {
        this.purchaserName = purchaserName;
        return this;
    }

    public List<ResultItem> getPurchaserName() {
        return this.purchaserName;
    }

    public MultipleInvoiceResult setPurchaserRegisterNum(List<ResultItem> purchaserRegisterNum) {
        this.purchaserRegisterNum = purchaserRegisterNum;
        return this;
    }

    public List<ResultItem> getPurchaserRegisterNum() {
        return this.purchaserRegisterNum;
    }

    @Override
    public String toString() {
        return "MultipleInvoiceResult{" + "invoiceCode=" + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "invoiceDate=" + invoiceDate + "\n" + "totalAmount="
                + totalAmount + "\n" + "invoiceType=" + invoiceType + "\n" + "checkCode=" + checkCode + "\n" + "sellerName=" + sellerName + "\n" + "sellerRegisterNum="
                + sellerRegisterNum + "\n" + "purchaserName=" + purchaserName + "\n" + "purchaserRegisterNum=" + purchaserRegisterNum + "\n" + "}";
    }

}