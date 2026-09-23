package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 请求唯一标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 原始输入的文本内容
    */
    private String text;

    /**
    * 省（直辖市/自治区）
    */
    private String province;

    /**
    * 省国标code
    */
    @JsonProperty("province_code")
    private String provinceCode;

    /**
    * 市
    */
    private String city;

    /**
    * 城市国标code
    */
    @JsonProperty("city_code")
    private String cityCode;

    /**
    * 区（县）
    */
    private String county;

    /**
    * 区县国标code
    */
    @JsonProperty("county_code")
    private String countyCode;

    /**
    * 街道（乡/镇）
    */
    private String town;

    /**
    * 街道/乡镇国标code
    */
    @JsonProperty("town_code")
    private String townCode;

    /**
    * 姓名
    */
    private String person;

    /**
    * 详细地址
    */
    private String detail;

    /**
    * 电话号码
    */
    private String phonenum;

    /**
    * 纬度（百度坐标，仅供参考）
    */
    private Float lat;

    /**
    * 经度（百度坐标，仅供参考）
    */
    private Float lng;

    public Integer getErrorCode() {
        return errorCode;
    }

    public AddressResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public AddressResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public AddressResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getText() {
        return text;
    }

    public AddressResponse setText(String text) {
        this.text = text;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public AddressResponse setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public AddressResponse setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressResponse setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCityCode() {
        return cityCode;
    }

    public AddressResponse setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public AddressResponse setCounty(String county) {
        this.county = county;
        return this;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public AddressResponse setCountyCode(String countyCode) {
        this.countyCode = countyCode;
        return this;
    }

    public String getTown() {
        return town;
    }

    public AddressResponse setTown(String town) {
        this.town = town;
        return this;
    }

    public String getTownCode() {
        return townCode;
    }

    public AddressResponse setTownCode(String townCode) {
        this.townCode = townCode;
        return this;
    }

    public String getPerson() {
        return person;
    }

    public AddressResponse setPerson(String person) {
        this.person = person;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public AddressResponse setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public AddressResponse setPhonenum(String phonenum) {
        this.phonenum = phonenum;
        return this;
    }

    public Float getLat() {
        return lat;
    }

    public AddressResponse setLat(Float lat) {
        this.lat = lat;
        return this;
    }

    public Float getLng() {
        return lng;
    }

    public AddressResponse setLng(Float lng) {
        this.lng = lng;
        return this;
    }

    @Override
    public String toString() {
        return "AddressResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "text=" + text + "\n" + "province=" + province
                + "\n" + "provinceCode=" + provinceCode + "\n" + "city=" + city + "\n" + "cityCode=" + cityCode + "\n" + "county=" + county + "\n" + "countyCode=" + countyCode
                + "\n" + "town=" + town + "\n" + "townCode=" + townCode + "\n" + "person=" + person + "\n" + "detail=" + detail + "\n" + "phonenum=" + phonenum + "\n" + "lat="
                + lat + "\n" + "lng=" + lng + "\n" + "}";
    }

}
