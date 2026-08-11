package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySandboxesRequest extends BaseBceRequest {

    /**
    * 单页返回的最大沙箱数，取值范围为 1-100，默认 100。
    */
    private Integer limit;

    /**
    * 上一页响应返回的游标。首次查询不传或传空字符串；响应中为空表示没有更多数据。
    */
    private String nextToken;

    /**
    * 沙箱实例 ID 过滤条件，最多 100 个。多个 ID 之间为 OR 关系。
    */
    private List<String> sandboxIds;

    /**
    * 实际镜像地址过滤条件，最多 100 个。多个镜像地址之间为 OR 关系。
    */
    private List<String> imagePaths;

    /**
    * 沙箱 metadata 过滤条件。所有 key-value 条件均需匹配。
    */
    private Map<String, String> metadata;

    /**
    * 沙箱状态过滤条件，取值为 running、paused、killing 或 killed。多个状态之间为 OR 关系。
    */
    private List<String> state;

    public Integer getLimit() {
        return limit;
    }

    public QuerySandboxesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public String getNextToken() {
        return nextToken;
    }

    public QuerySandboxesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    public List<String> getSandboxIds() {
        return sandboxIds;
    }

    public QuerySandboxesRequest setSandboxIds(List<String> sandboxIds) {
        this.sandboxIds = sandboxIds;
        return this;
    }

    public List<String> getImagePaths() {
        return imagePaths;
    }

    public QuerySandboxesRequest setImagePaths(List<String> imagePaths) {
        this.imagePaths = imagePaths;
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public QuerySandboxesRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public List<String> getState() {
        return state;
    }

    public QuerySandboxesRequest setState(List<String> state) {
        this.state = state;
        return this;
    }

}
