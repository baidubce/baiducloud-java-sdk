package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbIpGroupResponse extends BaseBceResponse {

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
    * 包含查询结果的IP组列表
    */
    private List<AppIpGroup> appIpGroupList;

    public String getMarker() {
        return marker;
    }

    public DescribeAppBlbIpGroupResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public DescribeAppBlbIpGroupResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public DescribeAppBlbIpGroupResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public DescribeAppBlbIpGroupResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<AppIpGroup> getAppIpGroupList() {
        return appIpGroupList;
    }

    public DescribeAppBlbIpGroupResponse setAppIpGroupList(List<AppIpGroup> appIpGroupList) {
        this.appIpGroupList = appIpGroupList;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAppBlbIpGroupResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "appIpGroupList=" + appIpGroupList + "\n" + "}";
    }

}
