package com.baidubce.et.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePhysicalDedicatedLineRequest extends BaseBceRequest {

    /**
    * dcphyId
    */
    @JsonIgnore
    private String dcphyId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 专线名称，大小写字母、数字以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 用户名称
    */
    private String userName;

    /**
    * 用户手机号码
    */
    private String userPhone;

    /**
    * 邮箱
    */
    private String userEmail;

    /**
    * 端口延迟down时间，单位ms
    */
    private Integer linkDelay;

    public String getDcphyId() {
        return dcphyId;
    }

    public UpdatePhysicalDedicatedLineRequest setDcphyId(String dcphyId) {
        this.dcphyId = dcphyId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdatePhysicalDedicatedLineRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdatePhysicalDedicatedLineRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdatePhysicalDedicatedLineRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UpdatePhysicalDedicatedLineRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public UpdatePhysicalDedicatedLineRequest setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public UpdatePhysicalDedicatedLineRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public Integer getLinkDelay() {
        return linkDelay;
    }

    public UpdatePhysicalDedicatedLineRequest setLinkDelay(Integer linkDelay) {
        this.linkDelay = linkDelay;
        return this;
    }

}
