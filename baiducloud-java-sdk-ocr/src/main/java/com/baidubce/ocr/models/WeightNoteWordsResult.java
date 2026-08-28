package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeightNoteWordsResult {
    /**
     * 车牌号
     */
    @JsonProperty("PlateNum")
    private List<WeightNoteWordItem> plateNum;

    /**
     * 打印时间
     */
    @JsonProperty("PrintTime")
    private List<WeightNoteWordItem> printTime;

    /**
     * 毛重
     */
    @JsonProperty("CrossWeight")
    private List<WeightNoteWordItem> crossWeight;

    /**
     * 皮重
     */
    @JsonProperty("TareWeight")
    private List<WeightNoteWordItem> tareWeight;

    /**
     * 净重
     */
    @JsonProperty("NetWeight")
    private List<WeightNoteWordItem> netWeight;

    /**
     * 发货单位
     */
    @JsonProperty("SendingCompany")
    private List<WeightNoteWordItem> sendingCompany;

    /**
     * 收货单位
     */
    @JsonProperty("ReceivingCompany")
    private List<WeightNoteWordItem> receivingCompany;

    /**
     * 单号
     */
    @JsonProperty("DeliveryNumber")
    private List<WeightNoteWordItem> deliveryNumber;

    public WeightNoteWordsResult setPlateNum(List<WeightNoteWordItem> plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public List<WeightNoteWordItem> getPlateNum() {
        return this.plateNum;
    }

    public WeightNoteWordsResult setPrintTime(List<WeightNoteWordItem> printTime) {
        this.printTime = printTime;
        return this;
    }

    public List<WeightNoteWordItem> getPrintTime() {
        return this.printTime;
    }

    public WeightNoteWordsResult setCrossWeight(List<WeightNoteWordItem> crossWeight) {
        this.crossWeight = crossWeight;
        return this;
    }

    public List<WeightNoteWordItem> getCrossWeight() {
        return this.crossWeight;
    }

    public WeightNoteWordsResult setTareWeight(List<WeightNoteWordItem> tareWeight) {
        this.tareWeight = tareWeight;
        return this;
    }

    public List<WeightNoteWordItem> getTareWeight() {
        return this.tareWeight;
    }

    public WeightNoteWordsResult setNetWeight(List<WeightNoteWordItem> netWeight) {
        this.netWeight = netWeight;
        return this;
    }

    public List<WeightNoteWordItem> getNetWeight() {
        return this.netWeight;
    }

    public WeightNoteWordsResult setSendingCompany(List<WeightNoteWordItem> sendingCompany) {
        this.sendingCompany = sendingCompany;
        return this;
    }

    public List<WeightNoteWordItem> getSendingCompany() {
        return this.sendingCompany;
    }

    public WeightNoteWordsResult setReceivingCompany(List<WeightNoteWordItem> receivingCompany) {
        this.receivingCompany = receivingCompany;
        return this;
    }

    public List<WeightNoteWordItem> getReceivingCompany() {
        return this.receivingCompany;
    }

    public WeightNoteWordsResult setDeliveryNumber(List<WeightNoteWordItem> deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
        return this;
    }

    public List<WeightNoteWordItem> getDeliveryNumber() {
        return this.deliveryNumber;
    }

    @Override
    public String toString() {
        return "WeightNoteWordsResult{" + "plateNum=" + plateNum + "\n" + "printTime=" + printTime + "\n" + "crossWeight=" + crossWeight + "\n" + "tareWeight=" + tareWeight + "\n"
                + "netWeight=" + netWeight + "\n" + "sendingCompany=" + sendingCompany + "\n" + "receivingCompany=" + receivingCompany + "\n" + "deliveryNumber=" + deliveryNumber
                + "\n" + "}";
    }

}