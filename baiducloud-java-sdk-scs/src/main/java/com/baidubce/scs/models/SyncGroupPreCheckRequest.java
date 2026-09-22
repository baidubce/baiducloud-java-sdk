package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SyncGroupPreCheckRequest extends BaseBceRequest {

    /**
    * 多活实例组展示ID（新建校验时可不传）
    */
    private String syncGroupShowId;

    /**
    * 成员实例列表
    */
    private List<CheckSyncGroupRequestMember> members;

    public String getSyncGroupShowId() {
        return syncGroupShowId;
    }

    public SyncGroupPreCheckRequest setSyncGroupShowId(String syncGroupShowId) {
        this.syncGroupShowId = syncGroupShowId;
        return this;
    }

    public List<CheckSyncGroupRequestMember> getMembers() {
        return members;
    }

    public SyncGroupPreCheckRequest setMembers(List<CheckSyncGroupRequestMember> members) {
        this.members = members;
        return this;
    }

}
