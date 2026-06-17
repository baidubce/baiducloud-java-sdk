package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVolumeClusterResponse extends BaseBceResponse {

    /**
    * 专属集群ID的集合，其中ID符合BCE规范，必须是一个定长字符串，且只允许包含大小写字母、数字、连字号（-）和下划线（_）。
    */
    private List<String> clusterIds;

    public List<String> getClusterIds() {
        return clusterIds;
    }

    public CreateVolumeClusterResponse setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    @Override
    public String toString() {
        return "CreateVolumeClusterResponse{" + "clusterIds=" + clusterIds + "\n" + "}";
    }

}
