package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainAListOfPermanentlyValidApikeysResponse extends BaseBceResponse {

    /**
    * 成功标识
    */
    private Boolean success;

    /**
    * 状态码
    */
    private Integer status;

    /**
    * page
    */
    private Page page;

    public Boolean getSuccess() {
        return success;
    }

    public ObtainAListOfPermanentlyValidApikeysResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public ObtainAListOfPermanentlyValidApikeysResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public ObtainAListOfPermanentlyValidApikeysResponse setPage(Page page) {
        this.page = page;
        return this;
    }

    @Override
    public String toString() {
        return "ObtainAListOfPermanentlyValidApikeysResponse{" + "success=" + success + "\n" + "status=" + status + "\n" + "page=" + page + "\n" + "}";
    }

}
