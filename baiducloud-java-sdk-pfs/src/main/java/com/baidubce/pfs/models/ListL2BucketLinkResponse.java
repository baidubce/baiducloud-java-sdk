package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL2BucketLinkResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 是否被截断，false表示本轮请求已包含全部数据
    */
    private Boolean isTruncated;

    /**
    * 本轮list的marker
    */
    private String marker;

    /**
    * 本轮返回的数据流动的数量
    */
    private Integer maxKeys;

    /**
    * 下一轮数据流动的marker
    */
    private String nextMarker;

    /**
    * 返回的数据流动具体列表
    */
    private List<BucketLinkInfo> result;

    public String getRequestId() {
        return requestId;
    }

    public ListL2BucketLinkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListL2BucketLinkResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL2BucketLinkResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL2BucketLinkResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListL2BucketLinkResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<BucketLinkInfo> getResult() {
        return result;
    }

    public ListL2BucketLinkResponse setResult(List<BucketLinkInfo> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListL2BucketLinkResponse{" + "requestId=" + requestId + "\n" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "nextMarker=" + nextMarker + "\n" + "result=" + result + "\n" + "}";
    }

}
