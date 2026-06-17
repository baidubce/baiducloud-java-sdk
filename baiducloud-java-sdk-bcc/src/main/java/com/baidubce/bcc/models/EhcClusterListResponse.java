package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EhcClusterListResponse extends BaseBceResponse {

    /**
    * EHC集群总数
    */
    private Integer totalCount;

    /**
    * EHC集群信息列表
    */
    private List<EhcCluster> ehcClusters;

    public Integer getTotalCount() {
        return totalCount;
    }

    public EhcClusterListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<EhcCluster> getEhcClusters() {
        return ehcClusters;
    }

    public EhcClusterListResponse setEhcClusters(List<EhcCluster> ehcClusters) {
        this.ehcClusters = ehcClusters;
        return this;
    }

    @Override
    public String toString() {
        return "EhcClusterListResponse{" + "totalCount=" + totalCount + "\n" + "ehcClusters=" + ehcClusters + "\n" + "}";
    }

}
