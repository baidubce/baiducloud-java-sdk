package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbHttpListenerResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<AppHTTPListenerModel> listenerList;

    /**
    * 标记查询的起始位置，若结果列表为空，此项不存在
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

    public List<AppHTTPListenerModel> getListenerList() {
        return listenerList;
    }

    public DescribeAppBlbHttpListenerResponse setListenerList(List<AppHTTPListenerModel> listenerList) {
        this.listenerList = listenerList;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbHttpListenerResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeAppBlbHttpListenerResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeAppBlbHttpListenerResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbHttpListenerResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAppBlbHttpListenerResponse{" + "listenerList=" + listenerList + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker="
                + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n" + "}";
    }

}
