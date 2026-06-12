package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmPoliciesResponse extends BaseBceResponse {

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
    * 策略列表，每个元素结构同查询报警策略详情接口返回
    */
    private List<AlarmPolicy> policies;

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

    public DescribeAlarmPoliciesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeAlarmPoliciesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeAlarmPoliciesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<AlarmPolicy> getPolicies() {
        return policies;
    }

    public DescribeAlarmPoliciesResponse setPolicies(List<AlarmPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmPoliciesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmPoliciesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeAlarmPoliciesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmPoliciesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "policies=" + policies + "\n" + "pageNo="
                + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
