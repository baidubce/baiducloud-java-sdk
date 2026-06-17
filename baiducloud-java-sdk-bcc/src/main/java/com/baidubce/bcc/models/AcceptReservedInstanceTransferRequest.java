package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptReservedInstanceTransferRequest extends BaseBceRequest {

    /**
    * 要接受的预留实例券转移记录id
    */
    private String transferRecordId;

    /**
    * 接收roce预留实例券时可选参数，若为空则使用默认EHC集群
    */
    private String ehcClusterId;

    public String getTransferRecordId() {
        return transferRecordId;
    }

    public AcceptReservedInstanceTransferRequest setTransferRecordId(String transferRecordId) {
        this.transferRecordId = transferRecordId;
        return this;
    }

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public AcceptReservedInstanceTransferRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

}
