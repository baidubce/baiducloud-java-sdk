package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobRequest extends BaseBceRequest {

    /**
    * 训练任务ID
    */
    private String jobId;

    /**
    * 是否需要详细信息，值为true时将返回Pod及历史Pod列表
    */
    private Boolean needDetail;

    public String getJobId() {
        return jobId;
    }

    public DescribeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public Boolean getNeedDetail() {
        return needDetail;
    }

    public DescribeJobRequest setNeedDetail(Boolean needDetail) {
        this.needDetail = needDetail;
        return this;
    }

}
