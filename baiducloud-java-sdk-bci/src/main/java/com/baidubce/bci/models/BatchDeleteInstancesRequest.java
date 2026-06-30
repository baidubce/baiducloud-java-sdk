package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchDeleteInstancesRequest extends BaseBceRequest {

    /**
    * 待删除的BCI实例ID列表
    */
    private List<String> instanceIds;

    /**
    * 释放关联资源（目前只有EIP资源），默认值：false
    */
    private Boolean relatedReleaseFlag;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public BatchDeleteInstancesRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public Boolean getRelatedReleaseFlag() {
        return relatedReleaseFlag;
    }

    public BatchDeleteInstancesRequest setRelatedReleaseFlag(Boolean relatedReleaseFlag) {
        this.relatedReleaseFlag = relatedReleaseFlag;
        return this;
    }

}
