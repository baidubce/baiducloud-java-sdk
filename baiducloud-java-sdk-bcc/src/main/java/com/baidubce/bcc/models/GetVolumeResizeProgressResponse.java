package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVolumeResizeProgressResponse extends BaseBceResponse {

    /**
    * 磁盘变配进度
    */
    private Integer progress;

    public Integer getProgress() {
        return progress;
    }

    public GetVolumeResizeProgressResponse setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    @Override
    public String toString() {
        return "GetVolumeResizeProgressResponse{" + "progress=" + progress + "\n" + "}";
    }

}
