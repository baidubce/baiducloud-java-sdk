package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateReservedInstanceTransferRequest extends BaseBceRequest {

    /**
    * 要转移的预留实例券id列表
    */
    private List<String> reservedInstanceIds;

    /**
    * 接收人的账号id
    */
    private String recipientAccountId;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public CreateReservedInstanceTransferRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public String getRecipientAccountId() {
        return recipientAccountId;
    }

    public CreateReservedInstanceTransferRequest setRecipientAccountId(String recipientAccountId) {
        this.recipientAccountId = recipientAccountId;
        return this;
    }

}
