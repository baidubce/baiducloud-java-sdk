package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeInstanceGroupsResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 实例组列表
    */
    private List<InstanceGroupSummary> instanceGroups;

    /**
    * 页码
    */
    private Integer pageNo;

    /**
    * 页大小
    */
    private Integer pageSize;

    /**
    * 总数量
    */
    private Integer totalCount;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeInstanceGroupsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeInstanceGroupsResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeInstanceGroupsResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<InstanceGroupSummary> getInstanceGroups() {
        return instanceGroups;
    }

    public DescribeInstanceGroupsResponse setInstanceGroups(List<InstanceGroupSummary> instanceGroups) {
        this.instanceGroups = instanceGroups;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeInstanceGroupsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeInstanceGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeInstanceGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeInstanceGroupsResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "instanceGroups=" + instanceGroups + "\n"
                + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
