package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReservedInstanceResponse extends BaseBceResponse {

    /**
    * 预留实例券的总数量
    */
    private Integer totalCount;

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 预留实例券信息，由 ReservedInstanceInfo 组成的集合
    */
    private List<ReservedInstanceInfo> reservedInstances;

    public Integer getTotalCount() {
        return totalCount;
    }

    public GetReservedInstanceResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public GetReservedInstanceResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public GetReservedInstanceResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public GetReservedInstanceResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public GetReservedInstanceResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public List<ReservedInstanceInfo> getReservedInstances() {
        return reservedInstances;
    }

    public GetReservedInstanceResponse setReservedInstances(List<ReservedInstanceInfo> reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }

    @Override
    public String toString() {
        return "GetReservedInstanceResponse{" + "totalCount=" + totalCount + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "nextMarker=" + nextMarker + "\n"
                + "isTruncated=" + isTruncated + "\n" + "reservedInstances=" + reservedInstances + "\n" + "}";
    }

}
