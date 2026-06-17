package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListReservedInstanceTransferOutRequest extends BaseBceRequest {

    /**
    * marker
    */
    @JsonIgnore
    private String marker;

    /**
    * maxKeys
    */
    @JsonIgnore
    private Integer maxKeys;

    /**
    * 通过预留实例券id列表过滤
    */
    private List<String> reservedInstanceIds;

    /**
    * 通过预留实例券转移记录id列表过滤
    */
    private List<String> transferRecordIds;

    /**
    * 通过实例规格过滤
    */
    private String spec;

    /**
    * 通过转移记录状态过滤
    */
    private String status;

    public String getMarker() {
        return marker;
    }

    public ListReservedInstanceTransferOutRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListReservedInstanceTransferOutRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public ListReservedInstanceTransferOutRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public List<String> getTransferRecordIds() {
        return transferRecordIds;
    }

    public ListReservedInstanceTransferOutRequest setTransferRecordIds(List<String> transferRecordIds) {
        this.transferRecordIds = transferRecordIds;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public ListReservedInstanceTransferOutRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListReservedInstanceTransferOutRequest setStatus(String status) {
        this.status = status;
        return this;
    }

}
