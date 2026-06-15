package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoReleaseInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例绑定的后付费EIP是否随后付费实例关联自动释放，是：true，否：false。公网带宽计费方式为按使用带宽/流量计费时，该参数才生效。默认false。
    */
    private Boolean isEipAutoRelatedDelete;

    /**
    * 释放时间，格式yyyy-MM-dd'T'HH:mm:ss'Z'，不传表示取消定时释放
    */
    private String releaseTime;

    public String getInstanceId() {
        return instanceId;
    }

    public AutoReleaseInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getIsEipAutoRelatedDelete() {
        return isEipAutoRelatedDelete;
    }

    public AutoReleaseInstanceRequest setIsEipAutoRelatedDelete(Boolean isEipAutoRelatedDelete) {
        this.isEipAutoRelatedDelete = isEipAutoRelatedDelete;
        return this;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public AutoReleaseInstanceRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }

}
