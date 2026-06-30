package com.baidubce.bci.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListImageCachesResponse extends BaseBceResponse {

    /**
    * 当前用户空间下镜像缓存数目
    */
    private Integer totalCount;

    /**
    * 当前查询页
    */
    private Integer pageNo;

    /**
    * 当前查询页的镜像缓存条目数量
    */
    private Integer pageSize;

    /**
    * 镜像缓存信息列表
    */
    private List<ImageCacheModel> result;

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListImageCachesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListImageCachesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListImageCachesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<ImageCacheModel> getResult() {
        return result;
    }

    public ListImageCachesResponse setResult(List<ImageCacheModel> result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "ListImageCachesResponse{" + "totalCount=" + totalCount + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "result=" + result + "\n" + "}";
    }

}
