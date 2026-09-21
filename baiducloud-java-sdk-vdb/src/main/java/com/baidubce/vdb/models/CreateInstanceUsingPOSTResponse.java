package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceUsingPOSTResponse extends BaseBceResponse {

    /**
    * enableEncryption
    */
    private Boolean enableEncryption;

    /**
    * instanceIdList
    */
    private List<String> instanceIdList;

    /**
    * orderId
    */
    private String orderId;

    public Boolean getEnableEncryption() {
        return enableEncryption;
    }

    public CreateInstanceUsingPOSTResponse setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
        return this;
    }

    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public CreateInstanceUsingPOSTResponse setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public CreateInstanceUsingPOSTResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateInstanceUsingPOSTResponse{" + "enableEncryption=" + enableEncryption + "\n" + "instanceIdList=" + instanceIdList + "\n" + "orderId=" + orderId + "\n" + "}";
    }

}
