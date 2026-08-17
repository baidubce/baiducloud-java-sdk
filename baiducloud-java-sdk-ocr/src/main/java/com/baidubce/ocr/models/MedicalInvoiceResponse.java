package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInvoiceResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误描述信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 识别结果数，表示words_result的元素个数
    */
    @JsonProperty("words_result_num")
    private Integer wordsResultNum;

    /**
    * 票据种类
    */
    @JsonProperty("InvoiceType")
    private String invoiceType;

    /**
    * 省市，支持返回：北京/广东/河北/河南/江苏/山东/上海/天津/浙江等
    */
    @JsonProperty("Province")
    private String province;

    /**
    * wordsResult
    */
    @JsonProperty("words_result")
    private MedicalInvoiceWordsResult wordsResult;

    public Integer getErrorCode() {
        return errorCode;
    }

    public MedicalInvoiceResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public MedicalInvoiceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public MedicalInvoiceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Integer getWordsResultNum() {
        return wordsResultNum;
    }

    public MedicalInvoiceResponse setWordsResultNum(Integer wordsResultNum) {
        this.wordsResultNum = wordsResultNum;
        return this;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public MedicalInvoiceResponse setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public MedicalInvoiceResponse setProvince(String province) {
        this.province = province;
        return this;
    }

    public MedicalInvoiceWordsResult getWordsResult() {
        return wordsResult;
    }

    public MedicalInvoiceResponse setWordsResult(MedicalInvoiceWordsResult wordsResult) {
        this.wordsResult = wordsResult;
        return this;
    }

    @Override
    public String toString() {
        return "MedicalInvoiceResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "wordsResultNum=" + wordsResultNum + "\n"
                + "invoiceType=" + invoiceType + "\n" + "province=" + province + "\n" + "wordsResult=" + wordsResult + "\n" + "}";
    }

}
