package com.baidubce.et.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ET {
    /**
     * 专线ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 
     */
    private String status;

    /**
     * 到期时间
     */
    private String expireTime;

    /**
     * 运营商，取值：ISP_CMCC/ISP_CUCC/ISP_CTC/ISP_CHH/ISP_OTHER，分别对应：中国移动/中国联通/中国电信/托管专线/国内其它
     */
    private String isp;

    /**
     * 接口规格，取值：1G/10G/100G
     */
    private String intfType;

    /**
     * 接入类型
     */
    private String apType;

    /**
     * 端口延迟down时间
     */
    private Integer linkDelay;

    /**
     * 接入点
     */
    private String apAddr;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户手机
     */
    private String userPhone;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 对端地址
     */
    private String userIdc;

    /**
     * 专线绑定的标签列表
     */
    private List<TagModel> tags;

    public ET setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ET setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ET setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ET setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ET setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public ET setIsp(String isp) {
        this.isp = isp;
        return this;
    }

    public String getIsp() {
        return this.isp;
    }

    public ET setIntfType(String intfType) {
        this.intfType = intfType;
        return this;
    }

    public String getIntfType() {
        return this.intfType;
    }

    public ET setApType(String apType) {
        this.apType = apType;
        return this;
    }

    public String getApType() {
        return this.apType;
    }

    public ET setLinkDelay(Integer linkDelay) {
        this.linkDelay = linkDelay;
        return this;
    }

    public Integer getLinkDelay() {
        return this.linkDelay;
    }

    public ET setApAddr(String apAddr) {
        this.apAddr = apAddr;
        return this;
    }

    public String getApAddr() {
        return this.apAddr;
    }

    public ET setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public ET setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public String getUserPhone() {
        return this.userPhone;
    }

    public ET setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public ET setUserIdc(String userIdc) {
        this.userIdc = userIdc;
        return this;
    }

    public String getUserIdc() {
        return this.userIdc;
    }

    public ET setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "ET{" + "id=" + id + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "status=" + status + "\n" + "expireTime=" + expireTime + "\n" + "isp="
                + isp + "\n" + "intfType=" + intfType + "\n" + "apType=" + apType + "\n" + "linkDelay=" + linkDelay + "\n" + "apAddr=" + apAddr + "\n" + "userName=" + userName
                + "\n" + "userPhone=" + userPhone + "\n" + "userEmail=" + userEmail + "\n" + "userIdc=" + userIdc + "\n" + "tags=" + tags + "\n" + "}";
    }

}