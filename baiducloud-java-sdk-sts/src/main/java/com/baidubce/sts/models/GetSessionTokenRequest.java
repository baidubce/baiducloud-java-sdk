package com.baidubce.sts.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSessionTokenRequest extends BaseBceRequest {

    /**
    * durationSeconds
    */
    @JsonIgnore
    private String durationSeconds;

    /**
    * 为临时身份凭证绑定的权限
    */
    private String accessControlList;

    /**
    * 业务方绑定在credential上的一些信息
    */
    private String attachment;

    public String getDurationSeconds() {
        return durationSeconds;
    }

    public GetSessionTokenRequest setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public String getAccessControlList() {
        return accessControlList;
    }

    public GetSessionTokenRequest setAccessControlList(String accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public String getAttachment() {
        return attachment;
    }

    public GetSessionTokenRequest setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

}
