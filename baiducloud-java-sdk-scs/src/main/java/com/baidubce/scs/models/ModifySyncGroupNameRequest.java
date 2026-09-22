package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifySyncGroupNameRequest extends BaseBceRequest {

    /**
    * syncGroupShowId
    */
    @JsonIgnore
    private String syncGroupShowId;

    /**
    * 修改后的实例组名称。
    */
    private String groupName;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public ModifySyncGroupNameRequest setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public ModifySyncGroupNameRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
