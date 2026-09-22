package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceWhiteGroupResponse extends BaseBceResponse {

    /**
    * 白名单分组列表
    */
    private List<ClusterIP> clusterIPGroups;

    public List<ClusterIP> getClusterIPGroups() {
        return clusterIPGroups;
    }

    public GetInstanceWhiteGroupResponse setClusterIPGroups(List<ClusterIP> clusterIPGroups) {
        this.clusterIPGroups = clusterIPGroups;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceWhiteGroupResponse{" + "clusterIPGroups=" + clusterIPGroups + "\n" + "}";
    }

}
