package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnbindReservedInstanceFromTagsRequest extends BaseBceRequest {

    /**
    * 预留实例券ID列表，单次最多100个。
    */
    private List<String> reservedInstanceIds;

    /**
    * 待解绑的标签列表。
    */
    private List<TagModel> changeTags;

    public List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    public UnbindReservedInstanceFromTagsRequest setReservedInstanceIds(List<String> reservedInstanceIds) {
        this.reservedInstanceIds = reservedInstanceIds;
        return this;
    }

    public List<TagModel> getChangeTags() {
        return changeTags;
    }

    public UnbindReservedInstanceFromTagsRequest setChangeTags(List<TagModel> changeTags) {
        this.changeTags = changeTags;
        return this;
    }

}
