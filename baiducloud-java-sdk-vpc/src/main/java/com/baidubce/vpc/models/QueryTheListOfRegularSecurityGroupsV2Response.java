package com.baidubce.vpc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheListOfRegularSecurityGroupsV2Response extends BaseBceResponse {

    /**
    * 标记查询的起始位置
    */
    private String marker;

    /**
    * true表示后面还有数据，false表示已经是最后一页。
    */
    private Boolean isTruncated;

    /**
    * 获取下一页所需要传递的marker值。当isTruncated为false时，该域不出现。
    */
    private String nextMarker;

    /**
    * 每页包含的最大数量
    */
    private Integer maxKeys;

    /**
    * 安全组信息，由SecurityGroupModel组成的集合
    */
    private List<SecurityGroupModel> securityGroups;

    public String getMarker() {
        return marker;
    }

    public QueryTheListOfRegularSecurityGroupsV2Response setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }

    public QueryTheListOfRegularSecurityGroupsV2Response setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public QueryTheListOfRegularSecurityGroupsV2Response setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public QueryTheListOfRegularSecurityGroupsV2Response setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public List<SecurityGroupModel> getSecurityGroups() {
        return securityGroups;
    }

    public QueryTheListOfRegularSecurityGroupsV2Response setSecurityGroups(List<SecurityGroupModel> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheListOfRegularSecurityGroupsV2Response{" + "marker=" + marker + "\n" + "isTruncated=" + isTruncated + "\n" + "nextMarker=" + nextMarker + "\n" + "maxKeys="
                + maxKeys + "\n" + "securityGroups=" + securityGroups + "\n" + "}";
    }

}
