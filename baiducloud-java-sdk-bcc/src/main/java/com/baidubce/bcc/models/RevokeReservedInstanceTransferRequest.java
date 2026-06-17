package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RevokeReservedInstanceTransferRequest extends BaseBceRequest {

    /**
    * 要撤销的预留实例券id列表
    */
    private List<String> transferRecordIds;

    public List<String> getTransferRecordIds() {
        return transferRecordIds;
    }

    public RevokeReservedInstanceTransferRequest setTransferRecordIds(List<String> transferRecordIds) {
        this.transferRecordIds = transferRecordIds;
        return this;
    }

}
