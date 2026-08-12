package com.baidubce.ax.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuerySandboxesRequest extends BaseBceRequest {

    /**
    * 单页返回数量，取值 1-100，默认 100。
    */
    private Integer limit;

    /**
    * 上一页返回的游标，首次请求为空。
    */
    private String nextToken;

    /**
    * 沙箱实例 ID 列表，同组内 OR。
    */
    private List<String> sandboxIds;

    /**
    * 实际镜像地址列表，同组内 OR。
    */
    private List<String> imagePaths;

    /**
    * metadata 键值过滤，条件之间 AND。
    */
    private Map<String, String> metadata;

    /**
    * 沙箱状态列表，可选 running、paused、killing、killed。
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
