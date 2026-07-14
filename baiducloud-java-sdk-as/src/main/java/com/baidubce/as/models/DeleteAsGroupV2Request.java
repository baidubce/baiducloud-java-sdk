package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAsGroupV2Request extends BaseBceRequest {

    /**
    * 伸缩组id列表
    */
    private List<String> groupIds;

    public List<String> getGroupIds() {
        return groupIds;
    }

    public DeleteAsGroupV2Request setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

}
