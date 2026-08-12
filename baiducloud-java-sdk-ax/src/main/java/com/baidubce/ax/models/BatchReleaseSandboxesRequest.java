package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchReleaseSandboxesRequest extends BaseBceRequest {

    /**
    * 要释放的沙箱实例 ID 列表，最多 100 个。
    */
    private List<String> sandboxIds;

    public List<String> getSandboxIds() {
        return sandboxIds;
    }

    public BatchReleaseSandboxesRequest setSandboxIds(List<String> sandboxIds) {
        this.sandboxIds = sandboxIds;
        return this;
    }

}
