package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePublicNetworkRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 更新共有网络动作，取值范围：open、close，分别表示开启公有网络访问入口、关闭公有网络入口
    */
    private String action;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdatePublicNetworkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdatePublicNetworkRequest setAction(String action) {
        this.action = action;
        return this;
    }

}
