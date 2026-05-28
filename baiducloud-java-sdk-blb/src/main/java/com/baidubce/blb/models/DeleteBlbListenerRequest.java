package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteBlbListenerRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 所有待释放的监听器的端口，一起组成一个数组
    */
    private List<Integer> portList;

    /**
    * 所有待释放的监听器的端口和协议，一起组成一个数组，如果开通了同端口多协议，并且只想删除其中一个协议，使用这个参数。portList和portTypeList至少传一个。
    */
    private List<PortTypeModel> portTypeList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteBlbListenerRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteBlbListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<Integer> getPortList() {
        return portList;
    }

    public DeleteBlbListenerRequest setPortList(List<Integer> portList) {
        this.portList = portList;
        return this;
    }

    public List<PortTypeModel> getPortTypeList() {
        return portTypeList;
    }

    public DeleteBlbListenerRequest setPortTypeList(List<PortTypeModel> portTypeList) {
        this.portTypeList = portTypeList;
        return this;
    }

}
