package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopySnapshotRequest extends BaseBceRequest {

    /**
    * snapshotId
    */
    @JsonIgnore
    private String snapshotId;

    /**
    * 待复制到目标区域列表
    */
    private List<RemoteCopyRequest> destRegionInfos;

    public String getSnapshotId() {
        return snapshotId;
    }

    public RemoteCopySnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public List<RemoteCopyRequest> getDestRegionInfos() {
        return destRegionInfos;
    }

    public RemoteCopySnapshotRequest setDestRegionInfos(List<RemoteCopyRequest> destRegionInfos) {
        this.destRegionInfos = destRegionInfos;
        return this;
    }

}
