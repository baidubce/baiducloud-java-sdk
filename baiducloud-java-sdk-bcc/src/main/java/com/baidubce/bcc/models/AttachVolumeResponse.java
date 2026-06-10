package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachVolumeResponse extends BaseBceResponse {

    /**
    * volumeAttachment
    */
    private VolumeAttachmentModel volumeAttachment;

    /**
    * 挂载磁盘产生的warning信息
    */
    private List<String> warningList;

    public VolumeAttachmentModel getVolumeAttachment() {
        return volumeAttachment;
    }

    public AttachVolumeResponse setVolumeAttachment(VolumeAttachmentModel volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public List<String> getWarningList() {
        return warningList;
    }

    public AttachVolumeResponse setWarningList(List<String> warningList) {
        this.warningList = warningList;
        return this;
    }

    @Override
    public String toString() {
        return "AttachVolumeResponse{" + "volumeAttachment=" + volumeAttachment + "\n" + "warningList=" + warningList + "\n" + "}";
    }

}
