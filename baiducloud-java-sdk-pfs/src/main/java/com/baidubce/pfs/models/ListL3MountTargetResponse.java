package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL3MountTargetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 是否被截断，false表示本轮请求已包含全部数据
    */
    private String isTruncated;

    /**
    * 本轮list的marker
    */
    private String marker;

    /**
    * 本轮返回的挂载点的数量
    */
    private String maxKeys;

    /**
    * 下一轮挂载点的marker
    */
    private String nextMarker;

    /**
    * 返回的挂载点具体列表
    */
    private List<MountTargetInfo> result;

    public String getRequestId() {
        return requestId;
    }

    public ListL3MountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getIsTruncated() {
        return isTruncated;
    }

    public ListL3MountTargetResponse setIsTruncated(String isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL3MountTargetResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public ListL3MountTargetResponse setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListL3MountTargetResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<MountTargetInfo> getResult() {
        return result;
    }

    public ListL3MountTargetResponse setResult(List<MountTargetInfo> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListL3MountTargetResponse{" + "requestId=" + requestId + "\n" + "isTruncated=" + isTruncated + "\n" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "nextMarker=" + nextMarker + "\n" + "result=" + result + "\n" + "}";
    }

}
