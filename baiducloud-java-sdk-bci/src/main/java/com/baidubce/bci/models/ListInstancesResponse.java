package com.baidubce.bci.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListInstancesResponse extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需传递的marker值。当isTruncated为false时不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * BCI实例信息列表
    */
    private List<InstanceModel> result;

    public String getMarker() {
        return marker;
    }

    public ListInstancesResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public ListInstancesResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public ListInstancesResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListInstancesResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<InstanceModel> getResult() {
        return result;
    }

    public ListInstancesResponse setResult(List<InstanceModel> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListInstancesResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "result=" + result + "\n" + "}";
    }

}
