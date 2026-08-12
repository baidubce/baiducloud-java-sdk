package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListSandboxesV2ByPathResponse extends BaseBceResponse {

    /**
    * 沙箱实例数组。
    */
    private List<ListedSandbox> sandboxes;

    public List<ListedSandbox> getSandboxes() {
        return sandboxes;
    }

    public ListSandboxesV2ByPathResponse setSandboxes(List<ListedSandbox> sandboxes) {
        this.sandboxes = sandboxes;
        return this;
    }

    @Override
    public String toString() {
        return "ListSandboxesV2ByPathResponse{" + "sandboxes=" + sandboxes + "\n" + "}";
    }

}
