package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFilesetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * fileset id
    */
    private String filesetId;

    public String getRequestId() {
        return requestId;
    }

    public CreateFilesetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public CreateFilesetResponse setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateFilesetResponse{" + "requestId=" + requestId + "\n" + "filesetId=" + filesetId + "\n" + "}";
    }

}
