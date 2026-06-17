package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListReservedInstanceTransferOutResponse extends BaseBceResponse {

    /**
    * 当前页标记
    */
    private String marker;

    /**
    * 是否还有下一页
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
    private List<TransferOutRecord> transferRecords;

    public String getMarker() {
        return marker;
    }

    public ListReservedInstanceTransferOutResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListReservedInstanceTransferOutResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListReservedInstanceTransferOutResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListReservedInstanceTransferOutResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListReservedInstanceTransferOutResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<TransferOutRecord> getTransferRecords() {
        return transferRecords;
    }

    public ListReservedInstanceTransferOutResponse setTransferRecords(List<TransferOutRecord> transferRecords) {
        this.transferRecords = transferRecords;
        return this;
    }

    @Override
    public String toString() {
        return "ListReservedInstanceTransferOutResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys="
                + maxKeys + "\n" + "totalCount=" + totalCount + "\n" + "transferRecords=" + transferRecords + "\n" + "}";
    }

}
