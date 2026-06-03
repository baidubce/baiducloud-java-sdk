package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCacheNodesResponse extends BaseBceResponse {

    /**
    * 成功添加的 CacheNode ID 列表
    */
    private List<String> cacheNodeIds;

    public List<String> getCacheNodeIds() {
        return cacheNodeIds;
    }

    public AddCacheNodesResponse setCacheNodeIds(List<String> cacheNodeIds) {
        this.cacheNodeIds = cacheNodeIds;
        return this;
    }

    @Override
    public String toString() {
        return "AddCacheNodesResponse{" + "cacheNodeIds=" + cacheNodeIds + "\n" + "}";
    }

}
