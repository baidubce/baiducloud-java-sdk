package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobEventsResponse extends BaseBceResponse {

    /**
    * 请求ID，用于标译每个请求的唯一性
    */
    private String requestId;

    /**
    * 事件列表
    */
    private List<Event> events;

    /**
    * 事件的总数
    */
    private Integer total;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public List<Event> getEvents() {
        return events;
    }

    public DescribeJobEventsResponse setEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public DescribeJobEventsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobEventsResponse{" + "requestId=" + requestId + "\n" + "events=" + events + "\n" + "total=" + total + "\n" + "}";
    }

}
