package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListReservedInstanceTransferInResponse extends BaseBceResponse {

    /**
    * 当前页标记
    */
    private String marker;

    /**
    * 是否截断
    */
    private Boolean isTruncated;

    /**
    * 下一页标记
    */
    private String nextMarker;

    /**
    * 每页最大数量
    */
    private Integer maxKeys;

    /**
    * 预留实例券转移记录总数
    */
    private Integer totalCount;

    /**
    * 预留实例券转移记录详情
    */
    private List<TransferInRecord> transferRecords;

    public String getMarker() {
        return marker;
    }

    public ListReservedInstanceTransferInResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListReservedInstanceTransferInResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListReservedInstanceTransferInResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListReservedInstanceTransferInResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListReservedInstanceTransferInResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<TransferInRecord> getTransferRecords() {
        return transferRecords;
    }

    public ListReservedInstanceTransferInResponse setTransferRecords(List<TransferInRecord> transferRecords) {
        this.transferRecords = transferRecords;
        return this;
    }

    @Override
    public String toString() {
        return "ListReservedInstanceTransferInResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys="
                + maxKeys + "\n" + "totalCount=" + totalCount + "\n" + "transferRecords=" + transferRecords + "\n" + "}";
    }

}
