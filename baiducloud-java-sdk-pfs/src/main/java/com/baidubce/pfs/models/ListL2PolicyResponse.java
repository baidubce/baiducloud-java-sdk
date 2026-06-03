package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL2PolicyResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * <li>True表示数据未全部返回<br><li>False表示数据全部返回
    */
    private Boolean isTruncated;

    /**
    * 请求返回的result个数
    */
    private Integer maxKeys;

    /**
    * 本次请求的起始位置
    */
    private String marker;

    /**
    * 下次请求的起始位置
    */
    private String nextMarker;

    /**
    * policy任务的详细列表
    */
    private List<PolicyInfo> result;

    public String getRequestId() {
        return requestId;
    }

    public ListL2PolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListL2PolicyResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL2PolicyResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL2PolicyResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListL2PolicyResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public List<PolicyInfo> getResult() {
        return result;
    }

    public ListL2PolicyResponse setResult(List<PolicyInfo> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListL2PolicyResponse{" + "requestId=" + requestId + "\n" + "isTruncated=" + isTruncated + "\n" + "maxKeys=" + maxKeys + "\n" + "marker=" + marker + "\n"
                + "nextMarker=" + nextMarker + "\n" + "result=" + result + "\n" + "}";
    }

}
