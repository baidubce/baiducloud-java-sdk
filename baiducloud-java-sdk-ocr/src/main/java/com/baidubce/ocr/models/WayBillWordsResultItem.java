package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WayBillWordsResultItem {
    /**
     * imageInfo
     */
    @JsonProperty("image_info")
    private ImageInfo imageInfo;

    /**
     * 条形码
     */
    @JsonProperty("bar_code")
    private List<WaybillWordItem> barCode;

    /**
     * 快递运单号
     */
    @JsonProperty("waybill_number")
    private List<WaybillWordItem> waybillNumber;

    /**
     * 三段码
     */
    @JsonProperty("three_segment_code")
    private List<WaybillWordItem> threeSegmentCode;

    /**
     * 收件人姓名
     */
    @JsonProperty("recipient_name")
    private List<WaybillWordItem> recipientName;

    /**
     * 寄件人姓名
     */
    @JsonProperty("sender_name")
    private List<WaybillWordItem> senderName;

    /**
     * 收件人地址
     */
    @JsonProperty("recipient_addr")
    private List<WaybillWordItem> recipientAddr;

    /**
     * 寄件人地址
     */
    @JsonProperty("sender_addr")
    private List<WaybillWordItem> senderAddr;

    /**
     * 收件人电话
     */
    @JsonProperty("recipient_phone")
    private List<WaybillWordItem> recipientPhone;

    /**
     * 寄件人电话
     */
    @JsonProperty("sender_phone")
    private List<WaybillWordItem> senderPhone;

    /**
     * 虚拟面单号，当请求参数is_identify_virtual_waybill=true时返回该字段
     */
    @JsonProperty("virtual_number")
    private List<WaybillWordItem> virtualNumber;

    /**
     * 隐私面单的4位转接号，当请求参数is_identify_virtual_waybill=true时返回该字段
     */
    @JsonProperty("virtual_number_last")
    private List<WaybillWordItem> virtualNumberLast;

    /**
     * 此张快递面单是否为隐私面单，true代表是，false代表否，当请求参数is_identify_virtual_waybill=true时返回该字段
     */
    @JsonProperty("is_virtual_waybill")
    private List<WaybillWordItem> isVirtualWaybill;

    public WayBillWordsResultItem setImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public WayBillWordsResultItem setBarCode(List<WaybillWordItem> barCode) {
        this.barCode = barCode;
        return this;
    }

    public List<WaybillWordItem> getBarCode() {
        return this.barCode;
    }

    public WayBillWordsResultItem setWaybillNumber(List<WaybillWordItem> waybillNumber) {
        this.waybillNumber = waybillNumber;
        return this;
    }

    public List<WaybillWordItem> getWaybillNumber() {
        return this.waybillNumber;
    }

    public WayBillWordsResultItem setThreeSegmentCode(List<WaybillWordItem> threeSegmentCode) {
        this.threeSegmentCode = threeSegmentCode;
        return this;
    }

    public List<WaybillWordItem> getThreeSegmentCode() {
        return this.threeSegmentCode;
    }

    public WayBillWordsResultItem setRecipientName(List<WaybillWordItem> recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    public List<WaybillWordItem> getRecipientName() {
        return this.recipientName;
    }

    public WayBillWordsResultItem setSenderName(List<WaybillWordItem> senderName) {
        this.senderName = senderName;
        return this;
    }

    public List<WaybillWordItem> getSenderName() {
        return this.senderName;
    }

    public WayBillWordsResultItem setRecipientAddr(List<WaybillWordItem> recipientAddr) {
        this.recipientAddr = recipientAddr;
        return this;
    }

    public List<WaybillWordItem> getRecipientAddr() {
        return this.recipientAddr;
    }

    public WayBillWordsResultItem setSenderAddr(List<WaybillWordItem> senderAddr) {
        this.senderAddr = senderAddr;
        return this;
    }

    public List<WaybillWordItem> getSenderAddr() {
        return this.senderAddr;
    }

    public WayBillWordsResultItem setRecipientPhone(List<WaybillWordItem> recipientPhone) {
        this.recipientPhone = recipientPhone;
        return this;
    }

    public List<WaybillWordItem> getRecipientPhone() {
        return this.recipientPhone;
    }

    public WayBillWordsResultItem setSenderPhone(List<WaybillWordItem> senderPhone) {
        this.senderPhone = senderPhone;
        return this;
    }

    public List<WaybillWordItem> getSenderPhone() {
        return this.senderPhone;
    }

    public WayBillWordsResultItem setVirtualNumber(List<WaybillWordItem> virtualNumber) {
        this.virtualNumber = virtualNumber;
        return this;
    }

    public List<WaybillWordItem> getVirtualNumber() {
        return this.virtualNumber;
    }

    public WayBillWordsResultItem setVirtualNumberLast(List<WaybillWordItem> virtualNumberLast) {
        this.virtualNumberLast = virtualNumberLast;
        return this;
    }

    public List<WaybillWordItem> getVirtualNumberLast() {
        return this.virtualNumberLast;
    }

    public WayBillWordsResultItem setIsVirtualWaybill(List<WaybillWordItem> isVirtualWaybill) {
        this.isVirtualWaybill = isVirtualWaybill;
        return this;
    }

    public List<WaybillWordItem> getIsVirtualWaybill() {
        return this.isVirtualWaybill;
    }

    @Override
    public String toString() {
        return "WayBillWordsResultItem{" + "imageInfo=" + imageInfo + "\n" + "barCode=" + barCode + "\n" + "waybillNumber=" + waybillNumber + "\n" + "threeSegmentCode="
                + threeSegmentCode + "\n" + "recipientName=" + recipientName + "\n" + "senderName=" + senderName + "\n" + "recipientAddr=" + recipientAddr + "\n" + "senderAddr="
                + senderAddr + "\n" + "recipientPhone=" + recipientPhone + "\n" + "senderPhone=" + senderPhone + "\n" + "virtualNumber=" + virtualNumber + "\n"
                + "virtualNumberLast=" + virtualNumberLast + "\n" + "isVirtualWaybill=" + isVirtualWaybill + "\n" + "}";
    }

}