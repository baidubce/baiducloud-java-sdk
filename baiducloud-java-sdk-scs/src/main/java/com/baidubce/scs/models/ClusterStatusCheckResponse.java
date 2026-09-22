package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterStatusCheckResponse extends BaseBceResponse {

    /**
    * 用于描述集群状态，有两种取值。normal 集群状态正常；abnormal 集群状态不正常。
    */
    private String clusterStatus;

    /**
    * checkList
    */
    private CheckList checkList;

    public String getClusterStatus() {
        return clusterStatus;
    }

    public ClusterStatusCheckResponse setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    public CheckList getCheckList() {
        return checkList;
    }

    public ClusterStatusCheckResponse setCheckList(CheckList checkList) {
        this.checkList = checkList;
        return this;
    }

    @Override
    public String toString() {
        return "ClusterStatusCheckResponse{" + "clusterStatus=" + clusterStatus + "\n" + "checkList=" + checkList + "\n" + "}";
    }

}
