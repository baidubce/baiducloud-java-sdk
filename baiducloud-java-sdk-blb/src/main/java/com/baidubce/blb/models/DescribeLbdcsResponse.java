package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLbdcsResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 包含查询结果的LBDC列表
    */
    private List<ClusterModel> clusterList;

    public String getMarker() {
        return marker;
    }

    public DescribeLbdcsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeLbdcsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeLbdcsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeLbdcsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<ClusterModel> getClusterList() {
        return clusterList;
    }

    public DescribeLbdcsResponse setClusterList(List<ClusterModel> clusterList) {
        this.clusterList = clusterList;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLbdcsResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "clusterList=" + clusterList + "\n" + "}";
    }

}
