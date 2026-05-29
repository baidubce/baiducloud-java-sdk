package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFileSystemResponse extends BaseBceResponse {

    /**
    * FileSystem的ID。后续针对该实例的操作，均需要在请求中带上此ID。
    */
    private String fsId;

    public String getFsId() {
        return fsId;
    }

    public CreateFileSystemResponse setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateFileSystemResponse{" + "fsId=" + fsId + "\n" + "}";
    }

}
