package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListEipTransferRequest {

    /**
    * maxKeys
    */
    @JsonIgnore
    private String maxKeys;

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * direction
    */
    @JsonIgnore
    private String direction;

    /**
    * transferId
    */
    @JsonIgnore
    private String transferId;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * fuzzyTransferId
    */
    @JsonIgnore
    private String fuzzyTransferId;

    /**
    * fuzzyInstanceId
    */
    @JsonIgnore
    private String fuzzyInstanceId;

    /**
    * fuzzyInstanceName
    */
    @JsonIgnore
    private String fuzzyInstanceName;

    /**
    * fuzzyInstanceIp
    */
    @JsonIgnore
    private String fuzzyInstanceIp;


    public String getMaxKeys() {
        return maxKeys;
    }

    public ListEipTransferRequest setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListEipTransferRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public ListEipTransferRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public String getTransferId() {
        return transferId;
    }

    public ListEipTransferRequest setTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListEipTransferRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getFuzzyTransferId() {
        return fuzzyTransferId;
    }

    public ListEipTransferRequest setFuzzyTransferId(String fuzzyTransferId) {
        this.fuzzyTransferId = fuzzyTransferId;
        return this;
    }

    public String getFuzzyInstanceId() {
        return fuzzyInstanceId;
    }

    public ListEipTransferRequest setFuzzyInstanceId(String fuzzyInstanceId) {
        this.fuzzyInstanceId = fuzzyInstanceId;
        return this;
    }

    public String getFuzzyInstanceName() {
        return fuzzyInstanceName;
    }

    public ListEipTransferRequest setFuzzyInstanceName(String fuzzyInstanceName) {
        this.fuzzyInstanceName = fuzzyInstanceName;
        return this;
    }

    public String getFuzzyInstanceIp() {
        return fuzzyInstanceIp;
    }

    public ListEipTransferRequest setFuzzyInstanceIp(String fuzzyInstanceIp) {
        this.fuzzyInstanceIp = fuzzyInstanceIp;
        return this;
    }


}
