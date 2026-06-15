package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceUserDataInfoResponse extends BaseBceResponse {

    /**
    * 最近一次自定义脚本内容（使用base64编码）
    */
    private String userData;

    /**
    * 实例短ID
    */
    private String instanceId;

    public String getUserData() {
        return userData;
    }

    public GetInstanceUserDataInfoResponse setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetInstanceUserDataInfoResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceUserDataInfoResponse{" + "userData=" + userData + "\n" + "instanceId=" + instanceId + "\n" + "}";
    }

}
