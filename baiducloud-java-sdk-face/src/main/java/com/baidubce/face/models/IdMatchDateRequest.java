package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdMatchDateRequest extends BaseBceRequest {

    /**
    * 姓名（注：需要是UTF-8编码的中文）
    */
    private String name;

    /**
    * 身份证号
    */
    @JsonProperty("id_card_number")
    private String idCardNumber;

    /**
    * 身份证有效期起始日期：年月日8位数字完整传入（如20120422）；起始日期不得早于19840101（第一代身份证签发日期）
    */
    @JsonProperty("start_date")
    private String startDate;

    /**
    * 身份证有效期截止日期：年月日8位数字完整传入（如20170422）1：截止日期应晚于起始日期5年以上（包含5年）；2：有效期截止日期为"长期"时，须转换为"00000000"入参请求；
    */
    @JsonProperty("end_date")
    private String endDate;

    public String getName() {
        return name;
    }

    public IdMatchDateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public IdMatchDateRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public IdMatchDateRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public IdMatchDateRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

}
