package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseInstanceResponse extends BaseBceResponse {

    /**
    * 释放是否成功。true：成功，false：失败
    */
    private Boolean success;

    /**
    * 提示信息，成功时为 null
    */
    private String message;

    /**
    * 释放失败的实例ID列表，全部成功时为空数组
    */
    private List<String> releaseFailedInstanceIds;

    public Boolean getSuccess() {
        return success;
    }

    public ReleaseInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ReleaseInstanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getReleaseFailedInstanceIds() {
        return releaseFailedInstanceIds;
    }

    public ReleaseInstanceResponse setReleaseFailedInstanceIds(List<String> releaseFailedInstanceIds) {
        this.releaseFailedInstanceIds = releaseFailedInstanceIds;
        return this;
    }

    @Override
    public String toString() {
        return "ReleaseInstanceResponse{" + "success=" + success + "\n" + "message=" + message + "\n" + "releaseFailedInstanceIds=" + releaseFailedInstanceIds + "\n" + "}";
    }

}
