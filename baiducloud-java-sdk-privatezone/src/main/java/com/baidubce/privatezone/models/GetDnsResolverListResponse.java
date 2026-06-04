package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverListResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示最后一页
    */
    private String isTruncated;

    /**
    * 下一页需要传递的marker值
    */
    private String nextMarker;

    /**
    * 每一页包含的最大数量，最大数量为100
    */
    private String maxKeys;

    /**
    * 解析器列表
    */
    private List<DnsResolver> result;

    public String getMarker() {
        return marker;
    }

    public GetDnsResolverListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getIsTruncated() {
        return isTruncated;
    }

    public GetDnsResolverListResponse setIsTruncated(String isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public GetDnsResolverListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public GetDnsResolverListResponse setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<DnsResolver> getResult() {
        return result;
    }

    public GetDnsResolverListResponse setResult(List<DnsResolver> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetDnsResolverListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "result=" + result + "\n" + "}";
    }

}
