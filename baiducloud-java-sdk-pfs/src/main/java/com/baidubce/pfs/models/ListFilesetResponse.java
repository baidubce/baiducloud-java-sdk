package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListFilesetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * fileset列表
    */
    private List<FilesetModel> result;

    /**
    * 页数
    */
    private Integer pageNo;

    /**
    * 页大小
    */
    private Integer pageSize;

    /**
    * 返回fileset list的总数量
    */
    private Integer totalCount;

    /**
    * 该用户可创建的fileset最大数量
    */
    private Integer maxFilesetNum;

    /**
    * 该用户可设置的fileset最大文件数配额
    */
    private Long maxFilesQuota;

    /**
    * 该用户可设置的fileset最小文件数配额
    */
    private Long minFilesQuota;

    public String getRequestId() {
        return requestId;
    }

    public ListFilesetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public List<FilesetModel> getResult() {
        return result;
    }

    public ListFilesetResponse setResult(List<FilesetModel> result) {
        this.result = result;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListFilesetResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListFilesetResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ListFilesetResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getMaxFilesetNum() {
        return maxFilesetNum;
    }

    public ListFilesetResponse setMaxFilesetNum(Integer maxFilesetNum) {
        this.maxFilesetNum = maxFilesetNum;
        return this;
    }

    public Long getMaxFilesQuota() {
        return maxFilesQuota;
    }

    public ListFilesetResponse setMaxFilesQuota(Long maxFilesQuota) {
        this.maxFilesQuota = maxFilesQuota;
        return this;
    }

    public Long getMinFilesQuota() {
        return minFilesQuota;
    }

    public ListFilesetResponse setMinFilesQuota(Long minFilesQuota) {
        this.minFilesQuota = minFilesQuota;
        return this;
    }

    @Override
    public String toString() {
        return "ListFilesetResponse{" + "requestId=" + requestId + "\n" + "result=" + result + "\n" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount="
                + totalCount + "\n" + "maxFilesetNum=" + maxFilesetNum + "\n" + "maxFilesQuota=" + maxFilesQuota + "\n" + "minFilesQuota=" + minFilesQuota + "\n" + "}";
    }

}
