package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchDeleteImageCachesRequest extends BaseBceRequest {

    /**
    * 需要被删除的镜像缓存ID列表
    */
    private List<String> imageCacheIds;

    public List<String> getImageCacheIds() {
        return imageCacheIds;
    }

    public BatchDeleteImageCachesRequest setImageCacheIds(List<String> imageCacheIds) {
        this.imageCacheIds = imageCacheIds;
        return this;
    }

}
