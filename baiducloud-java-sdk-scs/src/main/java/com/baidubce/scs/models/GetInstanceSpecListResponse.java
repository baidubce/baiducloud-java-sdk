package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceSpecListResponse extends BaseBceResponse {

    /**
    * Redis内存型标准版规格
    */
    private List<NodeTypeItem> defaultNodeTypeList;

    /**
    * Redis内存型集群版规格
    */
    private List<NodeTypeItem> clusterNodeTypeList;

    /**
    * Redis容量型（PegaDB）集群版规格
    */
    private List<NodeTypeItem> pegaClusterNodeTypeList;

    public List<NodeTypeItem> getDefaultNodeTypeList() {
        return defaultNodeTypeList;
    }

    public GetInstanceSpecListResponse setDefaultNodeTypeList(List<NodeTypeItem> defaultNodeTypeList) {
        this.defaultNodeTypeList = defaultNodeTypeList;
        return this;
    }

    public List<NodeTypeItem> getClusterNodeTypeList() {
        return clusterNodeTypeList;
    }

    public GetInstanceSpecListResponse setClusterNodeTypeList(List<NodeTypeItem> clusterNodeTypeList) {
        this.clusterNodeTypeList = clusterNodeTypeList;
        return this;
    }

    public List<NodeTypeItem> getPegaClusterNodeTypeList() {
        return pegaClusterNodeTypeList;
    }

    public GetInstanceSpecListResponse setPegaClusterNodeTypeList(List<NodeTypeItem> pegaClusterNodeTypeList) {
        this.pegaClusterNodeTypeList = pegaClusterNodeTypeList;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceSpecListResponse{" + "defaultNodeTypeList=" + defaultNodeTypeList + "\n" + "clusterNodeTypeList=" + clusterNodeTypeList + "\n"
                + "pegaClusterNodeTypeList=" + pegaClusterNodeTypeList + "\n" + "}";
    }

}
