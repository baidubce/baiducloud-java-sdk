package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeUnplannedEventRecordsResponse extends BaseBceResponse {

    /**
    * 请求Id
    */
    private String requestId;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

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
    * 非预期事件列表
    */
    private List<UnplannedEventResponse> unplannedMaintenanceEvents;

    public String getRequestId() {
        return requestId;
    }

    public DescribeUnplannedEventRecordsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeUnplannedEventRecordsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeUnplannedEventRecordsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeUnplannedEventRecordsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeUnplannedEventRecordsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<UnplannedEventResponse> getUnplannedMaintenanceEvents() {
        return unplannedMaintenanceEvents;
    }

    public DescribeUnplannedEventRecordsResponse setUnplannedMaintenanceEvents(List<UnplannedEventResponse> unplannedMaintenanceEvents) {
        this.unplannedMaintenanceEvents = unplannedMaintenanceEvents;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeUnplannedEventRecordsResponse{" + "requestId=" + requestId + "\n" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys
                + "\n" + "nextMarker=" + nextMarker + "\n" + "unplannedMaintenanceEvents=" + unplannedMaintenanceEvents + "\n" + "}";
    }

}
