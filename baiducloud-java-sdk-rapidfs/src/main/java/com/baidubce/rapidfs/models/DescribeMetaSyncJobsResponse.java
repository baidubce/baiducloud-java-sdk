package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeMetaSyncJobsResponse extends BaseBceResponse {

    /**
    * 元数据同步任务信息列表，见附录 MetaSyncJobInfo
    */
    private List<MetaSyncJobInfo> metaSyncJobInfos;

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

    public List<MetaSyncJobInfo> getMetaSyncJobInfos() {
        return metaSyncJobInfos;
    }

    public DescribeMetaSyncJobsResponse setMetaSyncJobInfos(List<MetaSyncJobInfo> metaSyncJobInfos) {
        this.metaSyncJobInfos = metaSyncJobInfos;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeMetaSyncJobsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeMetaSyncJobsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeMetaSyncJobsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeMetaSyncJobsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeMetaSyncJobsResponse{" + "metaSyncJobInfos=" + metaSyncJobInfos + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker="
                + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n" + "}";
    }

}
