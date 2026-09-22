package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupForbidWriteRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 禁写标识（false 未禁写 true 禁写）
    */
    private Boolean forbidWriteFlag;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupForbidWriteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public Boolean getForbidWriteFlag() {
        return forbidWriteFlag;
    }

    public HotGroupForbidWriteRequest setForbidWriteFlag(Boolean forbidWriteFlag) {
        this.forbidWriteFlag = forbidWriteFlag;
        return this;
    }

}
