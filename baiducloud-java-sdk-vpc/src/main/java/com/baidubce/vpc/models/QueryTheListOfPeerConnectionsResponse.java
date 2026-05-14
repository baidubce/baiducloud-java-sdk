package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfPeerConnectionsResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<PeerConn> peerConns;

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

    public List<PeerConn> getPeerConns() {
        return peerConns;
    }

    public QueryTheListOfPeerConnectionsResponse setPeerConns(List<PeerConn> peerConns) {
        this.peerConns = peerConns;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfPeerConnectionsResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryTheListOfPeerConnectionsResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryTheListOfPeerConnectionsResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfPeerConnectionsResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheListOfPeerConnectionsResponse{" + "peerConns=" + peerConns + "\n" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker="
                + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n" + "}";
    }

}
