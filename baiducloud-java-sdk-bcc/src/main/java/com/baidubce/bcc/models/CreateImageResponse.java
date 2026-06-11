package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageResponse extends BaseBceResponse {

    /**
    * 已创建的镜像的ID
    */
    private String imageId;

    /**
    * 关联CDS磁盘的快照ID列表
    */
    private List<String> cdsSnapshotIds;

    public String getImageId() {
        return imageId;
    }

    public CreateImageResponse setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public List<String> getCdsSnapshotIds() {
        return cdsSnapshotIds;
    }

    public CreateImageResponse setCdsSnapshotIds(List<String> cdsSnapshotIds) {
        this.cdsSnapshotIds = cdsSnapshotIds;
        return this;
    }

    @Override
    public String toString() {
        return "CreateImageResponse{" + "imageId=" + imageId + "\n" + "cdsSnapshotIds=" + cdsSnapshotIds + "\n" + "}";
    }

}
