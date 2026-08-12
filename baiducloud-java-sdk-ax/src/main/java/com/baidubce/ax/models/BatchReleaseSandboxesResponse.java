package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchReleaseSandboxesResponse extends BaseBceResponse {

    /**
    * 每个沙箱实例的释放结果。
    */
    private List<ReleaseResult> results;

    public List<ReleaseResult> getResults() {
        return results;
    }

    public BatchReleaseSandboxesResponse setResults(List<ReleaseResult> results) {
        this.results = results;
        return this;
    }

    @Override
    public String toString() {
        return "BatchReleaseSandboxesResponse{" + "results=" + results + "\n" + "}";
    }

}
