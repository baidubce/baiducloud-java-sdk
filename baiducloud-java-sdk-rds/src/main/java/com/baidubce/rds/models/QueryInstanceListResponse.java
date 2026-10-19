package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryInstanceListResponse extends BaseBceResponse {

    /**
    * 获取匹配到marker主实列表的查询的实例ID，不传递 marker，系统默认为-1
    */
    private String marker;

    /**
    * 每页包含的最大数量，最大数量通常不超过1000，缺省值为1000
    */
    private Integer maxKeys;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * Instance对象数组
    */
    private List<Instance> instances;

    /**
    * 下一页所需要传递的marker值。当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    public String getMarker() {
        return marker;
    }

    public QueryInstanceListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryInstanceListResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryInstanceListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public QueryInstanceListResponse setInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryInstanceListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    @Override
    public String toString() {
        return "QueryInstanceListResponse{" + "marker=" + marker + "\n" + "maxKeys=" + maxKeys + "\n" + "isTruncated=" + isTruncated + "\n" + "instances=" + instances + "\n"
                + "nextMarker=" + nextMarker + "\n" + "}";
    }

}
