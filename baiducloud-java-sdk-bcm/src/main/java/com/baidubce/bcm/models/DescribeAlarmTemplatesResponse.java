package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAlarmTemplatesResponse extends BaseBceResponse {

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
    * 当前页码
    */
    private Integer pageNo;

    /**
    * 每页条数
    */
    private Integer pageSize;

    /**
    * 总记录数
    */
    private Integer totalCount;

    /**
    * 报警模板列表
    */
    private List<AlarmTemplate> alarmTemplates;

    /**
    * 报警模板ID
    */
    private String alarmTemplatesId;

    /**
    * 云产品类型
    */
    private String alarmTemplatesScope;

    /**
    * 资源类型
    */
    private String alarmTemplatesResourceType;

    /**
    * 子资源类型
    */
    private String alarmTemplatesSubResourceType;

    /**
    * 模板名称
    */
    private String alarmTemplatesName;

    /**
    * 备注信息
    */
    private String alarmTemplatesComment;

    /**
    * 报警规则列表
    */
    private List<AlarmRule> alarmTemplatesRules;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeAlarmTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeAlarmTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeAlarmTemplatesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeAlarmTemplatesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeAlarmTemplatesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeAlarmTemplatesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<AlarmTemplate> getAlarmTemplates() {
        return alarmTemplates;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplates(List<AlarmTemplate> alarmTemplates) {
        this.alarmTemplates = alarmTemplates;
        return this;
    }

    public String getAlarmTemplatesId() {
        return alarmTemplatesId;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesId(String alarmTemplatesId) {
        this.alarmTemplatesId = alarmTemplatesId;
        return this;
    }

    public String getAlarmTemplatesScope() {
        return alarmTemplatesScope;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesScope(String alarmTemplatesScope) {
        this.alarmTemplatesScope = alarmTemplatesScope;
        return this;
    }

    public String getAlarmTemplatesResourceType() {
        return alarmTemplatesResourceType;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesResourceType(String alarmTemplatesResourceType) {
        this.alarmTemplatesResourceType = alarmTemplatesResourceType;
        return this;
    }

    public String getAlarmTemplatesSubResourceType() {
        return alarmTemplatesSubResourceType;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesSubResourceType(String alarmTemplatesSubResourceType) {
        this.alarmTemplatesSubResourceType = alarmTemplatesSubResourceType;
        return this;
    }

    public String getAlarmTemplatesName() {
        return alarmTemplatesName;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesName(String alarmTemplatesName) {
        this.alarmTemplatesName = alarmTemplatesName;
        return this;
    }

    public String getAlarmTemplatesComment() {
        return alarmTemplatesComment;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesComment(String alarmTemplatesComment) {
        this.alarmTemplatesComment = alarmTemplatesComment;
        return this;
    }

    public List<AlarmRule> getAlarmTemplatesRules() {
        return alarmTemplatesRules;
    }

    public DescribeAlarmTemplatesResponse setAlarmTemplatesRules(List<AlarmRule> alarmTemplatesRules) {
        this.alarmTemplatesRules = alarmTemplatesRules;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAlarmTemplatesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "pageNo=" + pageNo + "\n" + "pageSize="
                + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "alarmTemplates=" + alarmTemplates + "\n" + "alarmTemplatesId=" + alarmTemplatesId + "\n"
                + "alarmTemplatesScope=" + alarmTemplatesScope + "\n" + "alarmTemplatesResourceType=" + alarmTemplatesResourceType + "\n" + "alarmTemplatesSubResourceType="
                + alarmTemplatesSubResourceType + "\n" + "alarmTemplatesName=" + alarmTemplatesName + "\n" + "alarmTemplatesComment=" + alarmTemplatesComment + "\n"
                + "alarmTemplatesRules=" + alarmTemplatesRules + "\n" + "}";
    }

}
