package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribePlannedEventsResponse extends BaseBceResponse {

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
    * 运维事件列表
    */
    private List<PlannedEventResponse> plannedMaintenanceEvents;

    public String getRequestId() {
        return requestId;
    }

    public DescribePlannedEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribePlannedEventsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribePlannedEventsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribePlannedEventsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribePlannedEventsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<PlannedEventResponse> getPlannedMaintenanceEvents() {
        return plannedMaintenanceEvents;
    }

    public DescribePlannedEventsResponse setPlannedMaintenanceEvents(List<PlannedEventResponse> plannedMaintenanceEvents) {
        this.plannedMaintenanceEvents = plannedMaintenanceEvents;
        return this;
    }

    @Override
    public String toString() {
        return "DescribePlannedEventsResponse{" + "requestId=" + requestId + "\n" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "nextMarker=" + nextMarker + "\n" + "plannedMaintenanceEvents=" + plannedMaintenanceEvents + "\n" + "}";
    }

}
