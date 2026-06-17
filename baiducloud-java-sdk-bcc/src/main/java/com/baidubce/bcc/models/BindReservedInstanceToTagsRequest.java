package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BindReservedInstanceToTagsRequest extends BaseBceRequest {

    /**
    * 预留实例券ID列表，单次最多100个。
    */
    private List<String> reservedInstanceIds;

    /**
    * 待绑定的标签列表，具体数据格式参见TagModel。
    */
    private List<TagModel> changeTags;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public BindReservedInstanceToTagsRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public BindReservedInstanceToTagsRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
