package com.baidubce.et.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDedicatedLineDetailResponse extends BaseBceResponse {

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
    * 接入点
    */
    private String apAddr;

    /**
    * 端口延迟down时间
    */
    private Integer linkDelay;

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

    public String getId() {
        return id;
    }

    public QueryDedicatedLineDetailResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryDedicatedLineDetailResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public QueryDedicatedLineDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QueryDedicatedLineDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public QueryDedicatedLineDetailResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getIsp() {
        return isp;
    }

    public QueryDedicatedLineDetailResponse setIsp(String isp) {
        this.isp = isp;
        return this;
    }

    public String getIntfType() {
        return intfType;
    }

    public QueryDedicatedLineDetailResponse setIntfType(String intfType) {
        this.intfType = intfType;
        return this;
    }

    public String getApType() {
        return apType;
    }

    public QueryDedicatedLineDetailResponse setApType(String apType) {
        this.apType = apType;
        return this;
    }

    public String getApAddr() {
        return apAddr;
    }

    public QueryDedicatedLineDetailResponse setApAddr(String apAddr) {
        this.apAddr = apAddr;
        return this;
    }

    public Integer getLinkDelay() {
        return linkDelay;
    }

    public QueryDedicatedLineDetailResponse setLinkDelay(Integer linkDelay) {
        this.linkDelay = linkDelay;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public QueryDedicatedLineDetailResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public QueryDedicatedLineDetailResponse setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public QueryDedicatedLineDetailResponse setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserIdc() {
        return userIdc;
    }

    public QueryDedicatedLineDetailResponse setUserIdc(String userIdc) {
        this.userIdc = userIdc;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public QueryDedicatedLineDetailResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "QueryDedicatedLineDetailResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "status=" + status + "\n" + "expireTime="
                + expireTime + "\n" + "isp=" + isp + "\n" + "intfType=" + intfType + "\n" + "apType=" + apType + "\n" + "apAddr=" + apAddr + "\n" + "linkDelay=" + linkDelay + "\n"
                + "userName=" + userName + "\n" + "userPhone=" + userPhone + "\n" + "userEmail=" + userEmail + "\n" + "userIdc=" + userIdc + "\n" + "tags=" + tags + "\n" + "}";
    }

}
