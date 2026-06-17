package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RefuseReservedInstanceTransferRequest extends BaseBceRequest {

    /**
    * 要拒绝的预留实例券转移记录id列表，最少1个，最多99个
    */
    private List<String> transferRecordIds;

    public List<String> getTransferRecordIds() {
        return transferRecordIds;
    }

    public RefuseReservedInstanceTransferRequest setTransferRecordIds(List<String> transferRecordIds) {
        this.transferRecordIds = transferRecordIds;
        return this;
    }

}
