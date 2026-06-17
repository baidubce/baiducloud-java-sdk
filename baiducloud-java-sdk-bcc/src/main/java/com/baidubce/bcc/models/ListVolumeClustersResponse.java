package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListVolumeClustersResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值，当isTruncated为false时该域不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 返回的磁盘信息列表
    */
    private List<VolumeClusterModel> result;

    public String getMarker() {
        return marker;
    }

    public ListVolumeClustersResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListVolumeClustersResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListVolumeClustersResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListVolumeClustersResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<VolumeClusterModel> getResult() {
        return result;
    }

    public ListVolumeClustersResponse setResult(List<VolumeClusterModel> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListVolumeClustersResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "result=" + result + "\n" + "}";
    }

}
