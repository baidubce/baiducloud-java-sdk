package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3ClientsResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 返回的客户端列表，元素见下表
    */
    private List<L3ClientModel> result;

    /**
    * 本轮请求使用的 marker
    */
    private String marker;

    /**
    * 本轮请求生效的分页大小上限
    */
    private Integer maxKeys;

    /**
    * 是否被截断，false 表示本轮已返回全部数据
    */
    private Boolean isTruncated;

    /**
    * 下一轮请求应传入的 marker，未截断时为 null
    */
    private String nextMarker;

    public String getRequestId() {
        return requestId;
    }

    public ListL3ClientsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public List<L3ClientModel> getResult() {
        return result;
    }

    public ListL3ClientsResponse setResult(List<L3ClientModel> result) {
        this.result = result;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL3ClientsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL3ClientsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListL3ClientsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListL3ClientsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    @Override
    public String toString() {
        return "ListL3ClientsResponse{" + "requestId=" + requestId + "\n" + "result=" + result + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "isTruncated="
                + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "}";
    }

}
