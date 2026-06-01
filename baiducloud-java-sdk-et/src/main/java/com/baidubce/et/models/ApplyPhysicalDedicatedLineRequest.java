package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyPhysicalDedicatedLineRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 专线名称,大小写字母、数字以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 运营商，取值：ISP_CMCC/ISP_CUCC/ISP_CYC/ISP_OTHER，分别对应：中国移动/中国联通/中国电信/国内其它
    */
    private String isp;

    /**
    * 物理端口规格，取值：1G/10G/100G/40G/400G
    */
    private String intfType;

    /**
    * 线路类型，百度内部用户：BAIDU，外部用户：SINGLE
    */
    private String apType;

    /**
    * 接入点，取值：BB/BJYZ/M3A/M3B/M2A/M2B/HKG03/WHGG/SHWGQ/BDBL，分别对应：北京海淀接入点/北京亦庄接入点/广州南沙接入点/深圳接入点/南京接入点/苏州接入点/香港接入点/武汉光谷接入点/上海接入点/保定接入点
    */
    private String apAddr;

    /**
    * 端口延迟down时间，单位ms
    */
    private Integer linkDelay;

    /**
    * 用户名称
    */
    private String userName;

    /**
    * 用户手机号码
    */
    private String userPhone;

    /**
    * 用户邮箱
    */
    private String userEmail;

    /**
    * 对端地址，格式为：省&#124;市&#124;县&#124;区，如 北京&#124;市辖区&#124;东城区&#124;百度科技园K2
    */
    private String userIdc;

    /**
    * billing
    */
    private Billing billing;

    /**
    * autoRenew
    */
    private Reservation autoRenew;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public ApplyPhysicalDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApplyPhysicalDedicatedLineRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ApplyPhysicalDedicatedLineRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getIsp() {
        return isp;
    }

    public ApplyPhysicalDedicatedLineRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }

    public String getIntfType() {
        return intfType;
    }

    public ApplyPhysicalDedicatedLineRequest setIntfType(String intfType) {
        this.intfType = intfType;
        return this;
    }

    public String getApType() {
        return apType;
    }

    public ApplyPhysicalDedicatedLineRequest setApType(String apType) {
        this.apType = apType;
        return this;
    }

    public String getApAddr() {
        return apAddr;
    }

    public ApplyPhysicalDedicatedLineRequest setApAddr(String apAddr) {
        this.apAddr = apAddr;
        return this;
    }

    public Integer getLinkDelay() {
        return linkDelay;
    }

    public ApplyPhysicalDedicatedLineRequest setLinkDelay(Integer linkDelay) {
        this.linkDelay = linkDelay;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public ApplyPhysicalDedicatedLineRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public ApplyPhysicalDedicatedLineRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public ApplyPhysicalDedicatedLineRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserIdc() {
        return userIdc;
    }

    public ApplyPhysicalDedicatedLineRequest setUserIdc(String userIdc) {
        this.userIdc = userIdc;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public ApplyPhysicalDedicatedLineRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Reservation getAutoRenew() {
        return autoRenew;
    }

    public ApplyPhysicalDedicatedLineRequest setAutoRenew(Reservation autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public ApplyPhysicalDedicatedLineRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
