package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupModifyBnsgroupRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * BNS Group
    */
    private String bnsGroup;

    public String getGroupId() {
        return groupId;
    }

    public SyncGroupModifyBnsgroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getBnsGroup() {
        return bnsGroup;
    }

    public SyncGroupModifyBnsgroupRequest setBnsGroup(String bnsGroup) {
        this.bnsGroup = bnsGroup;
        return this;
    }

}
