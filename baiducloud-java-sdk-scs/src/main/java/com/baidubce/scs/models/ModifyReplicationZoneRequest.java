package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyReplicationZoneRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否维护时间内执行。 <li>true：维护时间内执行 <li>false：立即执行
    */
    private Boolean isDefer;

    /**
    * 副本信息。需全量的副本信息，可以修改可用区和子网。
    */
    private List<ReplicationItem> replicationInfo;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyReplicationZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public ModifyReplicationZoneRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

    public List<ReplicationItem> getReplicationInfo() {
        return replicationInfo;
    }

    public ModifyReplicationZoneRequest setReplicationInfo(List<ReplicationItem> replicationInfo) {
        this.replicationInfo = replicationInfo;
        return this;
    }

}
