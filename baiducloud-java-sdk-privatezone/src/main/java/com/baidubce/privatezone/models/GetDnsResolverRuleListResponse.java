package com.baidubce.privatezone.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetDnsResolverRuleListResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * `true` 表示后面还有数据，`false` 表示最后一页
    */
    private String isTruncated;

    /**
    * 下一页需要传递的 marker 值
    */
    private String nextMarker;

    /**
    * 每一页包含的最大数量
    */
    private String maxKeys;

    /**
    * 转发规则列表
    */
    private List<DnsResolverRule> result;

    public String getMarker() {
        return marker;
    }

    public GetDnsResolverRuleListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getIsTruncated() {
        return isTruncated;
    }

    public GetDnsResolverRuleListResponse setIsTruncated(String isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public GetDnsResolverRuleListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getMaxKeys() {
        return maxKeys;
    }

    public GetDnsResolverRuleListResponse setMaxKeys(String maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<DnsResolverRule> getResult() {
        return result;
    }

    public GetDnsResolverRuleListResponse setResult(List<DnsResolverRule> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetDnsResolverRuleListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys
                + "\n" + "result=" + result + "\n" + "}";
    }

}
