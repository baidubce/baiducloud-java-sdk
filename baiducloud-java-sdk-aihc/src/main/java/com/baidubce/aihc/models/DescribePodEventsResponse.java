package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribePodEventsResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * 成功请求时的返回结果
    */
    private List<Event> events;

    /**
    * 事件总数
    */
    private Integer total;

    public String getRequestId() {
        return requestId;
    }

    public DescribePodEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public List<Event> getEvents() {
        return events;
    }

    public DescribePodEventsResponse setEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public DescribePodEventsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "DescribePodEventsResponse{" + "requestId=" + requestId + "\n" + "events=" + events + "\n" + "total=" + total + "\n" + "}";
    }

}
