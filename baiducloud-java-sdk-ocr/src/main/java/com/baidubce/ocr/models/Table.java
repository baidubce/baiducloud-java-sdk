package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Table {
    /**
     * product
     */
    private Product product;

    /**
     * 数量
     */
    private String quantity;

    /**
     * 单价
     */
    @JsonProperty("unit_price")
    private String unitPrice;

    /**
     * 小计金额
     */
    @JsonProperty("subtotal_amount")
    private String subtotalAmount;

    public Table setProduct(Product product) {
        this.product = product;
        return this;
    }

    public Product getProduct() {
        return this.product;
    }

    public Table setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public Table setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public Table setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
        return this;
    }

    public String getSubtotalAmount() {
        return this.subtotalAmount;
    }

    @Override
    public String toString() {
        return "Table{" + "product=" + product + "\n" + "quantity=" + quantity + "\n" + "unitPrice=" + unitPrice + "\n" + "subtotalAmount=" + subtotalAmount + "\n" + "}";
    }

}