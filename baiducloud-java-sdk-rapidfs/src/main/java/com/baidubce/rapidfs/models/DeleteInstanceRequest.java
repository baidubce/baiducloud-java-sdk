package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待释放的 RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * * 首次调用：当参数为空或未传值时，系统会生成并返回一个临时  token；* 第二次调用：必填，传入首次调用返回的 token时，系统会进行校验，并根据校验结果决定是否接受释放操作
    */
    private String token;

    public String getClientToken() {
        return clientToken;
    }

    public DeleteInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public DeleteInstanceRequest setToken(String token) {
        this.token = token;
        return this;
    }

}
