package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveDataSrcRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待释放的数据源ID
    */
    private String dataSrcId;

    /**
    * 所属RapidFS 实例ID
    */
    private String instanceId;

    /**
    * 当参数为空或未传值时，系统会生成并返回一个临时令牌；当传入token时，系统会进行校验，并根据校验结果决定是否接受释放操作
    */
    private String token;

    public String getClientToken() {
        return clientToken;
    }

    public RemoveDataSrcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public RemoveDataSrcRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public RemoveDataSrcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public RemoveDataSrcRequest setToken(String token) {
        this.token = token;
        return this;
    }

}
