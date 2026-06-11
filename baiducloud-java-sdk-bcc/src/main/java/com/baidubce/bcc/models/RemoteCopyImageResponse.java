package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopyImageResponse extends BaseBceResponse {

    /**
    * 远程复制结果
    */
    private List<RemoteCopyResult> result;

    public List<RemoteCopyResult> getResult() {
        return result;
    }

    public RemoteCopyImageResponse setResult(List<RemoteCopyResult> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "RemoteCopyImageResponse{" + "result=" + result + "\n" + "}";
    }

}
