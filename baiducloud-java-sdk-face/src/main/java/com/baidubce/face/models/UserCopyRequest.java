package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserCopyRequest extends BaseBceRequest {

    /**
    * 用户ID，长度限制48B
    */
    @JsonProperty("user_id")
    private String userId;

    /**
    * 从指定组里复制信息
    */
    @JsonProperty("src_group_id")
    private String srcGroupId;

    /**
    * 需要添加用户的组id
    */
    @JsonProperty("dst_group_id")
    private String dstGroupId;

    public String getUserId() {
        return userId;
    }

    public UserCopyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSrcGroupId() {
        return srcGroupId;
    }

    public UserCopyRequest setSrcGroupId(String srcGroupId) {
        this.srcGroupId = srcGroupId;
        return this;
    }

    public String getDstGroupId() {
        return dstGroupId;
    }

    public UserCopyRequest setDstGroupId(String dstGroupId) {
        this.dstGroupId = dstGroupId;
        return this;
    }

}
