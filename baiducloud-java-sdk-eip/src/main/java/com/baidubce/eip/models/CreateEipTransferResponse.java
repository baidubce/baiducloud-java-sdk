package com.baidubce.eip.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEipTransferResponse extends BaseBceResponse {
    /**
     * 转移信息
     */
    private List<TransferInfo> transfers;

    public CreateEipTransferResponse setTransfers(List<TransferInfo> transfers) {
        this.transfers = transfers;
        return this;
    }

    public List<TransferInfo> getTransfers() {
        return this.transfers;
    }

    @Override
    public String toString() {
        return "CreateEipTransferResponse{" + "transfers=" + transfers + "\n" + "}";
    }

}