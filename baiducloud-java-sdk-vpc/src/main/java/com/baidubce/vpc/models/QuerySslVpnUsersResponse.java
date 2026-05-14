package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySslVpnUsersResponse extends BaseBceResponse {

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
    * SSL-VPN用户列表
    */
    private List<SslVpnUserVo> sslVpnUsers;

    public String getMarker() {
        return marker;
    }

    public QuerySslVpnUsersResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QuerySslVpnUsersResponse setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QuerySslVpnUsersResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QuerySslVpnUsersResponse setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<SslVpnUserVo> getSslVpnUsers() {
        return sslVpnUsers;
    }

    public QuerySslVpnUsersResponse setSslVpnUsers(List<SslVpnUserVo> sslVpnUsers) {
        this.sslVpnUsers = sslVpnUsers;
        return this;
    }

    @Override
    public String toString() {
        return "QuerySslVpnUsersResponse{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys=" + maxKeys + "\n"
                + "sslVpnUsers=" + sslVpnUsers + "\n" + "}";
    }

}
