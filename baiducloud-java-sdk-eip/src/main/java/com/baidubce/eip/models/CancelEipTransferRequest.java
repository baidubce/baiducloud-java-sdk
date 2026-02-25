package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelEipTransferRequest extends BaseBceRequest {

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 转移资源短ID列表,单次最多接收30个。
    */
    private List<String> transferIdList;


    public String getAction() {
        return action;
    }

    public CancelEipTransferRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CancelEipTransferRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getTransferIdList() {
        return transferIdList;
    }

    public CancelEipTransferRequest setTransferIdList(List<String> transferIdList) {
        this.transferIdList = transferIdList;
        return this;
    }


}
