package com.baidubce.apm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApmDescribeAlarmPoliciesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 状态码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 策略列表
    */
    private List<AlarmPolicyDetail> policies;

    /**
    * 第几页
    */
    private Integer pageNo;

    /**
    * 每页展示数量
    */
    private Integer pageSize;

    /**
    * 总数
    */
    private Integer totalCount;

    public Boolean getSuccess() {
        return success;
    }

    public ApmDescribeAlarmPoliciesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ApmDescribeAlarmPoliciesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApmDescribeAlarmPoliciesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<AlarmPolicyDetail> getPolicies() {
        return policies;
    }

    public ApmDescribeAlarmPoliciesResponse setPolicies(List<AlarmPolicyDetail> policies) {
        this.policies = policies;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ApmDescribeAlarmPoliciesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ApmDescribeAlarmPoliciesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public ApmDescribeAlarmPoliciesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "ApmDescribeAlarmPoliciesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "policies=" + policies + "\n" + "pageNo="
                + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
