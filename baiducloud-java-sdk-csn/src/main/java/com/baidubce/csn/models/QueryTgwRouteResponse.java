package com.baidubce.csn.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTgwRouteResponse extends BaseBceResponse {

    /**
    * TGW路由条目列表
    */
    private List<TgwRtRule> tgwRtRules;

    /**
    * 标记查询的起始位置，若结果列表为空，此项不存在
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值；当isTruncated为false时，该域不出现
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    public List<TgwRtRule> getTgwRtRules() {
        return tgwRtRules;
    }

    public QueryTgwRouteResponse setTgwRtRules(List<TgwRtRule> tgwRtRules) {
        this.tgwRtRules = tgwRtRules;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTgwRouteResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryTgwRouteResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryTgwRouteResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTgwRouteResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTgwRouteResponse{" + "tgwRtRules=" + tgwRtRules + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n"
                + "maxKeys=" + maxKeys + "\n" + "}";
    }

}
