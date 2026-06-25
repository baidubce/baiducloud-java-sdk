package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteReadRequest extends BaseBceRequest {

    /**
    * remoteReadUrl
    */
    @JsonIgnore
    private String remoteReadUrl;

    /**
    * 查询的指标表达式，支持直接填写指标名，也支持带 Label 选择器的 PromQL 表达式。使用 `GET` 调用时，将该参数放入 URL 查询串。
    */
    private String query;

    /**
    * 查询数据步长，单位：秒。仅在 `/query_range` 请求中必填；使用 `GET` 调用时，可放入 URL 查询串。
    */
    private Integer step;

    /**
    * 查询开始时间戳，单位：秒。仅在 `/query_range` 请求中必填；使用 `GET` 调用时，可放入 URL 查询串。
    */
    private Long start;

    /**
    * 查询结束时间戳，单位：秒。仅在 `/query_range` 请求中必填；使用 `GET` 调用时，可放入 URL 查询串。
    */
    private Long end;

    public String getRemoteReadUrl() {
        return remoteReadUrl;
    }

    public RemoteReadRequest setRemoteReadUrl(String remoteReadUrl) {
        this.remoteReadUrl = remoteReadUrl;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public RemoteReadRequest setQuery(String query) {
        this.query = query;
        return this;
    }

    public Integer getStep() {
        return step;
    }

    public RemoteReadRequest setStep(Integer step) {
        this.step = step;
        return this;
    }

    public Long getStart() {
        return start;
    }

    public RemoteReadRequest setStart(Long start) {
        this.start = start;
        return this;
    }

    public Long getEnd() {
        return end;
    }

    public RemoteReadRequest setEnd(Long end) {
        this.end = end;
        return this;
    }

}
