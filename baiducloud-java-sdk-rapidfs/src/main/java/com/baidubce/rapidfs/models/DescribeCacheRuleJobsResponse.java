package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeCacheRuleJobsResponse extends BaseBceResponse {

    /**
    * 缓存管理任务信息列表，见附录 CacheJobInfo
    */
    private List<CacheJobInfo> cacheJobInfos;

    /**
    * 当前查询起始位置
    */
    private String marker;

    /**
    * true 表示后面还有数据，false 表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 下一页起始位置，为 null 表示后面没有数据了
    */
    private String nextMarker;

    /**
    * 返回的列表元素个数
    */
    private Integer maxKeys;

    public List<CacheJobInfo> getCacheJobInfos() {
        return cacheJobInfos;
    }

    public DescribeCacheRuleJobsResponse setCacheJobInfos(List<CacheJobInfo> cacheJobInfos) {
        this.cacheJobInfos = cacheJobInfos;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeCacheRuleJobsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeCacheRuleJobsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeCacheRuleJobsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeCacheRuleJobsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeCacheRuleJobsResponse{" + "cacheJobInfos=" + cacheJobInfos + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker="
                + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n" + "}";
    }

}
