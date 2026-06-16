package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopySnapshotResponse extends BaseBceResponse {

    /**
    * 目标区域快照信息
    */
    private List<RemoteCopySnapshot> result;

    public List<RemoteCopySnapshot> getResult() {
        return result;
    }

    public RemoteCopySnapshotResponse setResult(List<RemoteCopySnapshot> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "RemoteCopySnapshotResponse{" + "result=" + result + "\n" + "}";
    }

}
