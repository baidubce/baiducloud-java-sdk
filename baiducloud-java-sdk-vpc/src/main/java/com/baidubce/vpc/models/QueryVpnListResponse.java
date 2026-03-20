package com.baidubce.vpc.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryVpnListResponse extends BaseBceResponse {
    /**
     * 标记查询的起始位置
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

    /**
     * VPN列表
     */
    private List<Vpn> vpns;

    public QueryVpnListResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public String getMarker() {
        return this.marker;
    }

    public QueryVpnListResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public QueryVpnListResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public QueryVpnListResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public QueryVpnListResponse setVpns(List<Vpn> vpns) {
        this.vpns = vpns;
        return this;
    }

    public List<Vpn> getVpns() {
        return this.vpns;
    }

    @Override
    public String toString() {
        return "QueryVpnListResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "vpns=" + vpns + "\n" + "}";
    }

}