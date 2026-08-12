package com.baidubce.ax.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySandboxesResponse extends BaseBceResponse {

    /**
    * 满足条件的沙箱实例列表。
    */
    private List<QueriedSandbox> sandboxes;

    /**
    * 下一页游标，为空表示没有更多数据。
    */
    private String nextToken;

    public List<QueriedSandbox> getSandboxes() {
        return sandboxes;
    }

    public QuerySandboxesResponse setSandboxes(List<QueriedSandbox> sandboxes) {
        this.sandboxes = sandboxes;
        return this;
    }

    public String getNextToken() {
        return nextToken;
    }

    public QuerySandboxesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    @Override
    public String toString() {
        return "QuerySandboxesResponse{" + "sandboxes=" + sandboxes + "\n" + "nextToken=" + nextToken + "\n" + "}";
    }

}
