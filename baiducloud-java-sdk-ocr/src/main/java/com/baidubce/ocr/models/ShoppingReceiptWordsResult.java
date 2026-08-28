package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShoppingReceiptWordsResult {
    /**
     * 店名/超市名字
     */
    @JsonProperty("shop_name")
    private String shopName;

    /**
     * 小票号码
     */
    @JsonProperty("receipt_num")
    private String receiptNum;

    /**
     * 机器编号
     */
    @JsonProperty("machine_num")
    private String machineNum;

    /**
     * 工号
     */
    @JsonProperty("employee_num")
    private String employeeNum;

    /**
     * 消费日期
     */
    @JsonProperty("consumption_date")
    private String consumptionDate;

    /**
     * 消费时间
     */
    @JsonProperty("consumption_time")
    private String consumptionTime;

    /**
     * 总金额
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * 找零
     */
    private String change;

    /**
     * 币种
     */
    private String currency;

    /**
     * 实收金额
     */
    @JsonProperty("paid_amount")
    private String paidAmount;

    /**
     * 优惠/折扣
     */
    private String discount;

    /**
     * 打印日期
     */
    @JsonProperty("print_date")
    private String printDate;

    /**
     * 打印时间
     */
    @JsonProperty("print_time")
    private String printTime;

    /**
     * 商品明细行数，表示Table中的object个数
     */
    @JsonProperty("table_row_num")
    private Integer tableRowNum;

    /**
     * 消费明细区域
     */
    private List<Table> table;

    public ShoppingReceiptWordsResult setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getShopName() {
        return this.shopName;
    }

    public ShoppingReceiptWordsResult setReceiptNum(String receiptNum) {
        this.receiptNum = receiptNum;
        return this;
    }

    public String getReceiptNum() {
        return this.receiptNum;
    }

    public ShoppingReceiptWordsResult setMachineNum(String machineNum) {
        this.machineNum = machineNum;
        return this;
    }

    public String getMachineNum() {
        return this.machineNum;
    }

    public ShoppingReceiptWordsResult setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
        return this;
    }

    public String getEmployeeNum() {
        return this.employeeNum;
    }

    public ShoppingReceiptWordsResult setConsumptionDate(String consumptionDate) {
        this.consumptionDate = consumptionDate;
        return this;
    }

    public String getConsumptionDate() {
        return this.consumptionDate;
    }

    public ShoppingReceiptWordsResult setConsumptionTime(String consumptionTime) {
        this.consumptionTime = consumptionTime;
        return this;
    }

    public String getConsumptionTime() {
        return this.consumptionTime;
    }

    public ShoppingReceiptWordsResult setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public ShoppingReceiptWordsResult setChange(String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public ShoppingReceiptWordsResult setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public ShoppingReceiptWordsResult setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    public String getPaidAmount() {
        return this.paidAmount;
    }

    public ShoppingReceiptWordsResult setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    public String getDiscount() {
        return this.discount;
    }

    public ShoppingReceiptWordsResult setPrintDate(String printDate) {
        this.printDate = printDate;
        return this;
    }

    public String getPrintDate() {
        return this.printDate;
    }

    public ShoppingReceiptWordsResult setPrintTime(String printTime) {
        this.printTime = printTime;
        return this;
    }

    public String getPrintTime() {
        return this.printTime;
    }

    public ShoppingReceiptWordsResult setTableRowNum(Integer tableRowNum) {
        this.tableRowNum = tableRowNum;
        return this;
    }

    public Integer getTableRowNum() {
        return this.tableRowNum;
    }

    public ShoppingReceiptWordsResult setTable(List<Table> table) {
        this.table = table;
        return this;
    }

    public List<Table> getTable() {
        return this.table;
    }

    @Override
    public String toString() {
        return "ShoppingReceiptWordsResult{" + "shopName=" + shopName + "\n" + "receiptNum=" + receiptNum + "\n" + "machineNum=" + machineNum + "\n" + "employeeNum=" + employeeNum
                + "\n" + "consumptionDate=" + consumptionDate + "\n" + "consumptionTime=" + consumptionTime + "\n" + "totalAmount=" + totalAmount + "\n" + "change=" + change
                + "\n" + "currency=" + currency + "\n" + "paidAmount=" + paidAmount + "\n" + "discount=" + discount + "\n" + "printDate=" + printDate + "\n" + "printTime="
                + printTime + "\n" + "tableRowNum=" + tableRowNum + "\n" + "table=" + table + "\n" + "}";
    }

}