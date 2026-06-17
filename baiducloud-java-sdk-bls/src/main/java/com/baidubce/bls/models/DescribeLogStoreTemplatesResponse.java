package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLogStoreTemplatesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 请求成功为空，失败为具体的错误信息
    */
    private String message;

    /**
    * 模板列表
    */
    private List<Template> templates;

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

    public DescribeLogStoreTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeLogStoreTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DescribeLogStoreTemplatesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public DescribeLogStoreTemplatesResponse setTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DescribeLogStoreTemplatesResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeLogStoreTemplatesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DescribeLogStoreTemplatesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLogStoreTemplatesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "templates=" + templates + "\n"
                + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "totalCount=" + totalCount + "\n" + "}";
    }

}
